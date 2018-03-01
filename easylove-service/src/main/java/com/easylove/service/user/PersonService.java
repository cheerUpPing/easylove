package com.easylove.service.user;

import com.easylove.entity.user.Person;
import com.easylove.mapper.user.PersonMapper;
import com.easylove.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2017/2/9 10:10.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Service
public class PersonService extends AbstractService<Person, Integer> {

    @Autowired
    private PersonMapper personMapper;

    public Person selectByTelOrEmail(String tel, String email) {
        return personMapper.selectByTelOrEmail(tel, email);
    }

    public Person updateByEmail(String email) {
        return personMapper.updateByEmail(email);
    }

    public Person updateByTel(String tel) {
        return personMapper.updateByTel(tel);
    }


}
