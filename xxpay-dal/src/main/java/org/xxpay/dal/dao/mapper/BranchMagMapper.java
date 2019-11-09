package org.xxpay.dal.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.xxpay.dal.dao.model.BranchMag;
import org.xxpay.dal.dao.model.BranchMagExample;

import java.util.List;
@Component
public interface BranchMagMapper {
    int countByExample(BranchMagExample example);

    int deleteByExample(BranchMagExample example);

    int deleteByPrimaryKey(String branchId);

    int insert(BranchMag record);

    int insertSelective(BranchMag record);

    List<BranchMag> selectByExample(BranchMagExample example);

    BranchMag selectByPrimaryKey(String branchId);

    int updateByExampleSelective(@Param("record") BranchMag record, @Param("example") BranchMagExample example);

    int updateByExample(@Param("record") BranchMag record, @Param("example") BranchMagExample example);

    int updateByPrimaryKeySelective(BranchMag record);

    int updateByPrimaryKey(BranchMag record);
}
