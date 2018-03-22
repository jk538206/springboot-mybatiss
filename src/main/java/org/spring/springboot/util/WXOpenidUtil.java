package org.spring.springboot.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.spring.springboot.config.WxPayConfig;

import net.sf.json.JSONObject;

public class WXOpenidUtil {
	
	private static final Log logger = LogFactory.getLog(WXOpenidUtil.class);

	public static String getOpenId(String code) {
		String openParam = "appid=" + WxPayConfig.APP_ID + "&secret=" + WxPayConfig.APP_SECRET + "&code=" + code + "&grant_type=authorization_code";
		String openJsonStr = HttpClientUtil.sendGET("https://api.weixin.qq.com/sns/oauth2/access_token", openParam);
		logger.info("openJsonStr:"+openJsonStr);
		
		// 获取openid
		JSONObject openJson = JSONObject.fromObject(openJsonStr);
		String openid = openJson.getString("openid");
		logger.info("openid :"+openid );
		return openid;
	} 
}
