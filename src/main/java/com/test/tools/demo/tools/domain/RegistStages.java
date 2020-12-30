package com.test.tools.demo.tools.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_regist_stages")
public class RegistStages {
    private String id;
    private String registId;
    private String studentId;
    private String studentUid;
    private String classId;

}
