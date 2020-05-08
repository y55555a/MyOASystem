package com.y55555a.oasystem.mapper;

import com.y55555a.oasystem.entity.ModelShen;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author y55555a
 * Date on 2020/5/2  18:57
 */
public interface ModelShenMapper {

    //添加一个新的流程
    public int addNewShen(ModelShen modelShen);
    //获取一个模板的全部流程
    public List<ModelShen> getShensByProcedureId(@Param("modelId")int modelId);
    //获取一个模板的流程数
    public int getNumberOfOneModel(@Param("modelId")int modelId);
    //删除一个模板的全部流程
    public int delAllByModelId(@Param("modelId")int modelId);
}
