package com.ey.tax.service;

import com.ey.tax.core.dao.LeaveInfoDAO;
import org.activiti.engine.delegate.DelegateExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhuji on 3/21/2018.
 */
@Service
public class LeaveService {
    @Autowired
    private LeaveInfoDAO leaveInfoDAO;

    //${leaveService.findProjectManger(execution)}
    //查询相关项目经理
    public List<String> findProjectManager(DelegateExecution execution){
        //真实项目中查询人员表，返回项目经理的userId
        return Arrays.asList("project1","project2");
    }

    //${leaveService.findHr(execution)}
    public List<String> findHr(DelegateExecution execution){
        return Arrays.asList("hr1","hr2");
    }

    //#{leaveService.changeStatus(execution,'pass')}
    public void changeStatus(DelegateExecution execution,String status){
        System.out.println("修改业务单据状态 - "+status);
    }
}
