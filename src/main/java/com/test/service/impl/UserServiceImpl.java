package com.test.service.impl;

import com.test.dao.User;
import com.test.mapper.UserMapper;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Lan on 2017/5/11.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
