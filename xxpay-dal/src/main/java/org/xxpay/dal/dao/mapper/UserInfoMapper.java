package org.xxpay.dal.dao.mapper;

import org.springframework.stereotype.Component;
import org.xxpay.dal.dao.model.UserInfo;
import org.xxpay.dal.dao.model.UserInfoExample;

import java.util.List;

@Component
public interface UserInfoMapper {
    List<UserInfo> selectByExample(UserInfoExample example);
    int countByExample(UserInfoExample example);
    int insert(UserInfo record);
    int insertSelective(UserInfo record);
//    int updateByPrimaryKey(UserInfo record);
    UserInfo selectByPrimaryKey(String id);
    int updateByPrimaryKeySelective(UserInfo record);
    int delUserInfo(String id);
}
