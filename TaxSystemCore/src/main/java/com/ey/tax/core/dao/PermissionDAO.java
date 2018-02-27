package com.ey.tax.core.dao;

import com.ey.tax.entity.SysPermission;

import java.util.List;

/**
 * Created by zhuji on 2/10/2018.
 */
public interface PermissionDAO {
    List<SysPermission> findByAdminUserId(Long userId);
}
