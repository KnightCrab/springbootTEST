package com.derrick.springbootTEST.common;

/**
 * Created by Administrator on 2018/3/14.
 */
public class Constant {

    /**
     * 成功
     */
    public static int SUCCESS = 200;

    /**
     * TOKEN加密KEY
     */
    public final static String TOKEN_KEY = "20160728@xzj";

    /**
     * 数据集合
     */
    public final static String PAGE_RESULT_LIST = "result";

    /**
     * 总记录数
     */
    public final static String PAGE_TOTAL_NUM = "totalNum";

    /**
     * 总页数
     */
    public final static String PAGE_TOTAL_PAGE = "totalPage";

    /**
     * 当前页码
     */
    public final static String PAGE_NUM = "pageNum";

    /**
     * 每页显示数量
     */
    public final static String PAGE_SIZE = "pageSize";

    /**
     * 阿里云文件类型[图片]
     */
    public final static Integer OSS_FILE_TYPE_IMAGE = 1;
    /**
     * 阿里云文件类型[视频]
     */
    public final static Integer OSS_FILE_TYPE_VIDEO = 2;
    /**
     * 阿里云文件类型[音频]
     */
    public final static Integer OSS_FILE_TYPE_AUDIO = 3;
    /**
     * 阿里云文件类型[文档]
     */
    public final static Integer OSS_FILE_TYPE_MATERIAL = 4;

    /**
     * 评价回复类型：课程
     */
    public static Integer COMMENT_COURSE = 1;

    /**
     * 评价回复类型：笔记
     */
    public static Integer COMMENT_NOTE = 2;

    /**
     * 评价回复类型：练习
     */
    public static Integer COMMENT_PRACTICE = 3;

    /**
     * 评价回复类型：文章
     */
    public static Integer COMMENT_ARTICLE = 4;



    /**
     * CODE_LIMIT_PAY_1 [1：微信支付]
     */
    public static Integer CODE_LIMIT_PAY_WECHAT = 1;

    /**
     * CODE_LIMIT_PAY_2 [2：支付宝支付]
     */
    public static Integer CODE_LIMIT_PAY_ALIPAY = 2;

    /**
     * CODE_LIMIT_PAY_3 [3：IOS内购]
     */
    public static Integer CODE_LIMIT_PAY_IOS = 3;

    /**
     * CODE_LIMIT_PAY_4 [4：账户支付]
     */
    public static Integer CODE_LIMIT_PAY_ACCOUNT = 4;

    /**
     * CODE_LIMIT_PAY_8 [8：积分兑换]
     */
    public static Integer CODE_LIMIT_PAY_SCORE = 8;


    /**
     * CODE_PAY_TYPE_1 [1：充值]
     */
    public static String CODE_PAY_TYPE_1 = "1";

    /**
     * CODE_PAY_TYPE_2 [2：消费]
     */
    public static String CODE_PAY_TYPE_2 = "2";

    /**
     * CODE_ORDER_STATUS_0 [0：失败]
     */
    public static Integer CODE_ORDER_STATUS_0 = 0;

    /**
     * CODE_ORDER_STATUS_1 [1：待支付]
     */
    public static Integer CODE_ORDER_STATUS_1 = 1;

    /**
     * CODE_ORDER_STATUS_2 [2：支付完成]
     */
    public static Integer CODE_ORDER_STATUS_2 = 2;

    /**
     * CODE_ORDER_DELETE_0 [0：没删除]
     */
    public static Integer CODE_ORDER_DELETE_0 = 0;

    /**
     * CODE_ORDER_DELETE_1 [1：已删除]
     */
    public static final String CONTENT_FORMAT_1 = "1";

    /**
     * CODE_ORDER_WAY_1 [1：客户端]
     */
    public static Integer CODE_ORDER_WAY_1 = 1;
    /**
     * CODE_ORDER_WAY_2 [0：后台]
     */
    public static Integer CODE_ORDER_WAY_2 = 2;

    /**
     * CODE_CLIENT_TYPE_1 [1：微信]
     */
    public static Integer CODE_CLIENT_TYPE_1 = 1;
    /**
     * CODE_CLIENT_TYPE_2 [2：安卓]
     */
    public static Integer CODE_CLIENT_TYPE_2 = 2;
    /**
     * CODE_CLIENT_TYPE_3 [3：苹果]
     */
    public static Integer CODE_CLIENT_TYPE_3 = 3;
    /**
     * CODE_CLIENT_TYPE_4 [4：PC网站]
     */
    public static Integer CODE_CLIENT_TYPE_4 = 4;

    /**
     * CODE_SCORE_RULE_STATUS_0 [0:无效]
     */
    public static Integer CODE_SCORE_RULE_STATUS_0 = 0;

    /**
     * CODE_SCORE_RULE_STATUS_1 [1:有效]
     */
    public static Integer CODE_SCORE_RULE_STATUS_1 = 1;

    public static Integer TEST_INTEGRAL = 20;

    /**
     * CODE_PUSH_CONTENT_TYPE_1 [1:课程]
     */
    public static Integer CODE_PUSH_CONTENT_TYPE_1 = 1;

    /**
     * CODE_PUSH_CONTENT_TYPE_2 [2:直播]
     */
    public static Integer CODE_PUSH_CONTENT_TYPE_2 = 2;

    /**
     * CODE_PUSH_CONTENT_TYPE_1 [3:活动]
     */
    public static Integer CODE_PUSH_CONTENT_TYPE_3 = 3;

    /**
     * CODE_PUSH_CONTENT_TYPE_2 [4:内容]
     */
    public static Integer CODE_PUSH_CONTENT_TYPE_4 = 4;

    /**
     * CODE_PUSH_CONTENT_TYPE_1 [5:购买会员]
     */
    public static Integer CODE_PUSH_CONTENT_TYPE_5 = 5;

    /**
     * CODE_PUSH_DISPLAY_TYPE_0 [0:通知]
     */
    public static Integer CODE_PUSH_DISPLAY_TYPE_0 = 0;

    /**
     * CODE_PUSH_DISPLAY_TYPE_1 [1:消息]
     */
    public static Integer CODE_PUSH_DISPLAY_TYPE_1 = 1;

    /**
     * CODE_PUSH_OPERATE_0 [0:打开应用]
     */
    public static Integer CODE_PUSH_OPERATE_0 = 0;

    /**
     * CODE_PUSH_OPERATE_1 [1:打开自定义窗体]
     */
    public static Integer CODE_PUSH_OPERATE_1 = 1;

    /**
     * MAP_KEY_推送内容ID[content_id]
     */
    public static String MAP_KEY_PUSH_OBJECT_ID = "object_id";

    /**
     * MAP_KEY_推送内容类型[content_type]
     */
    public static String MAP_KEY_PUSH_OBJECT_TYPE = "object_type";

    /**
     * MAP_KEY_推送打开类型[go_open]
     */
    public static String MAP_KEY_PUSH_GO_OPEN = "go_open";

    /**
     * MAP_KEY_推送打开子类型[sub_type]
     */
    public static String MAP_KEY_PUSH_SUB_TYPE = "sub_type";

    /**
     * CODE_PUSH_PRODUCTION_MODEL_0 [0:正式模式]
     */
    public static Integer CODE_PUSH_PRODUCTION_MODEL_0 = 0;

    /**
     * CODE_PUSH_PRODUCTION_MODEL_1 [1:测试模式]
     */
    public static Integer CODE_PUSH_PRODUCTION_MODEL_1 = 1;

    /**
     * CODE_PUSH_IOS_GO_OPEN_0 [0:打开应用]
     */
    public static String CODE_PUSH_IOS_GO_OPEN_0 = "0";

    /**
     * CODE_PUSH_IOS_GO_OPEN_2 [2:打开窗体]
     */
    public static String CODE_PUSH_IOS_GO_OPEN_2 = "2";

    /**
     * CODE_PUSH_IOS_GO_OPEN_3 [3:打开自定义内容]
     */
    public static String CODE_PUSH_IOS_GO_OPEN_3 = "3";

    /**
     * CODE_PUSH_STATUS_0 [0:发送失败]
     */
    public static Integer CODE_PUSH_STATUS_0 = 0;

    /**
     * CODE_PUSH_STATUS_1 [1:待发送]
     */
    public static Integer CODE_PUSH_STATUS_1 = 1;

    /**
     * CODE_PUSH_STATUS_2 [2:发送成功]
     */
    public static Integer CODE_PUSH_STATUS_2 = 2;

    /**
     * DATE_FORMAT_PATTEN_yyyy-MM-dd HH:mm:ss[年月日时分秒]
     */
    public static String DATE_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";


    /**
     * CONTENT_PUBLISH_STATUS_1[内容发布状态]：已发布
     */
    public static Integer CONTENT_PUBLISH_STATUS_1 = 1;
    /**
     * CONTENT_PUBLISH_STATUS_2[内容发布状态]：待发布
     */
    public static Integer CONTENT_PUBLISH_STATUS_2 = 2;
}
