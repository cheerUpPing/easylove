package com.easylove.entity.user;

import java.util.Date;

/**
 * 2017/2/9 17:18.
 * <p>
 * Email: cheerUpPing@163.com
 *
 * 人和特点关系表
 */
public class PersonFeatureRelation {

    private Integer id;

    private String tel;

    private String email;

    private Integer featureId;

    private Date addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
