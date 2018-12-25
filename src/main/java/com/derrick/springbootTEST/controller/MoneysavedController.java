package com.derrick.springbootTEST.controller;

import com.derrick.springbootTEST.dao.MoneysavedMapper;
import com.derrick.springbootTEST.dao.custom.MoneysavedMapperCustom;
import com.derrick.springbootTEST.entitiy.Comment;
import com.derrick.springbootTEST.service.CommentService;
import com.derrick.springbootTEST.service.MoneyService;
import com.derrick.springbootTEST.utils.ReqUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * #author coffice
 *
 * @create 2018-07-07-15:49
 **/
@RestController
@RequestMapping("trade")
public class MoneysavedController extends BaseController {

    @Autowired
    private MoneyService moneyService;

    @RequestMapping(value = "moneychange")
    Map<String, Object> addMoney(HttpServletRequest request) {

        String username = request.getParameter("username");
        int moneychange = Integer.parseInt(request.getParameter("moneychange"));

        Map<String, Object> model = new HashMap<>();

        Integer sss = 222;
        //!!! 需要先

        try {
            //修改
//            if (-1 != id) {
            int data = moneyService.addAmountByUserName(username, moneychange);


            System.out.println("返回值是 new22R" + data);

            if (data > 0) {
                setSuccessFlag(model);

            } else {
                setFailFlag(model);

            }

//                setSuccessFlag(model,data);

//            } else {//新增
//                setFailFlag(model);

//            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return model;
    }


}

