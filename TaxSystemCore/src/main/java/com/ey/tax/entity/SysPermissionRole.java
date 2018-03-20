package com.ey.tax.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zhuji on 2/10/2018.
 */
@Entity
@Table(name="Sys_Permission_Role")
public class SysPermissionRole extends BaseEntity{
    @Column(name = "ROLE_ID")
    private Long roleId;

    @Column(name = "PERMISSION_ID")
    private Long permissionId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}
