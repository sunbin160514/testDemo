package com.test.tools.demo.tools.mapper;

import com.test.tools.demo.tools.domain.CallCenterWork;

import java.util.List;

public interface CallCenterWorkMapper {
    //    void workInsert(WorkNumber workNumber);
    void workInsert(CallCenterWork callCenterWork);

    List<CallCenterWork> queryByType(int type);

    List<CallCenterWork> queryByNumber(String workNumber);
}
