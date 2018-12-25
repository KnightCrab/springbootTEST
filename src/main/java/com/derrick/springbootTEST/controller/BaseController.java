package com.derrick.springbootTEST.controller;


import java.text.DecimalFormat;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;


public class BaseController {

    private final static int SUCCESS_CODE = 200;
    private final static int FAIL_CODE = 500;

    public final static String MENUMLIST = "menumList";

    public final static String EDIT = "edit";

    //管理员
    public final static String USER_ADMIN_SESSION = "user_admin_session";

    public final static int MAX_FILESIZE = 1024 * 1024 * 10;

    protected void setSuccessFlag(Map<String,Object> model){
        model.put("code", SUCCESS_CODE);
        model.put("msg", "成功");
    }

    protected void setSuccessFlag(Map<String,Object> model,Object data){
        model.put("code", SUCCESS_CODE);
        model.put("msg", "成功");
        model.put("data", data);
    }

    protected void setSuccessFlag(Map<String,Object> model,String msg){
        model.put("code", SUCCESS_CODE);
        model.put("msg", msg);
    }

    protected void setFailFlag(Map<String,Object> model){
        model.put("code", FAIL_CODE);
        model.put("msg", "系统错误！");
    }

    protected void setFailFlag(Map<String,Object> model,String msg){
        model.put("code", FAIL_CODE);
        model.put("msg", msg);
    }

    protected void setFailFlag(Map<String,Object> model,String msg,String code){
        model.put("code", code);
        model.put("msg", msg);
    }

    protected void setFailFlag(String str,String msg){
        JSONObject json=new JSONObject();
        try {
            json.put("code", "500");
            json.put("msg", msg);
            str=json.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static Map<String,Object> getParameterMap(HttpServletRequest request) {
        Map<String,Object> map = new HashMap<String,Object>();
        Enumeration<String> names = request.getParameterNames();
        while(names.hasMoreElements()) {
            String paramName = names.nextElement();
            String[] paramValue = request.getParameterValues(paramName);
            if(paramValue == null){
                map.put(paramName, "");
            }else if(paramValue.length==1){
                map.put(paramName, paramValue[0]);
            }else{
                map.put(paramName, paramValue);
            }
        }
        return map;
    }


    public void validRequestParams(Map<String,Object> src,String[] mustParams)throws Exception{
        StringBuffer info = new StringBuffer();
        int num = 0;
        if(mustParams!=null && mustParams.length>0){
            for(String name:mustParams){
                if(!src.containsKey(name) || src.get(name)==null){
                    if(num==0){
                        info.append(name);
                    }else{
                        info.append(","+name);
                    }
                    num++;
                }
            }
        }
        if(num>0){
            throw new Exception("以下"+num+"个参数不能为空["+info.toString()+"]");
        }
    }



    /**
     * 验证参数是否为空
     * @param request
     * @param params
     * @return
     */
    public boolean checkParams(HttpServletRequest request, String... params) {

        if (params != null && request != null) {
            for (String key : params) {
                if (StringUtils.isEmpty(request.getParameter(key))) {// ==null){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 验证是否是编辑状态
     * @return
     */
    public boolean isEdit(HttpServletRequest request) {
        String action = request.getParameter("action");
        if(!StringUtils.isEmpty(action) && action.equals("edit")) {
            return true;
        }
        return false;
    }


    public static String getUrl(HttpServletRequest req) {
        return req.getRequestURI().substring(req.getContextPath().length()+1);
    }


    /**
     * 获取参数串
     * @param req
     * @return
     */
    public static String getParamStr(HttpServletRequest req) {
        Map<String, Object> paramMap = getParameterMap(req);
        return getParamStr(paramMap);
    }

    /**
     * 获取客户端IP
     */
    public static String getIp(HttpServletRequest req) {
        return req.getRemoteAddr();
    }

    public static String getParamStr(Map<String, Object> paramMap) {
        String str = "";
        for(String key : paramMap.keySet()) {
            if("".equals(str)) {
                str += "?";
            } else {
                str += "&";
            }
            str += key+"="+paramMap.get(key);
        }
        return str;
    }

    /**
     * 学习进度
     * @param num1
     * @param num2
     * @return
     * @throws Exception
     */
    protected String Percentage(Integer num1, Integer num2) throws Exception {
        DecimalFormat df = new DecimalFormat("0");
        String str = df.format(((float) num1 / num2) * 100) + "%";
        return str;
    }
}
