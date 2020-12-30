package com.test.tools.demo.tools.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_test")
public class WorkNumber {
    private String id;
    private String workNumber;
    private int type;
    private String userNumber;

}
