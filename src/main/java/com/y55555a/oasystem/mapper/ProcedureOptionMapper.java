package com.y55555a.oasystem.mapper;

import com.y55555a.oasystem.entity.ProcedureOption;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author y55555a
 * Date on 2020/5/2  18:59
 */
public interface ProcedureOptionMapper {

    //添加新的填选项
    public int addNewOption(ProcedureOption procedureOption);
    //通过提交号找全部提交的填选项
    public List<ProcedureOption> findBySubmitId(@Param("submitId")int submitId);
}
