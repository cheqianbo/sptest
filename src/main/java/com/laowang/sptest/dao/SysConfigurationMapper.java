package com.laowang.sptest.dao;

import com.laowang.sptest.model.SysConfiguration;
import com.laowang.sptest.model.SysConfigurationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysConfigurationMapper {
    long countByExample(SysConfigurationExample example);

    int deleteByExample(SysConfigurationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysConfiguration record);

    int insertSelective(SysConfiguration record);

    List<SysConfiguration> selectByExampleWithBLOBs(SysConfigurationExample example);

    List<SysConfiguration> selectByExample(SysConfigurationExample example);

    SysConfiguration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysConfiguration record, @Param("example") SysConfigurationExample example);

    int updateByExampleWithBLOBs(@Param("record") SysConfiguration record, @Param("example") SysConfigurationExample example);

    int updateByExample(@Param("record") SysConfiguration record, @Param("example") SysConfigurationExample example);

    int updateByPrimaryKeySelective(SysConfiguration record);

    int updateByPrimaryKeyWithBLOBs(SysConfiguration record);

    int updateByPrimaryKey(SysConfiguration record);
}