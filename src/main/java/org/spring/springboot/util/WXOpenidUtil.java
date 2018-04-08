package org.spring.springboot.util;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	    public static JSONObject auth(HttpServletRequest request, HttpServletResponse response,String code)
	            throws ServletException, IOException {
	        String echostr = request.getParameter("echostr");
	        JSONObject userInfoJO = null;
	        if(echostr==null){
	            String appId =  WxPayConfig.APP_ID ;
	            String appSecret =  WxPayConfig.APP_SECRET;
	            //拼接
	            String get_access_token_url = "https://api.weixin.qq.com/sns/oauth2/access_token?"
	                    + "appid="
	                    + appId
	                    + "&secret="
	                    + appSecret
	                    + "&code=CODE&grant_type=authorization_code";
	            String get_userinfo = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
	            request.setCharacterEncoding("UTF-8");
	            response.setCharacterEncoding("UTF-8");
	            //String code = request.getParameter("code");
	            System.out.println("******************code=" + code);
	            get_access_token_url = get_access_token_url.replace("CODE", code);
	            String json = HttpsGetUtil.doHttpsGetJson(get_access_token_url);
	            logger.info("--json:"+json);
	            JSONObject jsonObject = JSONObject.fromObject(json);
	            String access_token = jsonObject.getString("access_token");
	            String openid = jsonObject.getString("openid");
	            get_userinfo = get_userinfo.replace("ACCESS_TOKEN", access_token);
	            get_userinfo = get_userinfo.replace("OPENID", openid);
	            String userInfoJson = HttpsGetUtil.doHttpsGetJson(get_userinfo);
	            logger.info("--userInfoJson:"+userInfoJson);
	           userInfoJO = JSONObject.fromObject(userInfoJson);
	           
	            
	        }
	        return userInfoJO;
	    }
}
	    
