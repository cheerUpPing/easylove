package com.easylove.mapper.user;

import com.easylove.entity.user.Person;
import com.easylove.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * 2017/2/8 15:17.
 * <p>
 * Email: cheerUpPing@163.com
 */
public interface PersonMapper extends BaseMapper<Person, Integer> {

    Person selectByTelOrEmail(@Param("tel") String tel, @Param("email") String email);

    Person updateByEmail(String email);

    Person updateByTel(String tel);

}
