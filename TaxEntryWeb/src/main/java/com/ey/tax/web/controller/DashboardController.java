package com.ey.tax.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhuji on 2/10/2018.
 */
@Controller
public class DashboardController {
    @RequestMapping("/")
    public String dashboard(){
        return "dashboard";
    }
}
