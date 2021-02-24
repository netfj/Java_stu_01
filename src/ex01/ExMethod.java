package ex01;

/*
 * 一个方法的练习
 */

public class ExMethod {
	
	public static void main(String[] args) {
		printRectangle(4,5);
		
		int z = s(10,10);
		System.out.println(z);
		
		String w = t("aaa","bbb");
		System.out.println(w);
		
	}

	public static void printRectangle(int height, int width) {
		System.out.println("height=" + height + " | width=" + width);
		for (int i = 1; i<=height; i++) {
			for (int n = 1; n<=width; n++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	
	public static int s(int x, int y) {
		return x*y;
	}
	
	public static String t(String x, String y) {
		return x + y;
	}

}
