package com.y55555a.oasystem.interceptor;

import com.y55555a.oasystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author y55555a
 * Date on 2020/5/3  0:29
 */
@Controller
public class WebManagerInterceptor implements HandlerInterceptor {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String jobId = (String)request.getSession().getAttribute("userJobId");
        if(jobId!=null && userService.getUserKindByJobId(jobId)==0){
            return true;
        }else{
            request.setAttribute("baseContent", "无权限访问！");
            request.setAttribute("baseUrl", "/home.do");
            request.getRequestDispatcher("/jspFile/prompt.jsp").forward(request, response);
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
