package com.test.tools.demo.tools.response;

import java.util.List;

public class RegistByClassIdRes {

    /**
     * pageSize : 20
     * pageNo : 1
     * totalCount : -1
     * rows : [{"id":"6adb00ba2cac462d821d88c04a9e1247","orgCode":"010","termId":"1","classId":"fcd2cfe49a984f0eac54881e2fc4070e","studentUid":"1020202301","studentId":"43cdf9e82b2948938cc4a326d91025b0","isPay":0,"regWay":0,"classType":4,"deleted":0},{"id":"81c92aea35a34991ab12896ed222ace8","orgCode":"010","termId":"1","classId":"fcd2cfe49a984f0eac54881e2fc4070e","studentUid":"1020203962","studentId":"5ba6b49bcdce40d68618f6049c6b1bbf","isPay":1,"regWay":0,"classType":4,"deleted":0}]
     * totalPage : 1
     */

    private int pageSize;
    private int pageNo;
    private int totalCount;
    private int totalPage;
    private List<RowsBean> rows;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<RowsBean> getRows() {
        return rows;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }

    public static class RowsBean {
        /**
         * id : 6adb00ba2cac462d821d88c04a9e1247
         * orgCode : 010
         * termId : 1
         * classId : fcd2cfe49a984f0eac54881e2fc4070e
         * studentUid : 1020202301
         * studentId : 43cdf9e82b2948938cc4a326d91025b0
         * isPay : 0
         * regWay : 0
         * classType : 4
         * deleted : 0
         */

        private String id;
        private String orgCode;
        private String termId;
        private String classId;
        private String studentUid;
        private String studentId;
        private int isPay;
        private int regWay;
        private int classType;
        private int deleted;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getOrgCode() {
            return orgCode;
        }

        public void setOrgCode(String orgCode) {
            this.orgCode = orgCode;
        }

        public String getTermId() {
            return termId;
        }

        public void setTermId(String termId) {
            this.termId = termId;
        }

        public String getClassId() {
            return classId;
        }

        public void setClassId(String classId) {
            this.classId = classId;
        }

        public String getStudentUid() {
            return studentUid;
        }

        public void setStudentUid(String studentUid) {
            this.studentUid = studentUid;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public int getIsPay() {
            return isPay;
        }

        public void setIsPay(int isPay) {
            this.isPay = isPay;
        }

        public int getRegWay() {
            return regWay;
        }

        public void setRegWay(int regWay) {
            this.regWay = regWay;
        }

        public int getClassType() {
            return classType;
        }

        public void setClassType(int classType) {
            this.classType = classType;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }
    }
}
