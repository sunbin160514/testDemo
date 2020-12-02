package com.test.tools.demo.tools.service;

import com.test.tools.demo.tools.domain.TbBookClass;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sunbin
 * @since 2020-11-18
 */
public interface TbBookClassService extends IService<TbBookClass> {

    List<TbBookClass> getByRegisterId(String registerId);

}
