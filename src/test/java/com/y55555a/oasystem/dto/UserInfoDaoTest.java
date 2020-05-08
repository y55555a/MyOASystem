package com.y55555a.oasystem.dto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Author y55555a
 * Date on 2020/5/3  2:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-mapper.xml",
        "classpath:spring/spring-servlet.xml"})

public class UserInfoDaoTest {

    @Autowired
    private UserInfoDao userInfoDao;

    @Test
    public void getAllUserNameAndJobIdOfGroup() {
        List<Map<String, Object>> result = userInfoDao.getAllUserNameAndJobIdOfGroup(1000,2);

    }
}