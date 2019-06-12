package com.master.service.sys;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.master.domain.sys.SysUser;
import com.master.repository.sys.SysUserMapper;
import com.master.util.IdGen;
import com.master.util.MD5Util;
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
public class SysUserService {

    @Autowired
    private SysUserMapper userMapper;

    public SysUser getById(String id) {
        return userMapper.getById(id);
    }

    public SysUser getByName(String name) {
        return userMapper.getByName(name);
    }

    public PageInfo<SysUser> findPageList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<SysUser> userList = this.userMapper.findPageList();
        PageInfo<SysUser> pageList = new PageInfo<>(userList);
        return pageList;
    }

    public int save(SysUser user) {
        user.setId(IdGen.uuid());
        user.setPassword(MD5Util.encode(user.getPassword()));
        return this.userMapper.save(user);
    }

    public int delete(SysUser user) {
        return this.userMapper.delete(user);
    }
}