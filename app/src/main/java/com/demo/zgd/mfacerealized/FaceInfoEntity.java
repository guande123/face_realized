package com.demo.zgd.mfacerealized;

import java.util.List;

/**
 * Created by Administrator on 2017/4/19 0019.
 */

public class FaceInfoEntity {

    /**
     * result_num : 1
     * result : [{"expression":0,"face_probability":0.87807637453079,"glasses":0,"location":{"left":55,"height":36,"width":43,"top":43},"landmark72":[{"y":49,"x":55},{"y":55,"x":55},{"y":60,"x":56},{"y":66,"x":58},{"y":72,"x":62},{"y":76,"x":67},{"y":79,"x":73},{"y":78,"x":80},{"y":75,"x":87},{"y":69,"x":93},{"y":62,"x":96},{"y":55,"x":97},{"y":49,"x":98},{"y":50,"x":59},{"y":49,"x":60},{"y":48,"x":62},{"y":49,"x":65},{"y":51,"x":66},{"y":52,"x":64},{"y":52,"x":62},{"y":51,"x":60},{"y":50,"x":63},{"y":45,"x":56},{"y":43,"x":58},{"y":43,"x":61},{"y":43,"x":64},{"y":45,"x":66},{"y":45,"x":64},{"y":45,"x":61},{"y":45,"x":58},{"y":51,"x":77},{"y":49,"x":79},{"y":48,"x":81},{"y":48,"x":83},{"y":50,"x":86},{"y":51,"x":84},{"y":52,"x":81},{"y":51,"x":79},{"y":50,"x":81},{"y":45,"x":76},{"y":43,"x":79},{"y":43,"x":82},{"y":43,"x":86},{"y":45,"x":89},{"y":44,"x":86},{"y":44,"x":82},{"y":45,"x":79},{"y":51,"x":69},{"y":55,"x":68},{"y":59,"x":68},{"y":63,"x":67},{"y":63,"x":69},{"y":63,"x":73},{"y":63,"x":76},{"y":59,"x":75},{"y":55,"x":74},{"y":51,"x":74},{"y":60,"x":70},{"y":70,"x":67},{"y":69,"x":69},{"y":68,"x":71},{"y":69,"x":75},{"y":69,"x":78},{"y":72,"x":75},{"y":73,"x":72},{"y":72,"x":69},{"y":70,"x":69},{"y":70,"x":72},{"y":70,"x":75},{"y":70,"x":75},{"y":70,"x":72},{"y":70,"x":69}],"beauty":31.121673583984,"race":"yellow","expression_probablity":0.99994683265686,"rotation_angle":0,"landmark":[{"y":50,"x":63},{"y":50,"x":81},{"y":60,"x":70},{"y":70,"x":72}],"yaw":9.5649347305298,"roll":-0.25362583994865,"qualities":{"completeness":0,"blur":0,"occlusion":{"left_eye":0,"left_cheek":0,"nose":0,"right_eye":0,"chin":0,"mouth":0,"right_cheek":0},"type":{"cartoon":0.021359015256166,"human":0.97864097356796},"illumination":0},"gender_probability":0.99942719936371,"age":12.707491874695,"gender":"female","glasses_probability":0.9999897480011,"faceshape":[{"type":"square","probability":0.025482673197985},{"type":"triangle","probability":0.0076563209295273},{"type":"oval","probability":0.02612392231822},{"type":"heart","probability":0.4293712079525},{"type":"round","probability":0.51136589050293}],"race_probability":0.9999692440033,"pitch":4.7913451194763}]
     * log_id : 2755012463
     */

    private int result_num;
    private long log_id;
    private List<ResultBean> result;

    public int getResult_num() {
        return result_num;
    }

    public void setResult_num(int result_num) {
        this.result_num = result_num;
    }

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * expression : 0
         * face_probability : 0.87807637453079
         * glasses : 0
         * location : {"left":55,"height":36,"width":43,"top":43}
         * landmark72 : [{"y":49,"x":55},{"y":55,"x":55},{"y":60,"x":56},{"y":66,"x":58},{"y":72,"x":62},{"y":76,"x":67},{"y":79,"x":73},{"y":78,"x":80},{"y":75,"x":87},{"y":69,"x":93},{"y":62,"x":96},{"y":55,"x":97},{"y":49,"x":98},{"y":50,"x":59},{"y":49,"x":60},{"y":48,"x":62},{"y":49,"x":65},{"y":51,"x":66},{"y":52,"x":64},{"y":52,"x":62},{"y":51,"x":60},{"y":50,"x":63},{"y":45,"x":56},{"y":43,"x":58},{"y":43,"x":61},{"y":43,"x":64},{"y":45,"x":66},{"y":45,"x":64},{"y":45,"x":61},{"y":45,"x":58},{"y":51,"x":77},{"y":49,"x":79},{"y":48,"x":81},{"y":48,"x":83},{"y":50,"x":86},{"y":51,"x":84},{"y":52,"x":81},{"y":51,"x":79},{"y":50,"x":81},{"y":45,"x":76},{"y":43,"x":79},{"y":43,"x":82},{"y":43,"x":86},{"y":45,"x":89},{"y":44,"x":86},{"y":44,"x":82},{"y":45,"x":79},{"y":51,"x":69},{"y":55,"x":68},{"y":59,"x":68},{"y":63,"x":67},{"y":63,"x":69},{"y":63,"x":73},{"y":63,"x":76},{"y":59,"x":75},{"y":55,"x":74},{"y":51,"x":74},{"y":60,"x":70},{"y":70,"x":67},{"y":69,"x":69},{"y":68,"x":71},{"y":69,"x":75},{"y":69,"x":78},{"y":72,"x":75},{"y":73,"x":72},{"y":72,"x":69},{"y":70,"x":69},{"y":70,"x":72},{"y":70,"x":75},{"y":70,"x":75},{"y":70,"x":72},{"y":70,"x":69}]
         * beauty : 31.121673583984
         * race : yellow
         * expression_probablity : 0.99994683265686
         * rotation_angle : 0
         * landmark : [{"y":50,"x":63},{"y":50,"x":81},{"y":60,"x":70},{"y":70,"x":72}]
         * yaw : 9.5649347305298
         * roll : -0.25362583994865
         * qualities : {"completeness":0,"blur":0,"occlusion":{"left_eye":0,"left_cheek":0,"nose":0,"right_eye":0,"chin":0,"mouth":0,"right_cheek":0},"type":{"cartoon":0.021359015256166,"human":0.97864097356796},"illumination":0}
         * gender_probability : 0.99942719936371
         * age : 12.707491874695
         * gender : female
         * glasses_probability : 0.9999897480011
         * faceshape : [{"type":"square","probability":0.025482673197985},{"type":"triangle","probability":0.0076563209295273},{"type":"oval","probability":0.02612392231822},{"type":"heart","probability":0.4293712079525},{"type":"round","probability":0.51136589050293}]
         * race_probability : 0.9999692440033
         * pitch : 4.7913451194763
         */

        private int expression;
        private double face_probability;
        private int glasses;
        private LocationBean location;
        private double beauty;
        private String race;
        private double expression_probablity;
        private int rotation_angle;
        private double yaw;
        private double roll;
        private QualitiesBean qualities;
        private double gender_probability;
        private double age;
        private String gender;
        private double glasses_probability;
        private double race_probability;
        private double pitch;
        private List<Landmark72Bean> landmark72;
        private List<LandmarkBean> landmark;
        private List<FaceshapeBean> faceshape;

        public int getExpression() {
            return expression;
        }

        public void setExpression(int expression) {
            this.expression = expression;
        }

        public double getFace_probability() {
            return face_probability;
        }

        public void setFace_probability(double face_probability) {
            this.face_probability = face_probability;
        }

        public int getGlasses() {
            return glasses;
        }

        public void setGlasses(int glasses) {
            this.glasses = glasses;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public double getBeauty() {
            return beauty;
        }

        public void setBeauty(double beauty) {
            this.beauty = beauty;
        }

        public String getRace() {
            return race;
        }

        public void setRace(String race) {
            this.race = race;
        }

        public double getExpression_probablity() {
            return expression_probablity;
        }

        public void setExpression_probablity(double expression_probablity) {
            this.expression_probablity = expression_probablity;
        }

        public int getRotation_angle() {
            return rotation_angle;
        }

        public void setRotation_angle(int rotation_angle) {
            this.rotation_angle = rotation_angle;
        }

        public double getYaw() {
            return yaw;
        }

        public void setYaw(double yaw) {
            this.yaw = yaw;
        }

        public double getRoll() {
            return roll;
        }

        public void setRoll(double roll) {
            this.roll = roll;
        }

        public QualitiesBean getQualities() {
            return qualities;
        }

        public void setQualities(QualitiesBean qualities) {
            this.qualities = qualities;
        }

        public double getGender_probability() {
            return gender_probability;
        }

        public void setGender_probability(double gender_probability) {
            this.gender_probability = gender_probability;
        }

        public double getAge() {
            return age;
        }

        public void setAge(double age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public double getGlasses_probability() {
            return glasses_probability;
        }

        public void setGlasses_probability(double glasses_probability) {
            this.glasses_probability = glasses_probability;
        }

        public double getRace_probability() {
            return race_probability;
        }

        public void setRace_probability(double race_probability) {
            this.race_probability = race_probability;
        }

        public double getPitch() {
            return pitch;
        }

        public void setPitch(double pitch) {
            this.pitch = pitch;
        }

        public List<Landmark72Bean> getLandmark72() {
            return landmark72;
        }

        public void setLandmark72(List<Landmark72Bean> landmark72) {
            this.landmark72 = landmark72;
        }

        public List<LandmarkBean> getLandmark() {
            return landmark;
        }

        public void setLandmark(List<LandmarkBean> landmark) {
            this.landmark = landmark;
        }

        public List<FaceshapeBean> getFaceshape() {
            return faceshape;
        }

        public void setFaceshape(List<FaceshapeBean> faceshape) {
            this.faceshape = faceshape;
        }

        public static class LocationBean {
            /**
             * left : 55
             * height : 36
             * width : 43
             * top : 43
             */

            private int left;
            private int height;
            private int width;
            private int top;

            public int getLeft() {
                return left;
            }

            public void setLeft(int left) {
                this.left = left;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getTop() {
                return top;
            }

            public void setTop(int top) {
                this.top = top;
            }
        }

        public static class QualitiesBean {
            /**
             * completeness : 0
             * blur : 0
             * occlusion : {"left_eye":0,"left_cheek":0,"nose":0,"right_eye":0,"chin":0,"mouth":0,"right_cheek":0}
             * type : {"cartoon":0.021359015256166,"human":0.97864097356796}
             * illumination : 0
             */

            private int completeness;
            private int blur;
            private OcclusionBean occlusion;
            private TypeBean type;
            private int illumination;

            public int getCompleteness() {
                return completeness;
            }

            public void setCompleteness(int completeness) {
                this.completeness = completeness;
            }

            public int getBlur() {
                return blur;
            }

            public void setBlur(int blur) {
                this.blur = blur;
            }

            public OcclusionBean getOcclusion() {
                return occlusion;
            }

            public void setOcclusion(OcclusionBean occlusion) {
                this.occlusion = occlusion;
            }

            public TypeBean getType() {
                return type;
            }

            public void setType(TypeBean type) {
                this.type = type;
            }

            public int getIllumination() {
                return illumination;
            }

            public void setIllumination(int illumination) {
                this.illumination = illumination;
            }

            public static class OcclusionBean {
                /**
                 * left_eye : 0
                 * left_cheek : 0
                 * nose : 0
                 * right_eye : 0
                 * chin : 0
                 * mouth : 0
                 * right_cheek : 0
                 */

                private int left_eye;
                private int left_cheek;
                private int nose;
                private int right_eye;
                private int chin;
                private int mouth;
                private int right_cheek;

                public int getLeft_eye() {
                    return left_eye;
                }

                public void setLeft_eye(int left_eye) {
                    this.left_eye = left_eye;
                }

                public int getLeft_cheek() {
                    return left_cheek;
                }

                public void setLeft_cheek(int left_cheek) {
                    this.left_cheek = left_cheek;
                }

                public int getNose() {
                    return nose;
                }

                public void setNose(int nose) {
                    this.nose = nose;
                }

                public int getRight_eye() {
                    return right_eye;
                }

                public void setRight_eye(int right_eye) {
                    this.right_eye = right_eye;
                }

                public int getChin() {
                    return chin;
                }

                public void setChin(int chin) {
                    this.chin = chin;
                }

                public int getMouth() {
                    return mouth;
                }

                public void setMouth(int mouth) {
                    this.mouth = mouth;
                }

                public int getRight_cheek() {
                    return right_cheek;
                }

                public void setRight_cheek(int right_cheek) {
                    this.right_cheek = right_cheek;
                }
            }

            public static class TypeBean {
                /**
                 * cartoon : 0.021359015256166
                 * human : 0.97864097356796
                 */

                private double cartoon;
                private double human;

                public double getCartoon() {
                    return cartoon;
                }

                public void setCartoon(double cartoon) {
                    this.cartoon = cartoon;
                }

                public double getHuman() {
                    return human;
                }

                public void setHuman(double human) {
                    this.human = human;
                }
            }
        }

        public static class Landmark72Bean {
            /**
             * y : 49
             * x : 55
             */

            private int y;
            private int x;

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }
        }

        public static class LandmarkBean {
            /**
             * y : 50
             * x : 63
             */

            private int y;
            private int x;

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }
        }

        public static class FaceshapeBean {
            /**
             * type : square
             * probability : 0.025482673197985
             */

            private String type;
            private double probability;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public double getProbability() {
                return probability;
            }

            public void setProbability(double probability) {
                this.probability = probability;
            }
        }
    }
}