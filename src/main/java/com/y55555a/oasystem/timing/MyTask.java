package com.y55555a.oasystem.timing;

import com.y55555a.oasystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author y55555a
 * Date on 2020/5/3  0:38
 *
 * 定时解冻任务执行
 */

@Component
public class MyTask {

    @Autowired
    private UserService userServer;

    @Scheduled(fixedRate=1000*5)
    public void aotoThaw(){
        String jobId = null;
        jobId = userServer.hasNeedToOutOfFrozen();
        while(jobId!=null){
            try {
                userServer.changeUserStatusOutOfFrozenByJobId(jobId);
            } catch (Exception e) {
                e.printStackTrace();
            }
            jobId = userServer.hasNeedToOutOfFrozen();
        }
//		System.out.println("定时解冻任务执行");
    }
}
