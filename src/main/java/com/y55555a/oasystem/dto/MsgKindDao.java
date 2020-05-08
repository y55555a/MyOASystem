package com.y55555a.oasystem.dto;

import com.y55555a.oasystem.entity.MessageKind;
import com.y55555a.oasystem.mapper.MessageKindMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author y55555a
 * Date on 2020/5/2  21:33
 */
@Service
public class MsgKindDao {

    @Resource
    private MessageKindMapper mapper;

    /**
     * 返回所有用户类型
     * @return
     */
    public List<MessageKind> getAllUserKind(){
        List<MessageKind> result = null;
        result = mapper.getAllKinds();
        return result;
    }
}
