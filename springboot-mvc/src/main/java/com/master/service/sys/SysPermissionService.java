package com.master.service.sys;

import com.master.domain.sys.SysPermission;
import com.master.domain.sys.SysUser;
import com.master.repository.sys.SysPermissionMapper;
import com.master.repository.sys.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Maxinrui
 * \* Date: 2019/6/6
 * \* Time: 9:59
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class SysPermissionService {

    @Autowired
    private SysPermissionMapper permissionMapper;

    public List<SysPermission> findAll() {
        return permissionMapper.findAll();
    }

    public List<SysPermission> findByUserId(int userId) {
        return permissionMapper.findByUserId(userId);
    }

    ;
}