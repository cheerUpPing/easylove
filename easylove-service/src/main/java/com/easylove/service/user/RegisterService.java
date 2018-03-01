package com.easylove.service.user;

import com.easylove.anotation.ServiceDesrAnt;
import com.easylove.entity.user.Register;
import com.easylove.mapper.user.RegisterMapper;
import com.easylove.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2017/2/8 15:40.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Service
public class RegisterService extends AbstractService<Register, Integer> {

    @Autowired
    private RegisterMapper registerMapper;

    @ServiceDesrAnt(descr = "通过电话号码查询")
    public Register selectByTel(String tel) {
        return registerMapper.selectByTel(tel);
    }

}
