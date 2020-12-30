package com.test.tools.demo.tools.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("ACT_USER")
public class User {
    @TableId
    @TableField
    private Integer id;
    @TableField("USERNAME")
    private String username;
    @TableField("PASSWORD")
    private String password;
    @TableField("ROLE_ID")
    private Integer roleId;
}
