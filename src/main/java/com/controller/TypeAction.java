package com.controller;

import com.pojo.Customer;
import com.pojo.QueryCustomer;
import com.pojo.Type;
import com.service.CustomerService;
import com.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("crm")
public class TypeAction {
    @Autowired
    private TypeService typeService;
    @Autowired
    private CustomerService customerService;

    @RequestMapping("list")
    public String listAll(Model model){
        List<Type> positions = typeService.queryByType("所属行业");
        List<Type> levels = typeService.queryByType("客户级别");
        model.addAttribute("positions",positions);
        model.addAttribute("levels",levels);
        return "index";
    }
    @RequestMapping("querylist")
    public String querylist(QueryCustomer  qc,Model model){
        List<Type> positions = typeService.queryByType("所属行业");
        List<Type> levels = typeService.queryByType("客户级别");
        model.addAttribute("positions",positions);
        model.addAttribute("levels",levels);
        System.out.println(qc);
        List<Customer> customers = customerService.query(qc);
        model.addAttribute("customers",customers);
        model.addAttribute("qc",qc);

        return "index";
    }
    @RequestMapping("toupdate")
    @ResponseBody
    public Customer toupdate(int id){
        Customer customer = customerService.queryById(id);
        return customer;
    }
    @RequestMapping("update")
    @ResponseBody
    public int update(Customer c){
        int rs = customerService.update(c);
        return rs;
    }
    @RequestMapping("delete")
    @ResponseBody
    public int delete(int id){
        int rs = customerService.delete(id);
        return rs;
    }
}
