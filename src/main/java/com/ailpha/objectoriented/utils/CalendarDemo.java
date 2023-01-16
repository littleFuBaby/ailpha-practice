package com.ailpha.objectoriented.utils;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println(calendar.getTime());
		System.out.println(calendar.getFirstDayOfWeek());
	}

}
