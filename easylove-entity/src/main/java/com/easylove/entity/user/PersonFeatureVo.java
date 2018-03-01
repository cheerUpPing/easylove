package com.easylove.entity.user;

/**
 * 2017/2/9 17:56.
 * <p>
 * Email: cheerUpPing@163.com
 * <p>
 * 某人有哪些特点 类
 */
public class PersonFeatureVo extends PersonFeatureRelation {

    private String featureName;

    private String featureType;

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
