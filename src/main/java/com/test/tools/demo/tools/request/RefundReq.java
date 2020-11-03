package com.test.tools.demo.tools.request;

import java.util.List;

public class RefundReq {

    private String registId;
    private String studentId;
    private int cflat;
    private String reasonId;
    private String reasonName;
    private String operatorId;
    private String serviceCenterId;
    private int repairRefundNo;
    private int noNeedDeductMaterials;
    private List<Integer> moreRefundCurriculumNums;
    private List<?> lessRefundCurriculumNums;

    public String getRegistId() {
        return registId;
    }

    public void setRegistId(String registId) {
        this.registId = registId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getCflat() {
        return cflat;
    }

    public void setCflat(int cflat) {
        this.cflat = cflat;
    }

    public String getReasonId() {
        return reasonId;
    }

    public void setReasonId(String reasonId) {
        this.reasonId = reasonId;
    }

    public String getReasonName() {
        return reasonName;
    }

    public void setReasonName(String reasonName) {
        this.reasonName = reasonName;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getServiceCenterId() {
        return serviceCenterId;
    }

    public void setServiceCenterId(String serviceCenterId) {
        this.serviceCenterId = serviceCenterId;
    }

    public int getRepairRefundNo() {
        return repairRefundNo;
    }

    public void setRepairRefundNo(int repairRefundNo) {
        this.repairRefundNo = repairRefundNo;
    }

    public int getNoNeedDeductMaterials() {
        return noNeedDeductMaterials;
    }

    public void setNoNeedDeductMaterials(int noNeedDeductMaterials) {
        this.noNeedDeductMaterials = noNeedDeductMaterials;
    }

    public List<Integer> getMoreRefundCurriculumNums() {
        return moreRefundCurriculumNums;
    }

    public void setMoreRefundCurriculumNums(List<Integer> moreRefundCurriculumNums) {
        this.moreRefundCurriculumNums = moreRefundCurriculumNums;
    }

    public List<?> getLessRefundCurriculumNums() {
        return lessRefundCurriculumNums;
    }

    public void setLessRefundCurriculumNums(List<?> lessRefundCurriculumNums) {
        this.lessRefundCurriculumNums = lessRefundCurriculumNums;
    }
}
