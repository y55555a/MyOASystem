package com.y55555a.oasystem.service;

import com.y55555a.oasystem.dto.MsgKindDao;
import com.y55555a.oasystem.entity.MessageKind;
import com.y55555a.oasystem.entity.UserKind;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author y55555a
 * Date on 2020/5/3  10:28
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-mapper.xml",
        "classpath:spring/spring-servlet.xml"})

public class MsgKindServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MsgKindService msgKindService;

    @Test
    public void testGetAllUserKind() {
        List<MessageKind> list = msgKindService.getAllUserKind();
        logger.info("list = " + list);
    }
}