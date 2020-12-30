package com.test.tools.demo.tools.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.tools.demo.tools.domain.RegistStages;

import java.util.List;

public interface RegistStagesMapper extends BaseMapper<RegistStages> {



    List<RegistStages> queryParamsByRegistId(String registId );
}
