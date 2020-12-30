package com.test.tools.demo.tools.service;


import com.test.tools.demo.tools.domain.CallCenterWork;

import java.util.List;

public interface CallCenterService {

    void workInsert(CallCenterWork callCenterWork);

    List<CallCenterWork> queryWorkByType(int type);

    List<CallCenterWork> queryWorkByNumber(String workNumber);


}
