package com.easylove.service.user;

import com.easylove.entity.user.PersonFeatureRelation;
import com.easylove.entity.user.PersonFeatureVo;
import com.easylove.mapper.user.PersonFeatureRelationMapper;
import com.easylove.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2017/2/9 17:22.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Service
public class PersonFeatureRelationService extends AbstractService<PersonFeatureRelation, Integer> {

    @Autowired
    private PersonFeatureRelationMapper personFeatureRelationMapper;

    public PersonFeatureVo selectVoByTel(String tel) {
        return personFeatureRelationMapper.selectVoByTel(tel);
    }

    public PersonFeatureVo selectVoByEmail(String email) {
        return personFeatureRelationMapper.selectVoByEmail(email);
    }

    public PersonFeatureRelation selectByTel(String tel) {
        return personFeatureRelationMapper.selectByTel(tel);
    }

    public PersonFeatureRelation selectByEmail(String email) {
        return personFeatureRelationMapper.selectByEmail(email);
    }

    public void deleteByTel(String tel) {
        personFeatureRelationMapper.deleteByTel(tel);
    }

    public void deleteByEmail(String email) {
        personFeatureRelationMapper.deleteByEmail(email);
    }

    public void insertList(List<PersonFeatureRelation> list){
        for (PersonFeatureRelation personFeatureRelation : list){
            insert(personFeatureRelation);
        }
    }

}
