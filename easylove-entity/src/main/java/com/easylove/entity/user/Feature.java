package com.easylove.entity.user;

/**
 * 2017/2/9 15:24.
 * <p>
 * Email: cheerUpPing@163.com
 *
 * 兴趣爱好  性格特征
 */
public class Feature {

    private Integer id;

    private String featureName;

    private String featureType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public String getFeatureType() {
        return featureType;
    }

    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }
}
