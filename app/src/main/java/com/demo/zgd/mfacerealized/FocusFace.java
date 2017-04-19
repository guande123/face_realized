package com.demo.zgd.mfacerealized;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/4/18 0018.
 */

public class FocusFace extends View {
    private Paint mPaint;
    private Rect mRect;
    public FocusFace(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(mRect!=null){
            canvas.drawRect(mRect,mPaint);
        }

    }

    public void drawRect(Rect rect){
         mRect = rect;
        invalidate();
    }
}
