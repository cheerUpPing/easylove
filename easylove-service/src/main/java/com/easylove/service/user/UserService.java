package com.easylove.service.user;

import com.easylove.entity.user.User;
import com.easylove.mapper.user.UserMapper;
import com.easylove.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2017/2/8 11:08.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Service
public class UserService extends AbstractService<User,String> {

    @Autowired
    private UserMapper userMapper;

    public void sayHello(){
        System.out.println("==============================");
    }


}
