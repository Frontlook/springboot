package com.cmbchina.controller;

import com.cmbchina.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * com.cmbchina.domain.Users: ZhongYu Rong
 * Date: 2018/10/31
 * Time: 22:33
 */
@Controller
public class CommonController {
    @Autowired
    public CommonService commonservice;

    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    public String login() {
        return "/login/login";
    }

    @RequestMapping(value = "/loginPage", method = {RequestMethod.POST, RequestMethod.GET})
    public String login(HttpServletRequest request, HttpSession session) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        System.out.println("你输入的用户名为：" + userName);
        System.out.println("你输入的密码为：" + password);
        String user = commonservice.login(userName, password);
        session.setAttribute("userName", user);
        if (user == null) {
            return "redirect:/";
        } else {
            return "redirect:/index";
        }
    }

    @RequestMapping(value = "/index", method = {RequestMethod.POST, RequestMethod.GET})
    public String loginindex() {
        return "/login/index";

    }
}

