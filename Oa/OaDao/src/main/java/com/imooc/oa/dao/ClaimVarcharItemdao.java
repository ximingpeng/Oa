package com.imooc.oa.dao;

import com.imooc.oa.Entity.Claimvoucheritem;

import java.util.List;

public interface ClaimVarcharItemdao {
    void insert(Claimvoucheritem claimvoucheritem);
    void update(Claimvoucheritem claimvoucheritem);
    void delete(int id);
    List<Claimvoucheritem> selectByClaimVarchar(int cvid);
}
