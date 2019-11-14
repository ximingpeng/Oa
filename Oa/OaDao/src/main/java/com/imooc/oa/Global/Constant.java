package com.imooc.oa.Global;

import java.util.ArrayList;
import java.util.List;

public class Constant {
    public  static final String POST_STAFF="员工";
    public  static final String POST_FM="部门经理";
    public  static final String POST_GM="总经理";
    public  static final String POST_CASHIR="财务";
    public static List<String> getPost(){
        List<String> post=new ArrayList<String>();
        post.add(POST_STAFF);
        post.add(POST_FM);
        post.add(POST_GM);
        post.add(POST_CASHIR);
        return post;
    }
    public static List<String> getItems(){
        List<String> post=new ArrayList<String>();
        post.add("餐饮");
        post.add("交通");
        post.add("住宿");
        post.add("办公");
        return post;
    }
    //报销状态
    public  static final String CLAIMVOUCHER_CREATED="已创建";
    public  static final String CLAIMVOUCHER_submit="已提交";
    public  static final String CLAIMVOUCHER_Aprovide="已审核";
    public  static final String CLAIMVOUCHER_back="已打回";
    public  static final String CLAIMVOUCHER_STOP="已终止";
    public  static final String CLAIMVOUCHER_RECHECK="待复批";
    public  static final String CLAIMVOUCHER_PAIRED="已打款";

    //审核额度
    public  static final double LIMIT_CHECK=5000.0;

    //处理方式
    public  static final String DEAL_CREATED="创建";
    public  static final String DEAL_PASS="通过";
    public  static final String DEAL_REFUSE="拒绝";
    public  static final String DEAL_PAID="已打款";
    public  static final String DEAL_BACK="打回";
    public  static final String DEAL_UPDATE="更新";
    public  static final String DEAL_SUBMIT="提交";
}
