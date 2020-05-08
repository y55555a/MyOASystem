package com.y55555a.oasystem.listener;

import com.y55555a.oasystem.singletonPattern.LogToFile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author y55555a
 * Date on 2020/5/3  0:30
 */
@Service
public class WebContextListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        LogToFile.getInstance().logStop();
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        LogToFile.getInstance().logStart();
    }
}
