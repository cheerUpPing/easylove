package com.easylove.service.user;

import com.easylove.entity.user.Friend;
import com.easylove.mapper.user.FriendMapper;
import com.easylove.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2017/2/9 12:27.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Service
public class FriendService extends AbstractService<Friend,Integer> {

    @Autowired
    private FriendMapper friendMapper;


}
