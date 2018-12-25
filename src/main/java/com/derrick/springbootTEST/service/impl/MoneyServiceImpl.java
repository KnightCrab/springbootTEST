package com.derrick.springbootTEST.service.impl;


import com.derrick.springbootTEST.dao.custom.MoneysavedMapperCustom;
import com.derrick.springbootTEST.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * #author coffice
 *
 * @create 2018-07-06-14:40
 **/
@Service("MoneyService")
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private MoneysavedMapperCustom moneysavedMapperCustom;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addAmountByUserName(String username,int moneychange) {

        moneysavedMapperCustom.addAmountByUserName(username,moneychange);

//        throw new RuntimeException("发生异常了..TEST1");
        return  7666;
    }
}
