package com.imooc.oa.Entity;

import java.io.Serializable;
import java.util.Date;

public class Claimvoucher implements Serializable{
    private Integer id;
    private String cause;
    private Date createTime;
    private String createSn;
    private String nextDealsn;
    private double totalAmount;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateSn() {
        return createSn;
    }

    public void setCreateSn(String createSn) {
        this.createSn = createSn;
    }

    public String getNextDealsn() {
        return nextDealsn;
    }

    public void setNextDealsn(String nextDealsn) {
        this.nextDealsn = nextDealsn;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Employee creater;
    private Employee dealer;

    public Employee getCreater() {
        return creater;
    }

    public void setCreater(Employee creater) {
        this.creater = creater;
    }

    public Employee getDealer() {
        return dealer;
    }

    public void setDealer(Employee dealer) {
        this.dealer = dealer;
    }

    @Override
    public String toString() {
        return "Claimvoucher{" +
                "id=" + id +
                ", cause='" + cause + '\'' +
                ", createTime=" + createTime +
                ", createSn='" + createSn + '\'' +
                ", nextDealsn='" + nextDealsn + '\'' +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                ", creater=" + creater +
                ", dealer=" + dealer +
                '}';
    }
}
