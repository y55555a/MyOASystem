package com.y55555a.oasystem.init;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author y55555a
 * Date on 2020/5/4  15:53
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class TestServletContextAwareTest {

    @Autowired
    private TestServletContextAware testServletContextAware;

    @Test
    public void showServletContext() {

        String s = testServletContextAware.showServletContext();

        System.out.println("testServletContextAware.showServletContext = " + s);
    }
}