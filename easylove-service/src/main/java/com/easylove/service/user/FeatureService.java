package com.easylove.service.user;

import com.easylove.entity.user.Feature;
import com.easylove.mapper.user.FeatureMapper;
import com.easylove.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2017/2/9 15:33.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Service
public class FeatureService extends AbstractService<Feature, Integer> {

    @Autowired
    private FeatureMapper featureMapper;

    public List<Feature> selectByFeatureType(String featureType) {
        return featureMapper.selectByFeatureType(featureType);
    }
}
