package com.imooc.oa.biz.Impl;

import com.imooc.oa.Entity.Claimvoucher;
import com.imooc.oa.Entity.Claimvoucheritem;
import com.imooc.oa.Entity.DealRecord;
import com.imooc.oa.Global.Constant;
import com.imooc.oa.biz.ClaimVoucherBiz;
import com.imooc.oa.dao.ClaimVarcharItemdao;
import com.imooc.oa.dao.ClaimVarchardao;
import com.imooc.oa.dao.DealRecorddao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service("claimVoucherBiz")
public class ClaimvoucherBizImpl implements ClaimVoucherBiz {
    @Autowired
    private ClaimVarcharItemdao CvIdao;
    @Autowired
    private ClaimVarchardao CVdao;
    @Autowired
    private DealRecorddao DRdao;
    public void save(Claimvoucher claimvoucher, List<Claimvoucheritem> items) {
        claimvoucher.setCreateTime(new Date());
        claimvoucher.setStatus(Constant.CLAIMVOUCHER_CREATED);
        CVdao.insert(claimvoucher);
        for (Claimvoucheritem item : items) {
                item.setId(claimvoucher.getId());
                CvIdao.insert(item);
        }
    }

    public Claimvoucher get(int id) {
        return CVdao.select(id);
    }

    public List<Claimvoucheritem> getItems(int cvid) {
        return CvIdao.selectByClaimVarchar(cvid);
    }

    public List<DealRecord> getRcords(int cvid) {
        return DRdao.selectByClaimVarchar(cvid);
    }
}
