package com.ey.tax.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by zhuji on 2/10/2018.
 */
@Entity
@Table(name="t_sys_role")
public class SysRole extends AccessoryEntity {
    @Column(name = "role_name")
    private String roleName;

    @ManyToMany()
    private List<SysMenu> menus;

}
