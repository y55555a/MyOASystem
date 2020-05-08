package com.y55555a.oasystem.interceptor;

import com.y55555a.oasystem.singletonPattern.LogToFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author y55555a
 * Date on 2020/5/3  0:27
 */
@Controller
public class LogInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        LogToFile.getInstance().log(request, response, "访问进入");
        if(request.getServletPath().equals("/admin/where/is/the/log/file.do")){
            System.out.println("【"+LogToFile.PROJECT_NAME+"】日志文件为位置为："+LogToFile.getInstance().getAbsolutePath());
            response.getWriter().println(LogToFile.getInstance().getAbsolutePath());
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {}

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        LogToFile.getInstance().log(request, response, "访问离开");
    }
}
