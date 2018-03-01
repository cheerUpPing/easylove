package com.easylove.mapper.user;

import com.easylove.entity.user.Picture;
import com.easylove.mapper.BaseMapper;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 2017/2/8 15:17.
 * <p>
 * Email: cheerUpPing@163.com
 */
public interface PictureMapper extends BaseMapper<Picture, Integer> {

    List<Picture> selectByTelOrEmail(@Param("tel") String tel, @Param("email") String email, PageBounds pageBounds);

}
