package com.test.tools.demo.tools.request;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class WorkOrderSaveReqs {
    private String businessType1;
    private String businessType2;
    private String businessType3;
    private String userNumber;
    private int type;

}
