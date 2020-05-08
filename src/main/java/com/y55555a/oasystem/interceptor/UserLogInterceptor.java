package com.y55555a.oasystem.interceptor;

import com.y55555a.oasystem.service.RemindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author y55555a
 * Date on 2020/5/3  0:28
 */
@Controller
public class UserLogInterceptor implements HandlerInterceptor {

    @Autowired
    private RemindService remindService;
    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
    }

    @Override
    public void postHandle(HttpServletRequest req, HttpServletResponse resp, Object arg2, ModelAndView arg3)
            throws Exception {
        String path = req.getServletPath();
        if(!path.startsWith("/ajax/")){
            HttpSession session = req.getSession();
            if(session!=null && session.getAttribute("userJobId")!=null){
                String jobId = (String)session.getAttribute("userJobId");
                int msg = remindService.getRemindMsgNumberById(jobId);
                int procedure = remindService.getRemindProcedureNumberById(jobId);
                int notice = remindService.getRemindNoticeNumberById(jobId);
                session.setAttribute("myPageNeedDeal", procedure);
                session.setAttribute("myPageNotice", notice);
                session.setAttribute("myPageMessage", msg);
                session.setAttribute("myPageMessagePrompt", msg+procedure+notice);
            }
        }
    }

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object arg2) throws Exception {
        String path = req.getServletPath();
        System.out.println("【"+req.getContextPath()+"】登录拦截器开始");
        if(path.equals("/welcome.do") || path.equals("/forgetPassword.do") ||
                path.equals("/forgetPasswordForm.do") || path.equals("/loginForm.do") ||
                path.equals("/jspFile/helpFile.jsp") ||
                path.equals("/ajax/getLoginCodeAjax.do")){
            return true;
        }else{
            HttpSession session = req.getSession();
            if(session!=null && session.getAttribute("userJobId")!=null){
                return true;
            }else{
                req.setAttribute("baseContent", "请先登录！");
                req.setAttribute("baseUrl", "/welcome.do");
                req.getRequestDispatcher("/jspFile/prompt.jsp").forward(req, res);
                return false;
            }
        }
    }

}
