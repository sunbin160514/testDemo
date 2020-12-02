package com.test.tools.demo.tools.domain;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sunbin
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbBookClass implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String bookGroupId;

    private String classId;

    private String className;

    private Integer registState;

    private Integer priority;

    private String studentId;

    /**
     * 创建人
     */
    private String creator;

    private LocalDateTime createTime;

    /**
     * 最后修改人
     */
    private String modifier;

    /**
     * 最后修改时间
     */
    private LocalDateTime modifyTime;

    /**
     * 删除人
     */
    private String deleter;

    private LocalDateTime deletedTime;

    /**
     * 是否删除
     */
    private Integer deleted;

    private LocalDateTime tmTime;

    private String orgCode;

    private String studentUid;

    /**
     * 已删除数据的唯一索引
     */
    private String deletedSign;


}
