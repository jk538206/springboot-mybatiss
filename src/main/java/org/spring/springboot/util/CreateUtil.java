package org.spring.springboot.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class CreateUtil {

	public static String CreateUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static String createDate() {
		 Date dt=new Date();
	     SimpleDateFormat matter=new SimpleDateFormat("yyyy-MM-dd");
		return matter.format(dt);
	}
	public static String createTime() {
		Calendar now = Calendar.getInstance();
		String time;
		time = ""+now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND);
		return time;
	}
	
}
