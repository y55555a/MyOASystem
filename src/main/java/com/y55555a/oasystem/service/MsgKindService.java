package com.y55555a.oasystem.service;

import com.y55555a.oasystem.dto.MsgKindDao;
import com.y55555a.oasystem.entity.MessageKind;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author y55555a
 * Date on 2020/5/2  22:22
 */

@Transactional(readOnly = true)
@Service
public class MsgKindService {

    private MsgKindDao msgKindDao;
    public MsgKindDao getMsgKindDao() {
        return msgKindDao;
    }
    public void setMsgKindDao(MsgKindDao msgKindDao) {
        this.msgKindDao = msgKindDao;
    }

    /**
     * 返回所有用户类型
     * @return
     */
    public List<MessageKind> getAllUserKind(){
        return msgKindDao.getAllUserKind();
    }
}
