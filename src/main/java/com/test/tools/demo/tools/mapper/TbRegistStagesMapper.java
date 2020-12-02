package com.test.tools.demo.tools.mapper;

import com.test.tools.demo.tools.domain.TbRegistStages;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 购课单表 Mapper 接口
 * </p>
 *
 * @author sunbin
 * @since 2020-11-19
 */
public interface TbRegistStagesMapper extends BaseMapper<TbRegistStages> {
    public List<TbRegistStages> queryParamsByRegistId(String registId);

}
