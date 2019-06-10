package com.master.repository.sys;

import com.master.domain.sys.SysUser;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Maxinrui
 * \* Date: 2019/6/6
 * \* Time: 9:54
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Repository
public interface SysUserMapper {

    SysUser getById(Integer id);

    SysUser getByName(String name);
}