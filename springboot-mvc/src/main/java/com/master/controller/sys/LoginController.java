package com.master.controller.sys;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.attribute.UserPrincipal;

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
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);


    @RequestMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("msg","ssssssssssssssss");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "index";
    }
    @RequestMapping("login")
    public String showHome() {
        return "login";
    }

}