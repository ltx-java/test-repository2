package org.xxpay.mgr.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.xxpay.dal.dao.mapper.BranchMagMapper;
import org.xxpay.dal.dao.model.BranchMag;
import org.xxpay.dal.dao.model.BranchMagExample;

import java.util.List;

@Component
public class BranchMagService {

    @Autowired
    private BranchMagMapper branchMagMapper;

    public int addBranchMag(BranchMag branchMag) {
        BranchMagExample example = new BranchMagExample();
        example.setOrderByClause("branchId DESC");
        example.setOffset(0);
        example.setLimit(1);
        List<BranchMag> branchMags = branchMagMapper.selectByExample(example);
        String branchId = "10000000";
        if(!CollectionUtils.isEmpty(branchMags)) {
            branchId = String.valueOf(Integer.parseInt(branchMags.get(0).getBranchId()) + 1);
        }
        branchMag.setBranchId(branchId);
        return branchMagMapper.insertSelective(branchMag);
    }

    public int updateBranchMag(BranchMag branchMag) {
        return branchMagMapper.updateByPrimaryKeySelective(branchMag);
    }

    public BranchMag selectBranchMag(String branchId) {
        return branchMagMapper.selectByPrimaryKey(branchId);
    }

    public List<BranchMag> getBranchMagList(int offset, int limit, BranchMag branchMag) {
        BranchMagExample example = new BranchMagExample();
        example.setOrderByClause("createTime DESC");
        example.setOffset(offset);
        example.setLimit(limit);
        BranchMagExample.Criteria criteria = example.createCriteria();
        setCriteria(criteria, branchMag);
        return branchMagMapper.selectByExample(example);
    }

    public Integer count(BranchMag branchMag) {
        BranchMagExample example = new BranchMagExample();
        BranchMagExample.Criteria criteria = example.createCriteria();
        setCriteria(criteria, branchMag);
        return branchMagMapper.countByExample(example);
    }

    void setCriteria(BranchMagExample.Criteria criteria, BranchMag branchMag) {
        if(branchMag != null) {
            if(StringUtils.isNotBlank(branchMag.getBranchId())) criteria.andBranchIdEqualTo(branchMag.getBranchId());
        }
    }

    public int deleteBranchMag(String branchId) {
        return branchMagMapper.deleteByPrimaryKey(branchId);
    }
}
