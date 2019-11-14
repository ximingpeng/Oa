package com.imooc.oa.biz;

import com.imooc.oa.Entity.Claimvoucher;
import com.imooc.oa.Entity.Claimvoucheritem;
import com.imooc.oa.Entity.DealRecord;

import java.util.List;

public interface ClaimVoucherBiz {
    void save(Claimvoucher claimvoucher, List<Claimvoucheritem> item);
    Claimvoucher get(int id);
    List<Claimvoucheritem> getItems(int cvid);
    List<DealRecord> getRcords(int cvid);
}
