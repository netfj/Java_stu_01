package ex24;

public class Ex24 {
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			System.out.println(i);
		}

		long endTime = System.currentTimeMillis();
		
		System.out.println("ÓÃÊ±" + (endTime - startTime) + "ºÁÃë");

		
	}
}
