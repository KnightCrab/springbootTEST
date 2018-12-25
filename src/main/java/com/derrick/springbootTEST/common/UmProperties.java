package com.derrick.springbootTEST.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 友盟配置文件
 *
 * @author Administrator
 * @create 2018-06-08
 **/
@Component
@PropertySource({"classpath:/application.yml"})
@ConfigurationProperties(prefix="um")
public class UmProperties {

    private String pushTest;
    private String pushCourse;
    private String pushContent1;
    private String pushContent2;
    private String pushContent3;
    private String pushContent4;
    private String pushContent5;
    private String pushCoursePushTime;
    private String pushContentPushTime1;
    private String pushContentPushTime2;
    private String pushContentPushTime3;
    private String pushContentPushTime4;
    private String pushContentPushTime5;
    private String pushCourseEndTime;
    private String pushContentEndTime1;
    private String pushContentEndTime2;
    private String pushContentEndTime3;
    private String pushContentEndTime4;
    private String pushContentEndTime5;

    public String getPushCourse() {
        return pushCourse;
    }

    public void setPushCourse(String pushCourse) {
        this.pushCourse = pushCourse;
    }

    public String getPushCoursePushTime() {
        return pushCoursePushTime;
    }

    public void setPushCoursePushTime(String pushCoursePushTime) {
        this.pushCoursePushTime = pushCoursePushTime;
    }

    public String getPushCourseEndTime() {
        return pushCourseEndTime;
    }

    public void setPushCourseEndTime(String pushCourseEndTime) {
        this.pushCourseEndTime = pushCourseEndTime;
    }

    public String getPushTest() {
        return pushTest;
    }

    public void setPushTest(String pushTest) {
        this.pushTest = pushTest;
    }

    public String getPushContent1() {
        return pushContent1;
    }

    public void setPushContent1(String pushContent1) {
        this.pushContent1 = pushContent1;
    }

    public String getPushContent2() {
        return pushContent2;
    }

    public void setPushContent2(String pushContent2) {
        this.pushContent2 = pushContent2;
    }

    public String getPushContent3() {
        return pushContent3;
    }

    public void setPushContent3(String pushContent3) {
        this.pushContent3 = pushContent3;
    }

    public String getPushContent4() {
        return pushContent4;
    }

    public void setPushContent4(String pushContent4) {
        this.pushContent4 = pushContent4;
    }

    public String getPushContent5() {
        return pushContent5;
    }

    public void setPushContent5(String pushContent5) {
        this.pushContent5 = pushContent5;
    }

    public String getPushContentPushTime1() {
        return pushContentPushTime1;
    }

    public void setPushContentPushTime1(String pushContentPushTime1) {
        this.pushContentPushTime1 = pushContentPushTime1;
    }

    public String getPushContentPushTime2() {
        return pushContentPushTime2;
    }

    public void setPushContentPushTime2(String pushContentPushTime2) {
        this.pushContentPushTime2 = pushContentPushTime2;
    }

    public String getPushContentPushTime3() {
        return pushContentPushTime3;
    }

    public void setPushContentPushTime3(String pushContentPushTime3) {
        this.pushContentPushTime3 = pushContentPushTime3;
    }

    public String getPushContentPushTime4() {
        return pushContentPushTime4;
    }

    public void setPushContentPushTime4(String pushContentPushTime4) {
        this.pushContentPushTime4 = pushContentPushTime4;
    }

    public String getPushContentPushTime5() {
        return pushContentPushTime5;
    }

    public void setPushContentPushTime5(String pushContentPushTime5) {
        this.pushContentPushTime5 = pushContentPushTime5;
    }

    public String getPushContentEndTime1() {
        return pushContentEndTime1;
    }

    public void setPushContentEndTime1(String pushContentEndTime1) {
        this.pushContentEndTime1 = pushContentEndTime1;
    }

    public String getPushContentEndTime2() {
        return pushContentEndTime2;
    }

    public void setPushContentEndTime2(String pushContentEndTime2) {
        this.pushContentEndTime2 = pushContentEndTime2;
    }

    public String getPushContentEndTime3() {
        return pushContentEndTime3;
    }

    public void setPushContentEndTime3(String pushContentEndTime3) {
        this.pushContentEndTime3 = pushContentEndTime3;
    }

    public String getPushContentEndTime4() {
        return pushContentEndTime4;
    }

    public void setPushContentEndTime4(String pushContentEndTime4) {
        this.pushContentEndTime4 = pushContentEndTime4;
    }

    public String getPushContentEndTime5() {
        return pushContentEndTime5;
    }

    public void setPushContentEndTime5(String pushContentEndTime5) {
        this.pushContentEndTime5 = pushContentEndTime5;
    }

    /**
     * 获取栏目开关,推送时间,结束时间
     *
     * @param channelId 栏目id
     * @param type      1 获取栏目开关 2 推送时间 3 失效天数
     * @return String
     */
    public String getPushContentOrPushTimeOrEndTime(Integer channelId, Integer type) {
        String temp;
        switch (channelId) {
            case 1:
                temp = type == 1 ? getPushContent1() : type == 2 ? getPushContentPushTime1() : getPushContentEndTime1();
                return temp;
        }
        return null;
    }
}