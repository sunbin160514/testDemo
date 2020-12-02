package com.test.tools.demo.tools.domain;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 购课单表
 * </p>
 *
 * @author sunbin
 * @since 2020-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbRegistStages implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 报名id
     */
    private String registId;

    /**
     * 学员id
     */
    private String studentId;

    /**
     * 学员uid
     */
    private String studentUid;

    /**
     * 班级id
     */
    private String classId;

    /**
     * 班级分期ID
     */
    private String classStageId;

    /**
     * 分期号，从1开始
     */
    private Integer stagesNum;

    /**
     * 是否已缴费,0:未缴费,1:已缴费
     */
    private Integer payed;

    /**
     * 分期内剩余课次数
     */
    private Integer curriculumCount;

    /**
     * 补课课次
     */
    private Integer addCurriculumCount;

    /**
     * 是否需要自动删除,0:不需要,1:需要
     */
    private Integer autoCancel;

    /**
     * 是否已删除,0:未删除,1:已删除
     */
    private Integer deleted;

    /**
     * 删除标记:未删除:000000,已删除为id
     */
    private String deletedSign;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 退费或者撤单时间
     */
    private LocalDateTime cancelTime;

    /**
     * 删除时间
     */
    private LocalDateTime deletedTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所在分校
     */
    private String orgCode;

    /**
     * 时间戳
     */
    private LocalDateTime tmTime;

    /**
     * 报名类型(0：正常报名；1：续报；2：跨班报；3：候补报名；4：预报名；)
     */
    private Integer isContinue;

    /**
     * 续报原班id
     */
    private String sourceClassId;


}
