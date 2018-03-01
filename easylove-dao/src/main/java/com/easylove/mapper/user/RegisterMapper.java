package com.easylove.mapper.user;

import com.easylove.entity.user.Register;
import com.easylove.mapper.BaseMapper;

/**
 * 2017/2/8 15:17.
 * <p>
 * Email: cheerUpPing@163.com
 */
public interface RegisterMapper extends BaseMapper<Register, Integer> {

    Register selectByTel(String tel);

}
