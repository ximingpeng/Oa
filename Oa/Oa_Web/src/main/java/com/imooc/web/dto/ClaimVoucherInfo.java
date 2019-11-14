package com.imooc.web.dto;

import com.imooc.oa.Entity.Claimvoucher;
import com.imooc.oa.Entity.Claimvoucheritem;

import java.util.List;

public class ClaimVoucherInfo {
    private Claimvoucher claimvoucher;
    private List<Claimvoucheritem> items;

    public Claimvoucher getClaimvoucher() {
        return claimvoucher;
    }

    public void setClaimvoucher(Claimvoucher claimvoucher) {
        this.claimvoucher = claimvoucher;
    }

    public List<Claimvoucheritem> getItems() {
        return items;
    }

    public void setItems(List<Claimvoucheritem> items) {
        this.items = items;
    }
}
