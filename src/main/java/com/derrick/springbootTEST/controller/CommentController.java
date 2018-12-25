package com.derrick.springbootTEST.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.derrick.springbootTEST.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * #author coffice
 *
 * @create 2018-07-06-10:52
 **/
@RestController
@RequestMapping("comment")
public class CommentController extends BaseController{

    @Autowired
    private CommentService commentService;

    @RequestMapping(value ="getcomment")
    @CrossOrigin
    Map<String, Object> saveActivity(HttpServletRequest request) {


        String test = request.getParameter("params");
//        Object test2 = request.getParameter("lala");

        JSONObject test3 = JSON.parseObject(test);

//        Integer id = ReqUtils.getInt(request, "testt", -1);
//
        int a = 321;


        Map<String, Object> model = new HashMap<>();

//        try {
//            //修改
//            if (-1 != id) {
//                Comment data =commentService.selectByPrimaryKey(id);
//                setSuccessFlag(model,data);
//
//            } else {//新增
//                setFailFlag(model);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        return model;
    }


}
