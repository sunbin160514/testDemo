package com.test.tools.demo.tools.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.tools.demo.tools.domain.User;
import com.test.tools.demo.tools.mapper.PrimaryUserMapper;
import com.test.tools.demo.tools.service.ParmaryUserService;
import org.springframework.stereotype.Service;

@Service
public class ParmaryUserServiceImpl extends ServiceImpl<PrimaryUserMapper,User>
        implements ParmaryUserService {
//    @Autowired
//    private PrimaryUserMapper primaryUserMapper;
//
//    @Override
//    public List<User> sellPrimary(){
//        return primaryUserMapper.selectList(null);
//    }
//
//    @DataSourceSign(ContextConst.DataSourceType.PROD)
//    @Override
//    public List<User> sellProd() {
//        return primaryUserMapper.selectList(null);
//    }
//
//    @DataSourceSign(ContextConst.DataSourceType.LOCAL)
//    @Override
//    public List<User> sellLocal() {
//        return primaryUserMapper.selectList(null);
//    }
}
