package com.easylove.mapper.user;

import com.easylove.entity.user.Feature;
import com.easylove.mapper.BaseMapper;

import java.util.List;

/**
 * 2017/2/8 15:17.
 * <p>
 * Email: cheerUpPing@163.com
 */
public interface FeatureMapper extends BaseMapper<Feature, Integer> {

    List<Feature> selectByFeatureType(String featureType);


}
