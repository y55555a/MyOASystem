package com.y55555a.oasystem.dto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @Author y55555a
 * Date on 2020/5/3  2:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class FileDepotDaoTest {

    @Resource
    private FileDepotDao fileDepotDao;

    @Test
    public void getFileOfCompanyNumber() {
        int result = 0;
        result = fileDepotDao.getFileOfCompanyNumber();
        System.out.println("getFileOfCompanyNumber = " + result);
    }
}