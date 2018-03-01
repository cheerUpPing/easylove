package com.easylove.mapper.user;

import com.easylove.entity.user.PersonFeatureRelation;
import com.easylove.entity.user.PersonFeatureVo;
import com.easylove.mapper.BaseMapper;

/**
 * 2017/2/8 15:17.
 * <p>
 * Email: cheerUpPing@163.com
 */
public interface PersonFeatureRelationMapper extends BaseMapper<PersonFeatureRelation, Integer> {

    PersonFeatureVo selectVoByTel(String tel);

    PersonFeatureVo selectVoByEmail(String email);

    PersonFeatureRelation selectByTel(String tel);

    PersonFeatureRelation selectByEmail(String email);

    void deleteByTel(String tel);

    void deleteByEmail(String email);

}
