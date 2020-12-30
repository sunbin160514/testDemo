package com.test.tools.demo.tools.mapper;

import com.test.tools.demo.tools.domain.WorkNumber;


public interface WorkNumberMapper {
    WorkNumber Sel(int type);

    void insert(WorkNumber workNumber);

}
