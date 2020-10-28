package com.test.tools.demo.tools.response;

import java.util.List;

public class SelectClassListRes {


    /**
     * havePromotion : false
     * items : [{"serverTime":1603772346251,"registId":"a64c95b0e6b54e7c886fa979dd5f4059","registStagesId":"7a2d2f850ea74ac6bab16938d8814152","registCreateTime":1602557021000,"continueRegist":false,"payTime":1600076460000,"classId":"df4cc3d7dcfa4842b99ffd0abae52677","stagesCount":2,"stagesNum":1,"stagesName":"秋季上","startCurriculumTime":1600124400000,"endCurriculumTime":1600311600000,"price":"1","batchRegist":false,"isAllCourse":0,"type":0,"payed":0,"needRxcs":false},{"serverTime":1603772346251,"registId":"a64c95b0e6b54e7c886fa979dd5f4059","registStagesId":"722b7f923ce34dc8a7ca6934e236548e","registCreateTime":1602557021000,"continueRegist":false,"payTime":1600076460000,"classId":"df4cc3d7dcfa4842b99ffd0abae52677","stagesCount":2,"stagesNum":2,"stagesName":"秋季下","startCurriculumTime":1600383600000,"endCurriculumTime":1600484400000,"price":"0","batchRegist":false,"isAllCourse":0,"type":0,"payed":0,"needRxcs":false}]
     */

    private boolean havePromotion;
    private List<ItemsBean> items;

    public boolean isHavePromotion() {
        return havePromotion;
    }

    public void setHavePromotion(boolean havePromotion) {
        this.havePromotion = havePromotion;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        /**
         * serverTime : 1603772346251
         * registId : a64c95b0e6b54e7c886fa979dd5f4059
         * registStagesId : 7a2d2f850ea74ac6bab16938d8814152
         * registCreateTime : 1602557021000
         * continueRegist : false
         * payTime : 1600076460000
         * classId : df4cc3d7dcfa4842b99ffd0abae52677
         * stagesCount : 2
         * stagesNum : 1
         * stagesName : 秋季上
         * startCurriculumTime : 1600124400000
         * endCurriculumTime : 1600311600000
         * price : 1
         * batchRegist : false
         * isAllCourse : 0
         * type : 0
         * payed : 0
         * needRxcs : false
         */

        private long serverTime;
        private String registId;
        private String registStagesId;
        private long registCreateTime;
        private boolean continueRegist;
        private long payTime;
        private String classId;
        private int stagesCount;
        private int stagesNum;
        private String stagesName;
        private long startCurriculumTime;
        private long endCurriculumTime;
        private String price;
        private boolean batchRegist;
        private int isAllCourse;
        private int type;
        private int payed;
        private boolean needRxcs;

        public long getServerTime() {
            return serverTime;
        }

        public void setServerTime(long serverTime) {
            this.serverTime = serverTime;
        }

        public String getRegistId() {
            return registId;
        }

        public void setRegistId(String registId) {
            this.registId = registId;
        }

        public String getRegistStagesId() {
            return registStagesId;
        }

        public void setRegistStagesId(String registStagesId) {
            this.registStagesId = registStagesId;
        }

        public long getRegistCreateTime() {
            return registCreateTime;
        }

        public void setRegistCreateTime(long registCreateTime) {
            this.registCreateTime = registCreateTime;
        }

        public boolean isContinueRegist() {
            return continueRegist;
        }

        public void setContinueRegist(boolean continueRegist) {
            this.continueRegist = continueRegist;
        }

        public long getPayTime() {
            return payTime;
        }

        public void setPayTime(long payTime) {
            this.payTime = payTime;
        }

        public String getClassId() {
            return classId;
        }

        public void setClassId(String classId) {
            this.classId = classId;
        }

        public int getStagesCount() {
            return stagesCount;
        }

        public void setStagesCount(int stagesCount) {
            this.stagesCount = stagesCount;
        }

        public int getStagesNum() {
            return stagesNum;
        }

        public void setStagesNum(int stagesNum) {
            this.stagesNum = stagesNum;
        }

        public String getStagesName() {
            return stagesName;
        }

        public void setStagesName(String stagesName) {
            this.stagesName = stagesName;
        }

        public long getStartCurriculumTime() {
            return startCurriculumTime;
        }

        public void setStartCurriculumTime(long startCurriculumTime) {
            this.startCurriculumTime = startCurriculumTime;
        }

        public long getEndCurriculumTime() {
            return endCurriculumTime;
        }

        public void setEndCurriculumTime(long endCurriculumTime) {
            this.endCurriculumTime = endCurriculumTime;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public boolean isBatchRegist() {
            return batchRegist;
        }

        public void setBatchRegist(boolean batchRegist) {
            this.batchRegist = batchRegist;
        }

        public int getIsAllCourse() {
            return isAllCourse;
        }

        public void setIsAllCourse(int isAllCourse) {
            this.isAllCourse = isAllCourse;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getPayed() {
            return payed;
        }

        public void setPayed(int payed) {
            this.payed = payed;
        }

        public boolean isNeedRxcs() {
            return needRxcs;
        }

        public void setNeedRxcs(boolean needRxcs) {
            this.needRxcs = needRxcs;
        }
    }
}
