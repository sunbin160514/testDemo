package com.test.tools.demo.tools.request;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PageReq {
    /**
     * 当前页码
     */
    private int pageNum =1;
    /**
     * 每页数量
     */
    private int pageSize=10;
    /**
     * 工单类型
     */
    private int type;
    /**
     * 工单号
     */
    private String workNumber;
    /**
     * 创建人
     */
    private String creator;

}
