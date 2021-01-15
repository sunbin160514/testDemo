package com.test.tools.demo.tools.mapper;

import com.test.tools.demo.tools.domain.CallCenterWork;
import com.test.tools.demo.tools.request.PageReq;

import java.util.List;

public interface CallCenterWorkMapper {

    void workInsert(CallCenterWork callCenterWork);

    List<CallCenterWork> queryByType(int type);

    List<CallCenterWork> queryByNumber(String workNumber);

    List<CallCenterWork> queryByParams(CallCenterWork callCenterWork);

    List<CallCenterWork> queryPage(PageReq pageReq);
}
