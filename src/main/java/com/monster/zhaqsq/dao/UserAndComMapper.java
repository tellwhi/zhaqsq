package com.monster.zhaqsq.dao;

import com.monster.zhaqsq.bean.UserAndCom;
import com.monster.zhaqsq.bean.UserAndComExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserAndComMapper {
    long countByExample(UserAndComExample example);

    int deleteByExample(UserAndComExample example);

    int deleteByPrimaryKey(Integer uncId);

    int insert(UserAndCom record);

    int insertSelective(UserAndCom record);

    List<UserAndCom> selectByExample(UserAndComExample example);

    UserAndCom selectByPrimaryKey(Integer uncId);
    
    /*
     *  根据uid删除
     */
    int deleteByUId(Integer uId);
    
    
    /*
     *  根据comid删除
     */
    int deleteByCId(Integer cId); 


    /*
     *  根据uid查询comid 
     */
    List<UserAndCom> selectWithUId(Integer uId);
    
    /*
     *  根据comid查询uid
     */
    List<UserAndCom> selectWithCId(Integer cId);


    int updateByExampleSelective(@Param("record") UserAndCom record, @Param("example") UserAndComExample example);

    int updateByExample(@Param("record") UserAndCom record, @Param("example") UserAndComExample example);

    int updateByPrimaryKeySelective(UserAndCom record);

    int updateByPrimaryKey(UserAndCom record);
}