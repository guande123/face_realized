package com.demo.zgd.mfacerealized;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.baidu.aip.face.AipFace;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    //设置APPID/AK/SK
    public static final String APP_ID = "9538940";
    public static final String API_KEY = "PIqQA7BirYcm1pMz5z4UDdP2";
    public static final String SECRET_KEY = "76uyLEQV3zGnTuBUYiurx0GBSiM80DVu";
    private static final int HANDLER_OK =1003 ;
    private static final String TAG ="MainActivity" ;
    private static final int IMG_REQUEST_CODE =1200 ;
    private Button mRealizedBtn;
    private Button mOpenGallery;
    private ImageView mFaceImg;
    private FocusFace mFocusFace;
    private Handler mHandler;
    private FaceInfoEntity mFaceInfo;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initHandler();
        initViews();
        // 初始化一个FaceClient
       final AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);
        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        // 调用API
        //image 文件存放于drawable 与mipmap 的区别 ：drawable需要密度转换。这里选择mipmap目录
        //此处的drawable density 为1.5 换算却是 dpi = pixels/3  ？？？
        mRealizedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        byte[] bytes = getBitmapByte();
                        HashMap<String,String> map  = new HashMap<String, String>();
                        map.put("face_fields","age,beauty,expression,faceshape,gender,glasses,landmark,race,qualities");
                        JSONObject res = client.detect(bytes,map );
                        System.out.println(res.toString());
                        Gson gson = new Gson();
                        mFaceInfo =  gson.fromJson(res.toString(),FaceInfoEntity.class);
                        Message msg = new Message();
                        msg.what =HANDLER_OK;
                        mHandler.sendMessage(msg);
                    }
                }).start();
            }
        });
    mOpenGallery.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(
                    Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, IMG_REQUEST_CODE);
        }
    });
//测试屏幕密度，像素，分辨率
//        testDisplayMetrics();
 }

    private void initViews() {
        mRealizedBtn = (Button) findViewById(R.id.realized_btn);
        mFaceImg = (ImageView) findViewById(R.id.face_img);
        mFocusFace = (FocusFace) findViewById(R.id.face_kuang);
        mOpenGallery = (Button) findViewById(R.id.open_gallery_btn);

    }

    private void testDisplayMetrics() {
    DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);//display = getWindowManager().getDefaultDisplay();display.getMetrics(dm)（把屏幕尺寸信息赋值给DisplayMetrics dm）;
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        float xdpi = dm.xdpi;
        float ydpi = dm.ydpi;
        float density = dm.densityDpi;
        float fdensity = dm.density;
        Log.i(TAG," widthPixels:"+width);
        Log.i(TAG," heightPixels:"+height);
        Log.i(TAG," xdpi:"+xdpi);
        Log.i(TAG," ydpi:"+ydpi);
        Log.i(TAG," desityDpi:"+density);
        Log.i(TAG," fdesityd:"+fdensity);
    }

    private void initHandler() {
      mHandler = new  Handler(new Handler.Callback() {
          @Override
          public boolean handleMessage(Message msg) {
             if(msg.what == HANDLER_OK){
                 Log.i("MainActivity","handler callback ,mFocusFace onDraw");
                 // Rect(int left, int top, int right, int bottom)
                 //"location":{"left":129,"height":155,"width":162,"top":157}
                 FaceInfoEntity.ResultBean resultBean = mFaceInfo.getResult().get(0);
                 FaceInfoEntity.ResultBean.LocationBean locationBean  = resultBean.getLocation();
                 int mLeft = locationBean.getLeft();
                 int mTop = locationBean.getTop();
                 int right = (mLeft+locationBean.getWidth());
                 int bottom = (mTop+locationBean.getHeight());
                 mFocusFace.drawRect(new Rect(mLeft,mTop, right,bottom));
             }
              return true;
          }
      });
    }

    public byte[] getBitmapByte() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.cluo);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG,100,baos);
        byte[] bytes = baos.toByteArray();
        return bytes;
    }
}
