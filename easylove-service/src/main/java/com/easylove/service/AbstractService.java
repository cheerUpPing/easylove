package com.easylove.service;

import com.easylove.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * 2017/2/8 10:50.
 * <p>
 * Email: cheerUpPing@163.com
 */
public abstract class AbstractService<T, ID extends Serializable> {

    @Autowired
    protected BaseMapper<T, ID> baseMapper;

    public void insert(T t) {
        baseMapper.insert(t);
    }

    public void delete(ID id) {
        baseMapper.delete(id);
    }

    public void update(T t) {
        baseMapper.update(t);
    }

    public void select(ID id) {
        baseMapper.select(id);
    }


}
