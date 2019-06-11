package com.master.service.sys;

import com.master.domain.sys.SysUser;
import com.master.repository.sys.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class SysUserService {

    @Autowired
    private SysUserMapper userMapper;

    public SysUser getById(String id) {
        return userMapper.getById(id);
    }

    public SysUser getByName(String name) {
        return userMapper.getByName(name);
    }
}