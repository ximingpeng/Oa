package com.imooc.oa.dao;

import com.imooc.oa.Entity.DealRecord;

import java.util.List;

public interface DealRecorddao {
    void insert(DealRecord dealRecord);
    List<DealRecord> selectByClaimVarchar(int cvid);
}
