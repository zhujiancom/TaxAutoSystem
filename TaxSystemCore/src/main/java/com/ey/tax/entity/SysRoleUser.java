package com.ey.tax.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zhuji on 2/10/2018.
 */
@Entity
@Table(name="Sys_Role_User")
public class SysRoleUser extends BaseEntity{
    @Column(name = "SYS_USER_ID")
    private Long userId;

    @Column(name = "SYS_ROLE_ID")
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
