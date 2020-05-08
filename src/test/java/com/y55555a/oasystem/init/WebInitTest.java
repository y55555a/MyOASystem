package com.y55555a.oasystem.init;


import com.y55555a.oasystem.entity.MessageKind;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author y55555a
 * Date on 2020/5/3  9:30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-mapper.xml",
        "classpath:spring/spring-servlet.xml"})

public class WebInitTest {

    @Autowired
    public WebInit webInit;


//    @Test
//    public void afterPropertiesSet() throws Exception {
//        webInit.afterPropertiesSet();
//    }

    @Test
    public void getMsgKindService() {
        List<MessageKind> messageKinds = webInit.getMsgKindService().getAllUserKind();
    }
}