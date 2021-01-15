package com.test.tools.demo.tools.common;

import com.github.pagehelper.PageInfo;
import com.test.tools.demo.tools.request.PageReq;
import com.test.tools.demo.tools.response.PageResult;

public class PageUtils {
    /**
     * 将分页信息封装到统一的接口
     * @param pageRequest
     * @param
     * @return
     */
    public static PageResult getPageResult(PageReq pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
