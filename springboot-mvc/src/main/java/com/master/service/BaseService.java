package com.master.service;

import com.master.domain.sys.SysUser;
import com.master.service.sys.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;


public class BaseService {

    @Autowired
    private SysUserService userService;

    /**
     * 获取当前用户
     *
     * @return
     */
    public SysUser getCurrentUser() {
        //获取当前用户
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        //查询当前用户
        SysUser user = userService.getByName(userDetails.getUsername());
        if (user == null)
            throw new RuntimeException("用户不存在: " + userDetails.getUsername());
        return user;
    }

    /**
     * 获取当前用户name
     *
     * @return
     */
    public String getUserName() {
        return this.getCurrentUser().getName();
    }

    /**
     * 获取当前用户id
     *
     * @return
     */
    public String getUserId() {
        return this.getCurrentUser().getId();
    }

}
