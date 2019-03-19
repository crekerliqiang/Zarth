package common;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import string.kmp.Data;

public class P {
	private static SimpleDateFormat sDate = new 
			SimpleDateFormat("yyyy-MM-dd  HH:mm:ss/SSS");

	private static void print(final String s) {
        String date = sDate.format(new Date(System.currentTimeMillis()));
		System.out.println(date + "  " + s);
	}
	public static void p(String s) {
		print(s);
	}
	public static void p(int s) {
		print(String.valueOf(s));
	}
	public static void p(int [] s) {
		print(Arrays.toString(s));
	}
}
