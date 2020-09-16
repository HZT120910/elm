package com.dongruan.dao;

import com.dongruan.bean.Orderdetailet;
import com.dongruan.bean.OrderdetailetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailetMapper {
    long countByExample(OrderdetailetExample example);

    int deleteByExample(OrderdetailetExample example);

    int deleteByPrimaryKey(Integer odid);

    int insert(Orderdetailet record);

    int insertSelective(Orderdetailet record);

    List<Orderdetailet> selectByExample(OrderdetailetExample example);

    Orderdetailet selectByPrimaryKey(Integer odid);

    int updateByExampleSelective(@Param("record") Orderdetailet record, @Param("example") OrderdetailetExample example);

    int updateByExample(@Param("record") Orderdetailet record, @Param("example") OrderdetailetExample example);

    int updateByPrimaryKeySelective(Orderdetailet record);

    int updateByPrimaryKey(Orderdetailet record);
}