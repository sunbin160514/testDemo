package com.test.tools.demo.tools.request;

import java.util.List;

public class OrderReq {
    private String businessNo;
    private String orderToken;
    private String orderNo;
    private String studentId;
    private String studentUid;
    private String clientType;
    private FusionOrderAddressDtoBean fusionOrderAddressDto;
    private List<ClassPromotionsBean> classPromotions;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderToken() {
        return orderToken;
    }

    public void setOrderToken(String orderToken) {
        this.orderToken = orderToken;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentUid() {
        return studentUid;
    }

    public void setStudentUid(String studentUid) {
        this.studentUid = studentUid;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public FusionOrderAddressDtoBean getFusionOrderAddressDto() {
        return fusionOrderAddressDto;
    }

    public void setFusionOrderAddressDto(FusionOrderAddressDtoBean fusionOrderAddressDto) {
        this.fusionOrderAddressDto = fusionOrderAddressDto;
    }

    public List<ClassPromotionsBean> getClassPromotions() {
        return classPromotions;
    }

    public void setClassPromotions(List<ClassPromotionsBean> classPromotions) {
        this.classPromotions = classPromotions;
    }

    public static class FusionOrderAddressDtoBean {
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
        private String orderAddrAvailable;

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

        public String getOrderAddrAvailable() {
            return orderAddrAvailable;
        }

        public void setOrderAddrAvailable(String orderAddrAvailable) {
            this.orderAddrAvailable = orderAddrAvailable;
        }
    }

    public static class ClassPromotionsBean {
        /**
         * registerId : 43996e1f3bb147ada582ae4abede23fd
         * classId : c8696691c0bf4aaf9f8067544dda8afa
         * doBundCoupons :
         * stockId : 9e98b0b6a37d4fbabadcb2ab8032a0b2
         * goodsType : 2
         * stockType :
         * plusCourseTimes :
         * coupons : [{"couponNum":""}]
         */

        private String registerId;
        private String classId;
        private String doBundCoupons;
        private String stockId;
        private String goodsType;
        private String stockType;
        private String plusCourseTimes;
        private List<CouponsBean> coupons;

        public String getRegisterId() {
            return registerId;
        }

        public void setRegisterId(String registerId) {
            this.registerId = registerId;
        }

        public String getClassId() {
            return classId;
        }

        public void setClassId(String classId) {
            this.classId = classId;
        }

        public String getDoBundCoupons() {
            return doBundCoupons;
        }

        public void setDoBundCoupons(String doBundCoupons) {
            this.doBundCoupons = doBundCoupons;
        }

        public String getStockId() {
            return stockId;
        }

        public void setStockId(String stockId) {
            this.stockId = stockId;
        }

        public String getGoodsType() {
            return goodsType;
        }

        public void setGoodsType(String goodsType) {
            this.goodsType = goodsType;
        }

        public String getStockType() {
            return stockType;
        }

        public void setStockType(String stockType) {
            this.stockType = stockType;
        }

        public String getPlusCourseTimes() {
            return plusCourseTimes;
        }

        public void setPlusCourseTimes(String plusCourseTimes) {
            this.plusCourseTimes = plusCourseTimes;
        }

        public List<CouponsBean> getCoupons() {
            return coupons;
        }

        public void setCoupons(List<CouponsBean> coupons) {
            this.coupons = coupons;
        }

        public static class CouponsBean {
            /**
             * couponNum :
             */

            private String couponNum;

            public String getCouponNum() {
                return couponNum;
            }

            public void setCouponNum(String couponNum) {
                this.couponNum = couponNum;
            }
        }
    }
}
