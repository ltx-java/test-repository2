package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.xxpay.dal.dao.model.AgentInfo;
import org.xxpay.dal.dao.model.AgentInfoExample;
@Component

/* 写对应AgentInfoMapper.xml的接口类

*/

public interface AgentInfoMapper {

    int countByExample(AgentInfoExample example);
    int deleteByExample(AgentInfoExample example);
    int deleteByPrimaryKey(String agentId);
    int insert(AgentInfo record);
    int insertSelective(AgentInfo record);
    List<AgentInfo> selectByExample(AgentInfoExample example);
    AgentInfo selectByPrimaryKey(String agentId);

    int updateByExampleSelective(@Param("record") AgentInfo record, @Param("example") AgentInfoExample example);
    int updateByExample(@Param("record") AgentInfo record, @Param("example") AgentInfoExample example);
    int updateByPrimaryKeySelective(AgentInfo record);
    int updateByPrimaryKey(AgentInfo record);

}
