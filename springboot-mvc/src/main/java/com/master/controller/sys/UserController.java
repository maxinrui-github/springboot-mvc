package com.master.controller.sys;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.master.domain.sys.SysUser;
import com.master.service.sys.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Maxinrui
 * \* Date: 2019/6/5
 * \* Time: 17:05
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RequestMapping("sys/user")
@Controller
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private SysUserService userService;

    @RequestMapping("/list")
    public String findList(Model model,@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,@RequestParam(value = "pageSize", defaultValue = "5") int pageSize) {
        model.addAttribute("pageInfo",userService.findPageList(pageNum,pageSize));
        return "sys/user/list";
    }
    @RequestMapping("/save")
    @ResponseBody
    public int save(SysUser user) {
        return this.userService.save(user);
    }
    @RequestMapping("/delete")
    @ResponseBody
    public int delete(SysUser user) {
        return this.userService.delete(user);
    }

}