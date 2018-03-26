package com.ey.tax.model;

import java.util.List;

/**
 * Created by zhuji on 3/26/2018.
 */
public class MenuModel {

    private String menuName;

    private String menuUrl;

    private String description;

    List<MenuModel> subMenuList;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<MenuModel> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<MenuModel> subMenuList) {
        this.subMenuList = subMenuList;
    }
}
