package com.test.tools.demo.tools.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.test.tools.demo.tools.domain.TbRegistStages;
import com.test.tools.demo.tools.mapper.TbRegistStagesMapper;
import com.test.tools.demo.tools.service.TbRegistStagesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 购课单表 服务实现类
 * </p>
 *
 * @author sunbin
 * @since 2020-11-19
 */
@Service
public class TbRegistStagesServiceImpl extends ServiceImpl<TbRegistStagesMapper, TbRegistStages> implements TbRegistStagesService {

//    @Autowired
//    private TbRegistStagesMapper mapper;   //通过mapper方式

    /**
     * 根据报名id查询购课单记录，返回所有字段
     *
     * @param registId
     * @return
     */

    public List<TbRegistStages> getParamsByRegistId(String registId) {
        QueryWrapper<TbRegistStages> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(TbRegistStages::getRegistId, registId);
        List<TbRegistStages> registStagesList = list(queryWrapper);
        return registStagesList;
    }

    /**
     * 根据报名id查询购课单记录，查询classId,id(购课单id)
     * @param registIds
     * @return
     */
    public List<TbRegistStages> getScockIdByRegistIds(List<String> registIds) {
        QueryWrapper<TbRegistStages> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().in(TbRegistStages::getRegistId, registIds).
                select(TbRegistStages::getId,TbRegistStages::getClassId,TbRegistStages::getStudentUid,TbRegistStages::getStudentId,TbRegistStages::getRegistId);
        List<TbRegistStages> list = list(queryWrapper);
        return list;
    }

    public List<TbRegistStages> getStudentInfo(List<String> registIds) {
        QueryWrapper<TbRegistStages> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().in(TbRegistStages::getRegistId, registIds).
                select(TbRegistStages::getStudentUid,TbRegistStages::getStudentId);
        List<TbRegistStages> list = list(queryWrapper);
        return list;
    }



}
