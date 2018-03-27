package com.ey.tax.web.controller;

import com.ey.tax.service.IUserService;
import com.ey.tax.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

/**
 * Created by zhuji on 2/10/2018.
 */
@Controller
public class DashboardController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/")
    public ModelAndView dashboard(Principal user){
        ModelAndView mav = new ModelAndView();
        UserInfoVo userInfo = userService.findUserById(1L);
        mav.addObject("userInfo",userInfo);
        mav.setViewName("dashboard");
        return mav;
    }


}
