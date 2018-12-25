package com.derrick.springbootTEST.dao.custom;

import com.derrick.springbootTEST.dao.MoneysavedMapper;
import com.derrick.springbootTEST.entitiy.Moneysaved;
import org.apache.ibatis.annotations.Param;

public interface MoneysavedMapperCustom {

//   public int addAmountByUserName(String username,int moneychange);

int addAmountByUserName(@Param(value="username") String username,@Param(value = "moneychange") int moneychange);
}