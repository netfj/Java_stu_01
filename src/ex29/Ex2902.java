package ex29;
/*
 * ÈÕÆÚ
 */
import java.util.Calendar;
import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Ex2902 {
	public static void main(String[] args) {
		test01();
	}
	
	public static void test01() {
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(new Date(12,31,2020));
		System.out.println(date.equals(new Date(2000,2,18)));
		
		System.out.println("\n== Calendar ÊÔÑé ====");
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow);
		System.out.println(rightNow.getWeekYear());
	}
}