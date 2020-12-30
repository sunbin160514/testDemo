package com.test.tools.demo.tools.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.tools.demo.tools.domain.RegistStages;
import com.test.tools.demo.tools.mapper.RegistStagesMapper;
import com.test.tools.demo.tools.service.RegistStagesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistStagesServiceImpl extends ServiceImpl<RegistStagesMapper,RegistStages> implements RegistStagesService {


    /**
     * 根据报名id查询购课单记录，查询classId,id(购课单id)
     * @param registIds
     * @return
     */

   @Override
    public List<RegistStages> getScockIdByRegistIds(List<String> registIds) {
        QueryWrapper<RegistStages> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().in(RegistStages::getRegistId, registIds).
                select(RegistStages::getId, RegistStages::getClassId, RegistStages::getStudentUid, RegistStages::getStudentId, RegistStages::getRegistId);
        List<RegistStages> list = list(queryWrapper);
        return list;

    }





}
