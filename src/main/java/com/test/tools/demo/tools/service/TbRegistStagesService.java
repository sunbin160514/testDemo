package com.test.tools.demo.tools.service;

import com.test.tools.demo.tools.domain.TbRegistStages;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 购课单表 服务类
 * </p>
 *
 * @author sunbin
 * @since 2020-11-19
 */
public interface TbRegistStagesService extends IService<TbRegistStages> {
    List<TbRegistStages> getParamsByRegistId(String registId);

    List<TbRegistStages> getScockIdByRegistIds(List<String> registIds);

    List<TbRegistStages> getStudentInfo(List<String> registIds);



}
