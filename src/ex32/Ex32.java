package ex32;

import java.util.ArrayList;

import ex13_interface_Computer.Test01;

public class Ex32 {
	public static void main(String[] args) {
		test01("·ºÐÍ");
	}
	
	
	
	
	
	public static void test00(String args) {
		System.out.println("== " + args + " ===========");
	}
	
	public static void test01(String args) {
		System.out.println("== " + args + " ===========");
		
//		ArrayList list = new ArrayList();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("111");
		list.add("222");
		list.add("test");
		System.out.println(list);
		for (Object object : list) {
			String st = (String) object;
			System.out.println(st);
		}
		
		
		
	}
	
	
	
	
	
	
	public static void test02(String args) {
		System.out.println("== " + args + " ===========");
	}
	
	

}
