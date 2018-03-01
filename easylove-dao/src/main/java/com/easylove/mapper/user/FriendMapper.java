package com.easylove.mapper.user;

import com.easylove.entity.user.Friend;
import com.easylove.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * 2017/2/8 15:17.
 * <p>
 * Email: cheerUpPing@163.com
 */
public interface FriendMapper extends BaseMapper<Friend, Integer> {

    Friend selectByTelOrEmail(@Param("tel") String tel, @Param("email") String email);

    Friend updateByEmail(String email);

    Friend updateByTel(String tel);

}
