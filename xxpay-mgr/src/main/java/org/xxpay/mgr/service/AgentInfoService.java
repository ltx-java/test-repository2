package org.xxpay.mgr.service;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.xxpay.dal.dao.mapper.AgentInfoMapper;
import org.xxpay.dal.dao.model.AgentInfo;
import org.xxpay.dal.dao.model.AgentInfoExample;
//import java.io.*;
import java.util.List;
@Component
public class AgentInfoService {

    @Autowired
    private AgentInfoMapper agentInfoMapper;

    public int addAgentInfo(AgentInfo agentInfo) {
        AgentInfoExample example = new AgentInfoExample();
        example.setOrderByClause("agentId DESC");
        example.setOffset(0);
        example.setLimit(1);
        List<AgentInfo> agentInfos = agentInfoMapper.selectByExample(example);

        String agentId = "10000000";
        //String agentId = "1";

        if(!CollectionUtils.isEmpty(agentInfos)) {
            agentId = String.valueOf(Integer.parseInt(agentInfos.get(0).getAgentId()) + 1);
        }
        agentInfo.setAgentId(agentId);
        return agentInfoMapper.insertSelective(agentInfo);
    }

    public int updateAgentInfo(AgentInfo agentInfo) {
        return agentInfoMapper.updateByPrimaryKeySelective(agentInfo);
    }

    public AgentInfo selectAgentInfo(String agentId) {
        return agentInfoMapper.selectByPrimaryKey(agentId);
    }

    public List<AgentInfo> getAgentInfoList(int offset, int limit, AgentInfo agentInfo) {
        AgentInfoExample example = new AgentInfoExample();
        example.setOrderByClause("createTime DESC");
        example.setOffset(offset);
        example.setLimit(limit);
        AgentInfoExample.Criteria criteria = example.createCriteria();
        setCriteria(criteria, agentInfo);
        return agentInfoMapper.selectByExample(example);
    }

    public Integer count(AgentInfo agentInfo) {
        AgentInfoExample example = new AgentInfoExample();
        AgentInfoExample.Criteria criteria = example.createCriteria();
        setCriteria(criteria, agentInfo);
        return agentInfoMapper.countByExample(example);
    }

    void setCriteria(AgentInfoExample.Criteria criteria, AgentInfo agentInfo) {
        if(agentInfo != null) {
            if(StringUtils.isNotBlank(agentInfo.getAgentId())) criteria.andAgentIdEqualTo(agentInfo.getAgentId());
            //if(agentInfo.getType() != null && !"-99".equals(mchInfo.getType())) criteria.andTypeEqualTo(mchInfo.getType());
        }
    }
    public String delect(String agentId) {
        String aa = String.valueOf(agentInfoMapper.deleteByPrimaryKey(agentId));
        //System.out.println("9999999999999999999999999999999999999"+aa);
        return aa;
    }


}
