package com.y55555a.oasystem.mapper;

import com.y55555a.oasystem.entity.UserKind;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author y55555a
 * Date on 2020/5/3  8:57
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mapper.xml"})
public class UserKindMapperTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserKindMapper userKindMapper;

    @Test
    public void getAllUserKind() {
        List<UserKind> list = userKindMapper.getAllUserKind();
//        logger.info("list={}", list);
        for(UserKind u : list) {
            logger.info("userkind = " + u.toString());
        }

    }
}