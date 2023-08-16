package com.test.question.q97;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Item {

	private String name;

	private Calendar expiration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpiration() {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = simpleDateFormat.format(expiration.getTime());
		return strDate;
	}

	public void setExpiration(String expiration) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = simpleDateFormat.parse(expiration);
			Calendar calendar = Calendar.getInstance();//문자열을 Date 타입으로 바꾼다. 그래야 Calendar의 setTime 메소드를 사용해서 Calendar타입으로 변환 가능해
			calendar.setTime(date);
			this.expiration = calendar;
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
