package com.test.tools.demo.tools.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@TableName("call_center_work")
@Accessors(chain = true)
public class CallCenterWork {
    private int id;
    private String workNumber;
    private String oneClassify;
    private String twoClassify;
    private String threeClassify;
    private String creator;
    private int type;
    private String createTime;
}
