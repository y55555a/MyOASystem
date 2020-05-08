package com.y55555a.oasystem.service;

import com.y55555a.oasystem.dto.UserKindDao;
import com.y55555a.oasystem.entity.UserKind;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author y55555a
 * Date on 2020/5/2  22:27
 */
@Transactional(readOnly = true)
@Service
public class UserKindService {

    private UserKindDao userKindDao;

    public String getNameById(int id){
        return userKindDao.getUserKindName(id);
    }

    /**
     * 返回所有用户类型
     * @return
     */
    public List<UserKind> getAllUserKind(){
        return userKindDao.getAllUserKind();
    }

    /**
     *
     * @return
     */
    public UserKindDao getUserKindDao() {
        return userKindDao;
    }

    /**
     *
     * @param userKindDao
     */
    public void setUserKindDao(UserKindDao userKindDao) {
        this.userKindDao = userKindDao;
    }

}
