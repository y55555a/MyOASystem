package com.y55555a.oasystem.dto;

import com.y55555a.oasystem.entity.UserKind;
import com.y55555a.oasystem.mapper.UserKindMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author y55555a
 * Date on 2020/5/2  21:44
 */
@Service
public class UserKindDao {

    @Resource
    private UserKindMapper mapper;

    /**
     * 返回所有用户类型
     * @return
     */
    public List<UserKind> getAllUserKind(){
        List<UserKind> result = null;
        result = mapper.getAllUserKind();
        return result;
    }

    /**
     * 根据ID获取名字
     * @param id
     * @return
     */
    public String getUserKindName(int id){
        String result = null;
        result = mapper.getNameById(id);
        return result;
    }
}
