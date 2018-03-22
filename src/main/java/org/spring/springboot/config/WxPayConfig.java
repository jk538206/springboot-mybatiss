package org.spring.springboot.config;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class WxPayConfig {
	// appid
	public static String APP_ID = "wxc5d65a9f1d135c04";
	// JSAPI接口中获取openid
	public static String APP_SECRET = "fca2f17347d453702f4983b53ee7c4af";
	// 商户ID
	//public static String MCH_ID = "1494364032";
	// 商户支付密钥Key
	//public static String KEY = "9IOJIRTH456789ERTYUIO456789RTYUI";
	//public static String KEY = "23456789ERTYUIODFGHJK34567890678";
	//23456789ERTYUIODFGHJK34567890678
	// 异步回调地址
//	public static String NOTIFY_URL = "http://wx.qunxiongzb.com/wxpayLiu/v_3/notify";
	//public static String NOTIFY_URL = "http://agent.qunxiongzb.com/notify/wxpay.action";
	
	// 字符编码
	public static String CHARTSET = "UTF-8";
	// 加密方式
	public static String SIGN_TYPE = "MD5";
	// 微信授权重定向地址
	public static String REDIRECT_URI;
	
	static {
		try {
			REDIRECT_URI = URLEncoder.encode("http://wx.qunxiongzb.com/wxpayLiu/v_3/pay", CHARTSET);
			//REDIRECT_URI = URLEncoder.encode("www.baidu.com", CHARTSET);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}

	
	