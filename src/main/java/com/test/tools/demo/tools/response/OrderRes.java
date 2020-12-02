package com.test.tools.demo.tools.response;

import java.util.List;

public class OrderRes {
    private PriceInfoBean priceInfo;
    private OrderAddressBean orderAddress;
    private long orderCreateTime;
    private String orderToken;
    private String orderNo;
    private String orderId;
    private boolean shouldMail;
    private int stuShouldRegFee;
    private Object orderPaymentTime;
    private String studentId;
    private int clientType;
    private int platform;
    private long createTime;
    private int expireTime;
    private List<PromotGroupsBean> promotGroups;
    private List<ExpenseDetailsBean> expenseDetails;

    public PriceInfoBean getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(PriceInfoBean priceInfo) {
        this.priceInfo = priceInfo;
    }

    public OrderAddressBean getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(OrderAddressBean orderAddress) {
        this.orderAddress = orderAddress;
    }

    public long getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(long orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderToken() {
        return orderToken;
    }

    public void setOrderToken(String orderToken) {
        this.orderToken = orderToken;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isShouldMail() {
        return shouldMail;
    }

    public void setShouldMail(boolean shouldMail) {
        this.shouldMail = shouldMail;
    }

    public int getStuShouldRegFee() {
        return stuShouldRegFee;
    }

    public void setStuShouldRegFee(int stuShouldRegFee) {
        this.stuShouldRegFee = stuShouldRegFee;
    }

    public Object getOrderPaymentTime() {
        return orderPaymentTime;
    }

    public void setOrderPaymentTime(Object orderPaymentTime) {
        this.orderPaymentTime = orderPaymentTime;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getClientType() {
        return clientType;
    }

    public void setClientType(int clientType) {
        this.clientType = clientType;
    }

    public int getPlatform() {
        return platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    public List<PromotGroupsBean> getPromotGroups() {
        return promotGroups;
    }

    public void setPromotGroups(List<PromotGroupsBean> promotGroups) {
        this.promotGroups = promotGroups;
    }

    public List<ExpenseDetailsBean> getExpenseDetails() {
        return expenseDetails;
    }

    public void setExpenseDetails(List<ExpenseDetailsBean> expenseDetails) {
        this.expenseDetails = expenseDetails;
    }

    public static class PriceInfoBean {
        /**
         * crAmount : 0
         * lastPrice : 450
         * drDiscount : 0
         * dcDiscount : 0
         * activityDiscount : 50
         * regFee : 0
         * passPrice : 500
         * sourcePrice : 500
         */

        private int crAmount;
        private int lastPrice;
        private int drDiscount;
        private int dcDiscount;
        private int activityDiscount;
        private int regFee;
        private int passPrice;
        private int sourcePrice;

        public int getCrAmount() {
            return crAmount;
        }

        public void setCrAmount(int crAmount) {
            this.crAmount = crAmount;
        }

        public int getLastPrice() {
            return lastPrice;
        }

        public void setLastPrice(int lastPrice) {
            this.lastPrice = lastPrice;
        }

        public int getDrDiscount() {
            return drDiscount;
        }

        public void setDrDiscount(int drDiscount) {
            this.drDiscount = drDiscount;
        }

        public int getDcDiscount() {
            return dcDiscount;
        }

        public void setDcDiscount(int dcDiscount) {
            this.dcDiscount = dcDiscount;
        }

        public int getActivityDiscount() {
            return activityDiscount;
        }

        public void setActivityDiscount(int activityDiscount) {
            this.activityDiscount = activityDiscount;
        }

        public int getRegFee() {
            return regFee;
        }

        public void setRegFee(int regFee) {
            this.regFee = regFee;
        }

        public int getPassPrice() {
            return passPrice;
        }

        public void setPassPrice(int passPrice) {
            this.passPrice = passPrice;
        }

        public int getSourcePrice() {
            return sourcePrice;
        }

        public void setSourcePrice(int sourcePrice) {
            this.sourcePrice = sourcePrice;
        }
    }

    public static class OrderAddressBean {
        /**
         * provinceId : 110000
         * provinceName : 北京市
         * cityId : 110100
         * cityName : 北京市
         * countyId : 110101
         * countyName : 东城区
         * detailAddress : 丹棱soho888层
         * postcode : 100000
         * mobilephoneNumber : 18300000000
         * phoneNumber :
         * recipientName : 测试大哥
         * studentAddressId :
         * orderAddrAvailable : true
         */

        private String provinceId;
        private String provinceName;
        private String cityId;
        private String cityName;
        private String countyId;
        private String countyName;
        private String detailAddress;
        private String postcode;
        private String mobilephoneNumber;
        private String phoneNumber;
        private String recipientName;
        private String studentAddressId;
        private boolean orderAddrAvailable;

        public String getProvinceId() {
            return provinceId;
        }

        public void setProvinceId(String provinceId) {
            this.provinceId = provinceId;
        }

        public String getProvinceName() {
            return provinceName;
        }

        public void setProvinceName(String provinceName) {
            this.provinceName = provinceName;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getCountyId() {
            return countyId;
        }

        public void setCountyId(String countyId) {
            this.countyId = countyId;
        }

        public String getCountyName() {
            return countyName;
        }

        public void setCountyName(String countyName) {
            this.countyName = countyName;
        }

        public String getDetailAddress() {
            return detailAddress;
        }

        public void setDetailAddress(String detailAddress) {
            this.detailAddress = detailAddress;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getMobilephoneNumber() {
            return mobilephoneNumber;
        }

        public void setMobilephoneNumber(String mobilephoneNumber) {
            this.mobilephoneNumber = mobilephoneNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getRecipientName() {
            return recipientName;
        }

        public void setRecipientName(String recipientName) {
            this.recipientName = recipientName;
        }

        public String getStudentAddressId() {
            return studentAddressId;
        }

        public void setStudentAddressId(String studentAddressId) {
            this.studentAddressId = studentAddressId;
        }

        public boolean isOrderAddrAvailable() {
            return orderAddrAvailable;
        }

        public void setOrderAddrAvailable(boolean orderAddrAvailable) {
            this.orderAddrAvailable = orderAddrAvailable;
        }
    }

    public static class PromotGroupsBean {
        /**
         * promotionId :
         * promotionName :
         * promotionDescription :
         * havePromotion : false
         * classes : [{"classId":"c8696691c0bf4aaf9f8067544dda8afa","className":"四年级地理寒假YY3","spend":500,"classType":1,"claBizType":0,"classDateName":"2021/11/27-2021/11/27","classTimeNames":"二期下午13:00-13:40","regContinue":false,"gradeName":"四年级","areaName":"虚拟地区（直播）","servicecenterName":"虚拟服务中心（直播）","venueName":"虚拟教学点（直播）","teacherHostName":null,"tutorId":"2b2aab83ee1c46d89b7f2d531c131c66","teacherIds":"fb1523eaf09b496886be6304dc8e19ee","tutorRealName":"王聪","courseId":"010-8yKuyF9NzXwF4utkyD9QoF","classroomName":"虚拟教室（直播）","registerId":"43996e1f3bb147ada582ae4abede23fd","activityId":null,"registTime":"2020-11-12 16:38:03","classCreateTime":"2021-11-27 00:00:00","shouldMail":true,"classCount":"1","passedCount":"0","changeFromGoodsRemainingPrice":-1,"changeFromGoodsId":"NOT_SET_ANYTHING","claCapacityLabel":1,"classTimeDisplay":"二期下午13:00-13:40","tutorPictureUrl":"http://teacher-center-avator-test.oss-cn-beijing.aliyuncs.com/fa6ed132be95048d2e518ccfd9008339.jpg","teachers":[{"teacherId":"fb1523eaf09b496886be6304dc8e19ee","teacherName":"刘君","name":"刘君","realName":"刘君","sex":0,"pictureUrl":"http://teacher-center-avator-test.oss-cn-beijing.aliyuncs.com/89a9f55aceb8ed41970372ab091bbfd2.jpg"}],"classCouponFacePrice":"0.0","couponPrice":0,"discount":1,"discountPrice":"0","off":"50","claPrice":"500.0","claRefFeePrice":"0.0","claActualRefFeePrice":"0","originalPrice":"500","shouldPrice":"500","actualPrice":"450","classActualPrice":450,"offPrice":"50","unitePrice":"0","classExpenseDetails":[{"name":"限时购","price":"50","positive":false,"discount":null}],"coupons":[],"promotions":[{"promotionId":"d748ebbdc3c643eb82b23b7bbbe34c7a","promotionName":"测试活动1116","promotionType":"15","promotionTypeName":"限时购","discount":1,"off":50,"price":50}],"goodsType":2,"stageId":"7e477a54fed04c53a4d6327bd20af074","stageNum":1,"stageName":"寒假","defStageStartCount":1,"defStageEndCount":1,"xesclassPlusCount":0,"stageStartTime":1637989200000,"stageEndTime":1637991600000,"definitionStagePrice":500,"registStageId":"9e98b0b6a37d4fbabadcb2ab8032a0b2","isBuyAllPassedCourse":0,"depositPrice":0,"usePreviousStagePromotion":false}]
         */

        private String promotionId;
        private String promotionName;
        private String promotionDescription;
        private boolean havePromotion;
        private List<ClassesBean> classes;

        public String getPromotionId() {
            return promotionId;
        }

        public void setPromotionId(String promotionId) {
            this.promotionId = promotionId;
        }

        public String getPromotionName() {
            return promotionName;
        }

        public void setPromotionName(String promotionName) {
            this.promotionName = promotionName;
        }

        public String getPromotionDescription() {
            return promotionDescription;
        }

        public void setPromotionDescription(String promotionDescription) {
            this.promotionDescription = promotionDescription;
        }

        public boolean isHavePromotion() {
            return havePromotion;
        }

        public void setHavePromotion(boolean havePromotion) {
            this.havePromotion = havePromotion;
        }

        public List<ClassesBean> getClasses() {
            return classes;
        }

        public void setClasses(List<ClassesBean> classes) {
            this.classes = classes;
        }

        public static class ClassesBean {
            /**
             * classId : c8696691c0bf4aaf9f8067544dda8afa
             * className : 四年级地理寒假YY3
             * spend : 500.0
             * classType : 1
             * claBizType : 0
             * classDateName : 2021/11/27-2021/11/27
             * classTimeNames : 二期下午13:00-13:40
             * regContinue : false
             * gradeName : 四年级
             * areaName : 虚拟地区（直播）
             * servicecenterName : 虚拟服务中心（直播）
             * venueName : 虚拟教学点（直播）
             * teacherHostName : null
             * tutorId : 2b2aab83ee1c46d89b7f2d531c131c66
             * teacherIds : fb1523eaf09b496886be6304dc8e19ee
             * tutorRealName : 王聪
             * courseId : 010-8yKuyF9NzXwF4utkyD9QoF
             * classroomName : 虚拟教室（直播）
             * registerId : 43996e1f3bb147ada582ae4abede23fd
             * activityId : null
             * registTime : 2020-11-12 16:38:03
             * classCreateTime : 2021-11-27 00:00:00
             * shouldMail : true
             * classCount : 1
             * passedCount : 0
             * changeFromGoodsRemainingPrice : -1
             * changeFromGoodsId : NOT_SET_ANYTHING
             * claCapacityLabel : 1
             * classTimeDisplay : 二期下午13:00-13:40
             * tutorPictureUrl : http://teacher-center-avator-test.oss-cn-beijing.aliyuncs.com/fa6ed132be95048d2e518ccfd9008339.jpg
             * teachers : [{"teacherId":"fb1523eaf09b496886be6304dc8e19ee","teacherName":"刘君","name":"刘君","realName":"刘君","sex":0,"pictureUrl":"http://teacher-center-avator-test.oss-cn-beijing.aliyuncs.com/89a9f55aceb8ed41970372ab091bbfd2.jpg"}]
             * classCouponFacePrice : 0.0
             * couponPrice : 0
             * discount : 1.0
             * discountPrice : 0
             * off : 50
             * claPrice : 500.0
             * claRefFeePrice : 0.0
             * claActualRefFeePrice : 0
             * originalPrice : 500
             * shouldPrice : 500
             * actualPrice : 450
             * classActualPrice : 450
             * offPrice : 50
             * unitePrice : 0
             * classExpenseDetails : [{"name":"限时购","price":"50","positive":false,"discount":null}]
             * coupons : []
             * promotions : [{"promotionId":"d748ebbdc3c643eb82b23b7bbbe34c7a","promotionName":"测试活动1116","promotionType":"15","promotionTypeName":"限时购","discount":1,"off":50,"price":50}]
             * goodsType : 2
             * stageId : 7e477a54fed04c53a4d6327bd20af074
             * stageNum : 1
             * stageName : 寒假
             * defStageStartCount : 1
             * defStageEndCount : 1
             * xesclassPlusCount : 0
             * stageStartTime : 1637989200000
             * stageEndTime : 1637991600000
             * definitionStagePrice : 500
             * registStageId : 9e98b0b6a37d4fbabadcb2ab8032a0b2
             * isBuyAllPassedCourse : 0
             * depositPrice : 0
             * usePreviousStagePromotion : false
             */

            private String classId;
            private String className;
            private double spend;
            private int classType;
            private int claBizType;
            private String classDateName;
            private String classTimeNames;
            private boolean regContinue;
            private String gradeName;
            private String areaName;
            private String servicecenterName;
            private String venueName;
            private Object teacherHostName;
            private String tutorId;
            private String teacherIds;
            private String tutorRealName;
            private String courseId;
            private String classroomName;
            private String registerId;
            private Object activityId;
            private String registTime;
            private String classCreateTime;
            private boolean shouldMail;
            private String classCount;
            private String passedCount;
            private int changeFromGoodsRemainingPrice;
            private String changeFromGoodsId;
            private int claCapacityLabel;
            private String classTimeDisplay;
            private String tutorPictureUrl;
            private String classCouponFacePrice;
            private int couponPrice;
            private double discount;
            private String discountPrice;
            private String off;
            private String claPrice;
            private String claRefFeePrice;
            private String claActualRefFeePrice;
            private String originalPrice;
            private String shouldPrice;
            private String actualPrice;
            private int classActualPrice;
            private String offPrice;
            private String unitePrice;
            private int goodsType;
            private String stageId;
            private int stageNum;
            private String stageName;
            private int defStageStartCount;
            private int defStageEndCount;
            private int xesclassPlusCount;
            private long stageStartTime;
            private long stageEndTime;
            private int definitionStagePrice;
            private String registStageId;
            private int isBuyAllPassedCourse;
            private int depositPrice;
            private boolean usePreviousStagePromotion;
            private List<TeachersBean> teachers;
            private List<ClassExpenseDetailsBean> classExpenseDetails;
            private List<?> coupons;
            private List<PromotionsBean> promotions;

            public String getClassId() {
                return classId;
            }

            public void setClassId(String classId) {
                this.classId = classId;
            }

            public String getClassName() {
                return className;
            }

            public void setClassName(String className) {
                this.className = className;
            }

            public double getSpend() {
                return spend;
            }

            public void setSpend(double spend) {
                this.spend = spend;
            }

            public int getClassType() {
                return classType;
            }

            public void setClassType(int classType) {
                this.classType = classType;
            }

            public int getClaBizType() {
                return claBizType;
            }

            public void setClaBizType(int claBizType) {
                this.claBizType = claBizType;
            }

            public String getClassDateName() {
                return classDateName;
            }

            public void setClassDateName(String classDateName) {
                this.classDateName = classDateName;
            }

            public String getClassTimeNames() {
                return classTimeNames;
            }

            public void setClassTimeNames(String classTimeNames) {
                this.classTimeNames = classTimeNames;
            }

            public boolean isRegContinue() {
                return regContinue;
            }

            public void setRegContinue(boolean regContinue) {
                this.regContinue = regContinue;
            }

            public String getGradeName() {
                return gradeName;
            }

            public void setGradeName(String gradeName) {
                this.gradeName = gradeName;
            }

            public String getAreaName() {
                return areaName;
            }

            public void setAreaName(String areaName) {
                this.areaName = areaName;
            }

            public String getServicecenterName() {
                return servicecenterName;
            }

            public void setServicecenterName(String servicecenterName) {
                this.servicecenterName = servicecenterName;
            }

            public String getVenueName() {
                return venueName;
            }

            public void setVenueName(String venueName) {
                this.venueName = venueName;
            }

            public Object getTeacherHostName() {
                return teacherHostName;
            }

            public void setTeacherHostName(Object teacherHostName) {
                this.teacherHostName = teacherHostName;
            }

            public String getTutorId() {
                return tutorId;
            }

            public void setTutorId(String tutorId) {
                this.tutorId = tutorId;
            }

            public String getTeacherIds() {
                return teacherIds;
            }

            public void setTeacherIds(String teacherIds) {
                this.teacherIds = teacherIds;
            }

            public String getTutorRealName() {
                return tutorRealName;
            }

            public void setTutorRealName(String tutorRealName) {
                this.tutorRealName = tutorRealName;
            }

            public String getCourseId() {
                return courseId;
            }

            public void setCourseId(String courseId) {
                this.courseId = courseId;
            }

            public String getClassroomName() {
                return classroomName;
            }

            public void setClassroomName(String classroomName) {
                this.classroomName = classroomName;
            }

            public String getRegisterId() {
                return registerId;
            }

            public void setRegisterId(String registerId) {
                this.registerId = registerId;
            }

            public Object getActivityId() {
                return activityId;
            }

            public void setActivityId(Object activityId) {
                this.activityId = activityId;
            }

            public String getRegistTime() {
                return registTime;
            }

            public void setRegistTime(String registTime) {
                this.registTime = registTime;
            }

            public String getClassCreateTime() {
                return classCreateTime;
            }

            public void setClassCreateTime(String classCreateTime) {
                this.classCreateTime = classCreateTime;
            }

            public boolean isShouldMail() {
                return shouldMail;
            }

            public void setShouldMail(boolean shouldMail) {
                this.shouldMail = shouldMail;
            }

            public String getClassCount() {
                return classCount;
            }

            public void setClassCount(String classCount) {
                this.classCount = classCount;
            }

            public String getPassedCount() {
                return passedCount;
            }

            public void setPassedCount(String passedCount) {
                this.passedCount = passedCount;
            }

            public int getChangeFromGoodsRemainingPrice() {
                return changeFromGoodsRemainingPrice;
            }

            public void setChangeFromGoodsRemainingPrice(int changeFromGoodsRemainingPrice) {
                this.changeFromGoodsRemainingPrice = changeFromGoodsRemainingPrice;
            }

            public String getChangeFromGoodsId() {
                return changeFromGoodsId;
            }

            public void setChangeFromGoodsId(String changeFromGoodsId) {
                this.changeFromGoodsId = changeFromGoodsId;
            }

            public int getClaCapacityLabel() {
                return claCapacityLabel;
            }

            public void setClaCapacityLabel(int claCapacityLabel) {
                this.claCapacityLabel = claCapacityLabel;
            }

            public String getClassTimeDisplay() {
                return classTimeDisplay;
            }

            public void setClassTimeDisplay(String classTimeDisplay) {
                this.classTimeDisplay = classTimeDisplay;
            }

            public String getTutorPictureUrl() {
                return tutorPictureUrl;
            }

            public void setTutorPictureUrl(String tutorPictureUrl) {
                this.tutorPictureUrl = tutorPictureUrl;
            }

            public String getClassCouponFacePrice() {
                return classCouponFacePrice;
            }

            public void setClassCouponFacePrice(String classCouponFacePrice) {
                this.classCouponFacePrice = classCouponFacePrice;
            }

            public int getCouponPrice() {
                return couponPrice;
            }

            public void setCouponPrice(int couponPrice) {
                this.couponPrice = couponPrice;
            }

            public double getDiscount() {
                return discount;
            }

            public void setDiscount(double discount) {
                this.discount = discount;
            }

            public String getDiscountPrice() {
                return discountPrice;
            }

            public void setDiscountPrice(String discountPrice) {
                this.discountPrice = discountPrice;
            }

            public String getOff() {
                return off;
            }

            public void setOff(String off) {
                this.off = off;
            }

            public String getClaPrice() {
                return claPrice;
            }

            public void setClaPrice(String claPrice) {
                this.claPrice = claPrice;
            }

            public String getClaRefFeePrice() {
                return claRefFeePrice;
            }

            public void setClaRefFeePrice(String claRefFeePrice) {
                this.claRefFeePrice = claRefFeePrice;
            }

            public String getClaActualRefFeePrice() {
                return claActualRefFeePrice;
            }

            public void setClaActualRefFeePrice(String claActualRefFeePrice) {
                this.claActualRefFeePrice = claActualRefFeePrice;
            }

            public String getOriginalPrice() {
                return originalPrice;
            }

            public void setOriginalPrice(String originalPrice) {
                this.originalPrice = originalPrice;
            }

            public String getShouldPrice() {
                return shouldPrice;
            }

            public void setShouldPrice(String shouldPrice) {
                this.shouldPrice = shouldPrice;
            }

            public String getActualPrice() {
                return actualPrice;
            }

            public void setActualPrice(String actualPrice) {
                this.actualPrice = actualPrice;
            }

            public int getClassActualPrice() {
                return classActualPrice;
            }

            public void setClassActualPrice(int classActualPrice) {
                this.classActualPrice = classActualPrice;
            }

            public String getOffPrice() {
                return offPrice;
            }

            public void setOffPrice(String offPrice) {
                this.offPrice = offPrice;
            }

            public String getUnitePrice() {
                return unitePrice;
            }

            public void setUnitePrice(String unitePrice) {
                this.unitePrice = unitePrice;
            }

            public int getGoodsType() {
                return goodsType;
            }

            public void setGoodsType(int goodsType) {
                this.goodsType = goodsType;
            }

            public String getStageId() {
                return stageId;
            }

            public void setStageId(String stageId) {
                this.stageId = stageId;
            }

            public int getStageNum() {
                return stageNum;
            }

            public void setStageNum(int stageNum) {
                this.stageNum = stageNum;
            }

            public String getStageName() {
                return stageName;
            }

            public void setStageName(String stageName) {
                this.stageName = stageName;
            }

            public int getDefStageStartCount() {
                return defStageStartCount;
            }

            public void setDefStageStartCount(int defStageStartCount) {
                this.defStageStartCount = defStageStartCount;
            }

            public int getDefStageEndCount() {
                return defStageEndCount;
            }

            public void setDefStageEndCount(int defStageEndCount) {
                this.defStageEndCount = defStageEndCount;
            }

            public int getXesclassPlusCount() {
                return xesclassPlusCount;
            }

            public void setXesclassPlusCount(int xesclassPlusCount) {
                this.xesclassPlusCount = xesclassPlusCount;
            }

            public long getStageStartTime() {
                return stageStartTime;
            }

            public void setStageStartTime(long stageStartTime) {
                this.stageStartTime = stageStartTime;
            }

            public long getStageEndTime() {
                return stageEndTime;
            }

            public void setStageEndTime(long stageEndTime) {
                this.stageEndTime = stageEndTime;
            }

            public int getDefinitionStagePrice() {
                return definitionStagePrice;
            }

            public void setDefinitionStagePrice(int definitionStagePrice) {
                this.definitionStagePrice = definitionStagePrice;
            }

            public String getRegistStageId() {
                return registStageId;
            }

            public void setRegistStageId(String registStageId) {
                this.registStageId = registStageId;
            }

            public int getIsBuyAllPassedCourse() {
                return isBuyAllPassedCourse;
            }

            public void setIsBuyAllPassedCourse(int isBuyAllPassedCourse) {
                this.isBuyAllPassedCourse = isBuyAllPassedCourse;
            }

            public int getDepositPrice() {
                return depositPrice;
            }

            public void setDepositPrice(int depositPrice) {
                this.depositPrice = depositPrice;
            }

            public boolean isUsePreviousStagePromotion() {
                return usePreviousStagePromotion;
            }

            public void setUsePreviousStagePromotion(boolean usePreviousStagePromotion) {
                this.usePreviousStagePromotion = usePreviousStagePromotion;
            }

            public List<TeachersBean> getTeachers() {
                return teachers;
            }

            public void setTeachers(List<TeachersBean> teachers) {
                this.teachers = teachers;
            }

            public List<ClassExpenseDetailsBean> getClassExpenseDetails() {
                return classExpenseDetails;
            }

            public void setClassExpenseDetails(List<ClassExpenseDetailsBean> classExpenseDetails) {
                this.classExpenseDetails = classExpenseDetails;
            }

            public List<?> getCoupons() {
                return coupons;
            }

            public void setCoupons(List<?> coupons) {
                this.coupons = coupons;
            }

            public List<PromotionsBean> getPromotions() {
                return promotions;
            }

            public void setPromotions(List<PromotionsBean> promotions) {
                this.promotions = promotions;
            }

            public static class TeachersBean {
                /**
                 * teacherId : fb1523eaf09b496886be6304dc8e19ee
                 * teacherName : 刘君
                 * name : 刘君
                 * realName : 刘君
                 * sex : 0
                 * pictureUrl : http://teacher-center-avator-test.oss-cn-beijing.aliyuncs.com/89a9f55aceb8ed41970372ab091bbfd2.jpg
                 */

                private String teacherId;
                private String teacherName;
                private String name;
                private String realName;
                private int sex;
                private String pictureUrl;

                public String getTeacherId() {
                    return teacherId;
                }

                public void setTeacherId(String teacherId) {
                    this.teacherId = teacherId;
                }

                public String getTeacherName() {
                    return teacherName;
                }

                public void setTeacherName(String teacherName) {
                    this.teacherName = teacherName;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public int getSex() {
                    return sex;
                }

                public void setSex(int sex) {
                    this.sex = sex;
                }

                public String getPictureUrl() {
                    return pictureUrl;
                }

                public void setPictureUrl(String pictureUrl) {
                    this.pictureUrl = pictureUrl;
                }
            }

            public static class ClassExpenseDetailsBean {
                /**
                 * name : 限时购
                 * price : 50
                 * positive : false
                 * discount : null
                 */

                private String name;
                private String price;
                private boolean positive;
                private Object discount;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public boolean isPositive() {
                    return positive;
                }

                public void setPositive(boolean positive) {
                    this.positive = positive;
                }

                public Object getDiscount() {
                    return discount;
                }

                public void setDiscount(Object discount) {
                    this.discount = discount;
                }
            }

            public static class PromotionsBean {
                /**
                 * promotionId : d748ebbdc3c643eb82b23b7bbbe34c7a
                 * promotionName : 测试活动1116
                 * promotionType : 15
                 * promotionTypeName : 限时购
                 * discount : 1.0
                 * off : 50
                 * price : 50
                 */

                private String promotionId;
                private String promotionName;
                private String promotionType;
                private String promotionTypeName;
                private double discount;
                private int off;
                private int price;

                public String getPromotionId() {
                    return promotionId;
                }

                public void setPromotionId(String promotionId) {
                    this.promotionId = promotionId;
                }

                public String getPromotionName() {
                    return promotionName;
                }

                public void setPromotionName(String promotionName) {
                    this.promotionName = promotionName;
                }

                public String getPromotionType() {
                    return promotionType;
                }

                public void setPromotionType(String promotionType) {
                    this.promotionType = promotionType;
                }

                public String getPromotionTypeName() {
                    return promotionTypeName;
                }

                public void setPromotionTypeName(String promotionTypeName) {
                    this.promotionTypeName = promotionTypeName;
                }

                public double getDiscount() {
                    return discount;
                }

                public void setDiscount(double discount) {
                    this.discount = discount;
                }

                public int getOff() {
                    return off;
                }

                public void setOff(int off) {
                    this.off = off;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }
            }
        }
    }

    public static class ExpenseDetailsBean {
        /**
         * name : 应缴学费
         * price : 500
         * positive : true
         * discount : null
         */

        private String name;
        private String price;
        private boolean positive;
        private Object discount;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public boolean isPositive() {
            return positive;
        }

        public void setPositive(boolean positive) {
            this.positive = positive;
        }

        public Object getDiscount() {
            return discount;
        }

        public void setDiscount(Object discount) {
            this.discount = discount;
        }
    }
}
