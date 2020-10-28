package com.test.tools.demo.tools.request;

public class RefundReq {
    /**
     * registId : d355c023e5b1468aa8981e4db83e26b4
     * studentId : 9e9e512aa7d644dc802360b3f01cc453
     * cflat : 11
     * reasonId : otherReason1
     * reasonName : 其他
     * operatorId : trojan
     * serviceCenterId : 204B055EB978410E8F393527FAD80D74
     * repairRefundNo : 0
     * noNeedDeductMaterial : 1
     */

    private String registId;
    private String studentId;
    private int cflat;
    private String reasonId;
    private String reasonName;
    private String operatorId;
    private String serviceCenterId;
    private int repairRefundNo;
    private int noNeedDeductMaterial;

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

    public int getNoNeedDeductMaterial() {
        return noNeedDeductMaterial;
    }

    public void setNoNeedDeductMaterial(int noNeedDeductMaterial) {
        this.noNeedDeductMaterial = noNeedDeductMaterial;
    }
}
