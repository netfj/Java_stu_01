package ex26;

import java.util.Random;

public class Ex26 {
	public static void main(String[] args) {
		System.out.println(Math.abs(-9));
		System.out.println(Math.ceil(9.1));
		System.out.println(Math.floor(9.1));
		System.out.println(Math.round(9.1));
		
		System.out.println(Math.max(9.1,1));
		System.out.println(Math.min(9.1,1));
		
		System.out.println("随机数-------------------");
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(100));
		
		System.out.println("随机数-------------------");
			
		
		Random random = new Random(10);
		for (int j = 0; j < 10; j++) {
			System.out.println(random.nextInt(100));
		}
		
		
		
		
		
		}
	}
}
