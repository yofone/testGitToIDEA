package com.test.mapper;

import com.test.dao.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Lan on 2017/5/11.
 */
@Component
public interface UserMapper {

    List<User> getAllUser();

}
