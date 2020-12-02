package com.test.tools.demo.tools.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.test.tools.demo.tools.domain.TbBookClass;
import com.test.tools.demo.tools.mapper.TbBookClassMapper;
import com.test.tools.demo.tools.service.TbBookClassService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sunbin
 * @since 2020-11-18
 */
@Service
public class TbBookClassServiceImpl extends ServiceImpl<TbBookClassMapper, TbBookClass> implements TbBookClassService {


    @Override
    public List<TbBookClass> getByRegisterId(String registerId) {
        QueryWrapper<TbBookClass> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(TbBookClass::getClassId, registerId).eq(TbBookClass::getBookGroupId, "");
        List<TbBookClass> bookClassList = list(queryWrapper);
        return bookClassList;
    }
}
