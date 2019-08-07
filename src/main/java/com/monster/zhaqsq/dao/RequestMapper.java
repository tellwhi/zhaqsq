package com.monster.zhaqsq.dao;

import com.monster.zhaqsq.bean.Request;
import com.monster.zhaqsq.bean.RequestExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RequestMapper {
    long countByExample(RequestExample example);

    int deleteByExample(RequestExample example);

    int deleteByPrimaryKey(Integer requestid);

    int insert(Request record);

    int insertSelective(Request record);

    List<Request> selectByExample(RequestExample example);

    Request selectByPrimaryKey(Integer requestid);

    int updateByExampleSelective(@Param("record") Request record, @Param("example") RequestExample example);

    int updateByExample(@Param("record") Request record, @Param("example") RequestExample example);

    int updateByPrimaryKeySelective(Request record);

    int updateByPrimaryKey(Request record);
}