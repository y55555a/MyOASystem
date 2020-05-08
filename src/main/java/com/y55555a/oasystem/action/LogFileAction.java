package com.y55555a.oasystem.action;

import com.y55555a.oasystem.singletonPattern.LogToFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author y55555a
 * Date on 2020/5/2  23:45
 */
@Controller
public class LogFileAction {

    public LogFileAction(){
        super();
    }

    @RequestMapping("admin/where/is/the/log/file.do")
    @ResponseBody
    public String where(){
        return "redirect:/home.do";
    }

    @RequestMapping("admin/read/the/log/file.do")
    @ResponseBody
    public String read(){
        return LogToFile.getInstance().readAllFile();
    }
}
