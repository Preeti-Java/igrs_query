package com.cg.neel.igrs.query.utils;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Preeti
 *
 */
public class Utils {
	
	private Utils() {
		throw new IllegalStateException("Utils Class");
	}

	/**
	 * @return today date
	 */
	public static Date getDate() {
		final Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(new Date().getTime());
		cal.add(Calendar.SECOND,0);
		return new Date(cal.getTime().getTime());
	    }

	/**
	 * @return local time
	 */
	public static LocalDateTime getLocalDateTime() {
		return LocalDateTime.now();
	}

	/**
	 * @param request
	 * @return url
	 */
	public static String getAppUrl(HttpServletRequest request) {
		return "http://"+ request.getServerName()+":" + request.getServerPort() + request.getContextPath();
	}
	
}
