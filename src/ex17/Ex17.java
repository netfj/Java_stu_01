package ex17;

public class Ex17 {
	public static void main(String[] args) {
		int an = divide(4, 0);
		System.out.println(an);
	}
	
	public static int divide(int x, int y) {
		try {
			int result = x/y;
			return result;
		} catch (Exception e) {
			System.err.println(e);
			return -1;
		}
		
		
		
	}
}
