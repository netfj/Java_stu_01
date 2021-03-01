package ex19;

import cn.itcast.chapterdemo.Test;

public class Ex19 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		
		try {
			int re = test(arr);
			System.out.println(re);
			
		} catch (Exception e) {
			System.out.println("Wrong:");
			System.err.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getClass());
			
		}
		
	}
	
	
	public static int test(int[] arr) {
		int re = arr[7];
		System.out.println("test");
		return re;
	}		

}



