package com.test.tools.demo.tools.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.tools.demo.tools.annotation.DataSourceSign;
import com.test.tools.demo.tools.common.PageUtils;
import com.test.tools.demo.tools.domain.CallCenterWork;
import com.test.tools.demo.tools.enums.ContextConst;
import com.test.tools.demo.tools.mapper.CallCenterWorkMapper;
import com.test.tools.demo.tools.request.PageReq;
import com.test.tools.demo.tools.response.PageResult;
import com.test.tools.demo.tools.service.CallCenterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CallCenterServiceImpl implements CallCenterService {
    @Autowired
    private CallCenterWorkMapper callCenterWorkMapper;

    @Override
    @DataSourceSign(ContextConst.DataSourceType.LOCAL)
    public void workInsert(CallCenterWork callCenterWork) {
        callCenterWorkMapper.workInsert(callCenterWork);
    }


    @Override
    @DataSourceSign(ContextConst.DataSourceType.LOCAL)
    public List<CallCenterWork> queryWorkByType(int type) {
        return callCenterWorkMapper.queryByType(type);
    }


    @Override
    @DataSourceSign(ContextConst.DataSourceType.LOCAL)
    public List<CallCenterWork> queryWorkByNumber(String workNumber) {
        return callCenterWorkMapper.queryByNumber(workNumber);
    }

    @Override
    @DataSourceSign(ContextConst.DataSourceType.LOCAL)
    public List<CallCenterWork> queryByParams(CallCenterWork callCenterWork){
        return callCenterWorkMapper.queryByParams(callCenterWork);
    }

    @Override
    @DataSourceSign(ContextConst.DataSourceType.LOCAL)
    public PageResult queryPage(PageReq pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }
    /**
     * 调用分页插件完成分页
     * @param
     * @return
     */
    private PageInfo<CallCenterWork> getPageInfo(PageReq pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<CallCenterWork> CallCenterWorkMenus = callCenterWorkMapper.queryPage(pageRequest);
        return new PageInfo<CallCenterWork>(CallCenterWorkMenus, 3);

    }

}
