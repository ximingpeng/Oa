package com.imooc.oa.Entity;

public class Claimvoucheritem {
    private Integer id;
    private Integer claim_voucher_id;
    private String item;
    private double amount;
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClaim_voucher_id() {
        return claim_voucher_id;
    }

    public void setClaim_voucher_id(Integer claim_voucher_id) {
        this.claim_voucher_id = claim_voucher_id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Claimvoucheritem{" +
                "id=" + id +
                ", claim_voucher_id=" + claim_voucher_id +
                ", item='" + item + '\'' +
                ", amount=" + amount +
                ", comment='" + comment + '\'' +
                '}';
    }
}
