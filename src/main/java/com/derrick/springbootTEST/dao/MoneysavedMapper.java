package com.derrick.springbootTEST.dao;

import com.derrick.springbootTEST.entitiy.Moneysaved;

public interface MoneysavedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Moneysaved record);

    int insertSelective(Moneysaved record);

    Moneysaved selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Moneysaved record);

    int updateByPrimaryKey(Moneysaved record);
}