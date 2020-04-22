package com.laowang.sptest.dao;

import com.laowang.sptest.model.Data;
import com.laowang.sptest.model.DataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataMapper {
    long countByExample(DataExample example);

    int deleteByExample(DataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Data record);

    int insertSelective(Data record);

    List<Data> selectByExampleWithBLOBs(DataExample example);

    List<Data> selectByExample(DataExample example);

    Data selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Data record, @Param("example") DataExample example);

    int updateByExampleWithBLOBs(@Param("record") Data record, @Param("example") DataExample example);

    int updateByExample(@Param("record") Data record, @Param("example") DataExample example);

    int updateByPrimaryKeySelective(Data record);

    int updateByPrimaryKeyWithBLOBs(Data record);

    int updateByPrimaryKey(Data record);
}