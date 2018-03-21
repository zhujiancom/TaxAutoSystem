package com.ey.tax.web.controller.workflow;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuji on 3/21/2018.
 */
@RestController
public class LeaveInfoController {

    @RequestMapping("/hello")
    public Object sayHell(){
        return "hello activiti.";
    }
}
