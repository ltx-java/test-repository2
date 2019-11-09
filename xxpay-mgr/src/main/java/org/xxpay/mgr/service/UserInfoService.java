package org.xxpay.mgr.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.xxpay.dal.dao.mapper.UserInfoMapper;
import org.xxpay.dal.dao.model.MchInfo;
import org.xxpay.dal.dao.model.UserInfo;
import org.xxpay.dal.dao.model.UserInfoExample;


import java.util.List;

@Component
@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public int addUserInfo(UserInfo userInfo) {
        UserInfoExample example = new UserInfoExample();
        example.setOrderByClause("id DESC");
        example.setOffset(0);
        example.setLimit(1);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        String id = "10000000";
        if(!CollectionUtils.isEmpty(userInfos)) {
            id = String.valueOf(Integer.parseInt(userInfos.get(0).getId()) + 1);
        }
        userInfo.setId(id);
        return userInfoMapper.insertSelective(userInfo);
    }
    public int updateUserInfo(UserInfo userInfo) {
        return userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    public Integer count(UserInfo userInfo) {
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        setCriteria(criteria, userInfo);
        return userInfoMapper.countByExample(example);
    }

    void setCriteria(UserInfoExample.Criteria criteria, UserInfo userInfo) {
        if(userInfo != null) {
            if(StringUtils.isNotBlank(userInfo.getId())) criteria.andUserIdEqualTo(userInfo.getId());
        }
    }

    public List<UserInfo> getUserInfoList(int offset, int limit, UserInfo userInfo) {
        UserInfoExample example = new UserInfoExample();
        example.setOrderByClause("create_time DESC");
        example.setOffset(offset);
        example.setLimit(limit);
        UserInfoExample.Criteria criteria = example.createCriteria();
        setCriteria(criteria, userInfo);
        return userInfoMapper.selectByExample(example);
    }

    public UserInfo selectUserInfo(String id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    public int delUserInfo(String id) {
        return userInfoMapper.delUserInfo(id);
    }

}
