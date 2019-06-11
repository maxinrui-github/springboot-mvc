package com.master.controller.sys;

import com.master.service.sys.SysPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Maxinrui
 * \* Date: 2019/6/5
 * \* Time: 17:05
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Controller
public class LoginController{

    private Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private SysPermissionService sysPermissionService;

    @RequestMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("sysPermissions", sysPermissionService.getPermission());
        model.addAttribute("name", sysPermissionService.getUserName());
        return "index";
    }
    @RequestMapping("/welcome")
    public String showwelcome(Model model) {
        return "welcome";
    }

    @RequestMapping("login")
    public String showHome() {
        return "login";
    }

}