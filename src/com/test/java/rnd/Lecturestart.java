package com.test.java.rnd;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Lecturestart {

	public static void main(String[] args) {

		String s = StartDay();

	}

	private static String StartDay() {
		
		String s = "";
		try {
			
		String[] startDay1 = { "2020", "2021", "2022", "2023" };
		String[] startDay2 = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
	
		Random rnd = new Random();

		BufferedWriter writer = new BufferedWriter(new FileWriter("data\\start.txt"));

		String start = startDay1[rnd.nextInt(startDay1.length)] + startDay2[rnd.nextInt(startDay2.length)]; 
		
		s = String.format("%s\r\n", start);
		writer.write(s);
	
		writer.close();
		// 01~12
		} catch (Exception e) {
			System.out.println("at Lecturestart.StartDay");
			e.printStackTrace();
		}
		
		return s;

	}

}
