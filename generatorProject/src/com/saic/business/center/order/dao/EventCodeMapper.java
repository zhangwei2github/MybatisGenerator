package com.saic.business.center.order.dao;

import com.saic.business.center.order.entity.EventCode;
import com.saic.business.center.order.entity.EventCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventCodeMapper {
    int countByExample(EventCodeExample example);

    int deleteByExample(EventCodeExample example);

    int deleteByPrimaryKey(String eventCode);

    int insert(EventCode record);

    int insertSelective(EventCode record);

    List<EventCode> selectByExample(EventCodeExample example);

    EventCode selectByPrimaryKey(String eventCode);

    int updateByExampleSelective(@Param("record") EventCode record, @Param("example") EventCodeExample example);

    int updateByExample(@Param("record") EventCode record, @Param("example") EventCodeExample example);

    int updateByPrimaryKeySelective(EventCode record);

    int updateByPrimaryKey(EventCode record);
}