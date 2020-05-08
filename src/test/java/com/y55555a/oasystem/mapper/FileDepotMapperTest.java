package com.y55555a.oasystem.mapper;

import com.y55555a.oasystem.entity.FileDepot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @Author y55555a
 * Date on 2020/5/2  19:26
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mapper.xml"})
public class FileDepotMapperTest {

    @Resource
    private FileDepotMapper fileDepotMapper;

    @Test
    public void findById() {
        int id = 1;
        FileDepot fileDepot = fileDepotMapper.findById(id);
        System.out.println("file_depot:" + fileDepot);

    }

    @Test
    public void fileOfCompanyNumber() {
    }

    @Test
    public void fileOfPartNumber() {
    }

    @Test
    public void fileOfAllPartNumber() {
    }

    @Test
    public void fileOfGroupNumber() {
    }

    @Test
    public void fileOfAllGroupNumber() {
    }

    @Test
    public void fileOfAllPartAndGroupNumber() {
    }

    @Test
    public void fileFromNumToNumOfCompany() {
    }

    @Test
    public void fileFromNumToNumOfPart() {
    }

    @Test
    public void fileListFromNumToNumOfAllPart() {
    }

    @Test
    public void fileListFromNumToNumOfGroup() {
    }

    @Test
    public void fileListFromNumToNumOfAllGroup() {
    }

    @Test
    public void fileListFromNumToNumOfAllPartAndGroup() {
    }

    @Test
    public void addNewFile() {
    }

    @Test
    public void delFileById() {
    }
}