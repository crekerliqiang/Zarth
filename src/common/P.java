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
		System.out.print(date + "  " + s);
	}
	private static void println(final String s) {
		print(s);
		System.out.println();
	}
	
	public static void p(String s) {
		println(s);
	}
	public static void p(int s) {
		println(String.valueOf(s));
	}
	public static void p(int [] s) {
		println(Arrays.toString(s));
	}
	public static void p(String info,int [] s) {
		print(info);
		System.out.println(Arrays.toString(s));
	}
}
