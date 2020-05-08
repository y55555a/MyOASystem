package com.y55555a.oasystem.timing;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @Author y55555a
 * Date on 2020/5/3  0:37
 *
 * 每一个小时清除一下验证码文件
 */

@Component
public class ClearFileTask {

    @Scheduled(fixedRate=1000*60*60)
    public void aotoThaw(){
        String proPath = System.getProperty("user.dir");
        String path = proPath.substring(0,proPath.lastIndexOf(File.separator));
        String classPath = this.getClass().getResource("/").getPath();
        classPath = classPath.substring(1,classPath.indexOf("/WEB-INF/classes/"));
        String name = classPath.substring(classPath.lastIndexOf("/")+1);
        path += "/webapps/"+name+"/img/loginCode";
        System.out.println("【"+name+"】开始清理验证码文件。");
        File f = new File(path);
        System.out.println(f.getAbsolutePath());
        if(!f.exists()){
            System.out.println("【"+name+"】验证码文件不存在。");
            return;
        }
        File[] files = f.listFiles();
        for(int i=0;i<files.length;i++){
            if(!files[i].getName().equals("error.jpg") && !files[i].getName().equals("wait.jpg")){
                files[i].delete();
            }
        }

    }
}
