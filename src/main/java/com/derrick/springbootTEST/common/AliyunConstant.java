package com.derrick.springbootTEST.common;

public class AliyunConstant {
	// 短信验证码有效时间
	public final static Integer SMS_TIME = 300;
	// 短信间隔发送时间
	public final static Integer SMS_TIME_TEMP = 240;

	// 阿里云 区域
	// 设置URL过期时间为3小时
	public final static Integer ACCESS_EXPIRATION = 5 * 24 * 3600 * 1000;

	// 直播短信提醒模板
	public final static String SMS_LIVE_CODE = "SMS_134325102";

	// 直播短信变量名
	public final static String SMS_LIVE_PARM = "name,title,time";


	// 阿里云bucket类型
	public final static String OSS_AUDIO = "audio";
	public final static String OSS_VIDEO = "video";
	public final static String OSS_IMAGE = "images";
	public final static String OSS_MATERIAL = "material";
	
	// 阿里云文件
	public final static String HEADIMG_PREFIX = "headimages/";
	public final static String COVERIMG_PREFIX = "cover/";
	public final static String BANNERIMG_PREFIX = "banner/";

	// STS临时凭证
	public final static String ALIYUN_STS_ACCESSKEYID = "LTAIeJ06E4M8IGwE";
	public final static String ALIYUN_STS_ACCESSKEYSECRET = "VqhGUySiBtIvV9kAONYZr9qpjFuLUY";
	public final static String ALIYUN_STS_POLICY = "{\"Statement\": [{\"Action\": [\"oss:*\"],\"Effect\": \"Allow\",\"Resource\": [\"acs:oss:*:*:*\"]}],\"Version\": \"1\"}";
	public final static String ALIYUN_STS_ROLEARN = "acs:ram::1012275898316480:role/aliyunosstokengeneratoruser";
	public final static String ALIYUN_STS_TOKENEXPIRETIME = "900";
	public final static String ALIYUN_STS_POLICYFILE = "./Policy/all_policy.txt";
	// 目前只有"cn-hangzhou"这个region可用, 不要使用填写其他region的值
	public static final String REGION_CN_HANGZHOU = "cn-hangzhou";
	// 当前 STS API 版本
	public static final String STS_API_VERSION = "2015-04-01";


	public final static String KEY_TIME = "yyyyMMddhhmmss";

}
