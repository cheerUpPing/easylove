package com.easylove.entity.user;

import java.util.Date;

/**
 * 2017/2/9 11:45.
 * <p>
 * Email: cheerUpPing@163.com
 *
 * 交友条件信息表
 */
public class Friend {

    private Integer id;

    private String tel;

    private String email;

    private Integer targetSex;

    private String proCode;

    private String cityCode;

    private Integer ageStart;

    private Integer ageEnd;

    private Integer heightStart;

    private Integer heightEnd;

    private Integer enducation;

    private Integer salary;

    private Date update;

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

    public Integer getTargetSex() {
        return targetSex;
    }

    public void setTargetSex(Integer targetSex) {
        this.targetSex = targetSex;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getAgeStart() {
        return ageStart;
    }

    public void setAgeStart(Integer ageStart) {
        this.ageStart = ageStart;
    }

    public Integer getAgeEnd() {
        return ageEnd;
    }

    public void setAgeEnd(Integer ageEnd) {
        this.ageEnd = ageEnd;
    }

    public Integer getHeightStart() {
        return heightStart;
    }

    public void setHeightStart(Integer heightStart) {
        this.heightStart = heightStart;
    }

    public Integer getHeightEnd() {
        return heightEnd;
    }

    public void setHeightEnd(Integer heightEnd) {
        this.heightEnd = heightEnd;
    }

    public Integer getEnducation() {
        return enducation;
    }

    public void setEnducation(Integer enducation) {
        this.enducation = enducation;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }
}
