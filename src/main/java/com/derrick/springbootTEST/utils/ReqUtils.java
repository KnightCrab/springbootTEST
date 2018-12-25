package com.derrick.springbootTEST.utils;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReqUtils {

	public static String getTrim(HttpServletRequest request, String key, String def) {
		String val = request.getParameter(key);
		if (val != null) {
			try {
				return val.trim();
			} catch (Exception e) {
				return def;
			}
		} else {
			return def;
		}
	}

	public static int getInt(HttpServletRequest request, String key, int def) {
		String val = request.getParameter(key);
		if (val != null) {
			try {
				return Integer.parseInt(val);
			} catch (Exception e) {
				return def;
			}
		} else {
			return def;
		}
	}

	public static long getLong(HttpServletRequest request, String key, long def) {
		String val = request.getParameter(key);
		if (val != null) {
			try {
				return Long.parseLong(val);
			} catch (Exception e) {
				return def;
			}
		} else {
			return def;
		}
	}

	public static Date getDateTime(HttpServletRequest request, String key, Date def) {
		String val = request.getParameter(key);
		if (val != null) {
			try {
				return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(val);
			} catch (Exception e) {
				return def;
			}
		} else {
			return def;
		}
	}

//	public static int getCentDouble(HttpServletRequest request, String key, int def) {
//		return getMultiplyDouble(request, key, def, 100);
//	}

//	public static int getMultiplyDouble(HttpServletRequest request, String key, int def, int multval) {
//		// double val = getDouble(request, key, def);
//		String val = request.getParameter(key);
//		if (!StringUtils.isBlankAndNull(val)) {
//			return new BigDecimal(val).multiply(new BigDecimal(multval)).intValue();
//		} else {
//			return def;
//		}
//
//	}

	public static double getDouble(HttpServletRequest request, String key, double def) {
		String val = request.getParameter(key);
		if (val != null) {
			try {
				return Double.parseDouble(val);
			} catch (Exception e) {
				return def;
			}
		} else {
			return def;
		}
	}

	public static BigDecimal getBigDecimal(HttpServletRequest request, String key, BigDecimal def) {
		String val = request.getParameter(key);
		if (val != null) {
			try {
				return new BigDecimal(val.trim());
			} catch (Exception e) {
				return def;
			}
		} else {
			return def;
		}
	}

	/**
	 * 去除以 < 开头 以 > 结尾的html标签
	 * 
	 * @param str
	 * @return
	 */
	public static String filterHtml(String str) {
		Pattern pattern = Pattern.compile("<([^>]*)>");
		Matcher matcher = pattern.matcher(str);
		StringBuffer sb = new StringBuffer();
		boolean result1 = matcher.find();
		while (result1) {
			matcher.appendReplacement(sb, "");
			result1 = matcher.find();
		}
		matcher.appendTail(sb);
		return sb.toString();
	}
}
