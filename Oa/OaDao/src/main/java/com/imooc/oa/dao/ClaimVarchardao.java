package com.imooc.oa.dao;

import com.imooc.oa.Entity.Claimvoucher;

import java.util.List;

public interface ClaimVarchardao {
    void insert(Claimvoucher claimvoucher);
    void update(Claimvoucher  claimvoucher);
    void delete(int id);
    Claimvoucher select(int id);
    List<Claimvoucher> selectByCreateSn(String csn);
    List<Claimvoucher> selectNextDealSn(String ndsn);
}
