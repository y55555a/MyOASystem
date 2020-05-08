package com.y55555a.oasystem.init;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * @Author y55555a
 * Date on 2020/5/4  15:46
 */

@Lazy(false)
@Component
public class TestServletContextAware implements ServletContextAware {

    public ServletContext servletContext;

    @Override
    public void setServletContext(ServletContext servletContext) {

        System.out.println("servletContext.setAttribute ctx test begin");
        servletContext.setAttribute("ctx", servletContext.getContextPath());
        System.out.println("servletContext.setAttribute ctx  test  ready");

        this.servletContext = servletContext;
    }

    public String showServletContext() {
        return servletContext.getContextPath();
    }
}
