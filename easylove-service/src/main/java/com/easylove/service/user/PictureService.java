package com.easylove.service.user;

import com.easylove.entity.user.Picture;
import com.easylove.mapper.user.PictureMapper;
import com.easylove.service.AbstractService;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2017/2/9 14:30.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Service
public class PictureService extends AbstractService<Picture, Integer> {

    @Autowired
    private PictureMapper pictureMapper;

    public List<Picture> selectByTelOrEmail(String tel, String email, PageBounds pageBounds) {
        return pictureMapper.selectByTelOrEmail(tel, email, pageBounds);
    }

}
