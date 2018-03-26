package com.ey.tax.web.controller;

import com.ey.tax.entity.SysMenu;
import com.ey.tax.security.SecurityUser;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by zhuji on 3/26/2018.
 */
@RestController
public class LoadMenuController {
    @RequestMapping(value = "/menu/load")
    public String loadMenu(){
        SecurityUser user = (SecurityUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<SysMenu> menuList = null;
        return "";
    }
}
