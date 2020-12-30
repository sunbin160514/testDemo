package com.test.tools.demo.tools.service.impl;

import com.test.tools.demo.tools.annotation.DataSourceSign;
import com.test.tools.demo.tools.domain.CallCenterWork;
import com.test.tools.demo.tools.enums.ContextConst;
import com.test.tools.demo.tools.mapper.CallCenterWorkMapper;
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

}
