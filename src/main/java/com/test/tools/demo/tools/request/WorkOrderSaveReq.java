package com.test.tools.demo.tools.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class WorkOrderSaveReq {
    private String studentId;
    private String studentName;
    private String areaCode;
    private String studentGrade;
    private int oldStudent;
    private int identity;
    private String phoneNumber;
    private int channel;
    private String businessType1;
    private String businessType2;
    private String businessType3;
    private String callRemind;
    private int processResult;
    private int processProgress;
    private String callbackPhone;
    private String callbackTime;
    private int type;
    private String subject;
    private String complaintDept;
    private String emergency;
    private int anonymous;
    private String productionType;
    private String creator;
    private String callLogId;
    private List<ContentListBean> contentList;
    private String schoolCallRemind;


    public static class ContentListBean {
        private String content;
        private int contentType;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getContentType() {
            return contentType;
        }

        public void setContentType(int contentType) {
            this.contentType = contentType;
        }
    }
}
