package com.ey.tax.entity;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by zhuji on 3/23/2018.
 */
@Entity
@Table(name="t_sys_menu")
public class SysMenu extends BaseEntity {

    @Column(name="menu_name")
    @NaturalId
    private String menuName;

    @Column(name="menu_url")
    private String menuUrl;

    @ManyToMany
    private List<SysRole> roles;

}
