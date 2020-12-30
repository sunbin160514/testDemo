package com.test.tools.demo.tools.service.impl;

import com.test.tools.demo.tools.domain.WorkNumber;
import com.test.tools.demo.tools.mapper.WorkNumberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkNumberServiceImpl {
    @Autowired
    private WorkNumberMapper workNumberMapper;

    public WorkNumber Sel(int type){
        return workNumberMapper.Sel(type);
    }


//    @DataSourceSign(value = ContextConst.DataSourceType.LOCAL)
    public void  insert(WorkNumber workNumber){
//                数据库对象 = 结果构建的
//                        数据入库的操作

        workNumberMapper.insert(workNumber);
    }



}
