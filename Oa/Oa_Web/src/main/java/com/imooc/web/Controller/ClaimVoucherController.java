package com.imooc.web.Controller;

import com.imooc.oa.Entity.Employee;
import com.imooc.oa.Global.Constant;
import com.imooc.oa.biz.ClaimVoucherBiz;
import com.imooc.web.dto.ClaimVoucherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller("cVController")
public class ClaimVoucherController {
    @Autowired
    private ClaimVoucherBiz claimVoucherBiz;
    public String toAdd(Map<String,Object> map){
        map.put("items",Constant.getItems());
        map.put("info",new ClaimVoucherInfo());
        return "claim_voucher_add";
    }
    public String add(HttpSession session,ClaimVoucherInfo info){
          Employee employee = (Employee) session.getAttribute("employee");
        info.getClaimvoucher().setCreateSn(employee.getSn());
        claimVoucherBiz.save(info.getClaimvoucher(),info.getItems());
        return "redirect:detail?id"+info.getClaimvoucher().getId();
    }
    public String detail(int id,Map<String,Object> map){
        map.put("claimvoucher",claimVoucherBiz.get(id));
        map.put("items",claimVoucherBiz.getItems(id));
        map.put("claim_Record",claimVoucherBiz.getRcords(id));
        return "claim_voucher_detail";
    }
}
