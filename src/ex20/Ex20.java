package ex20;

public class Ex20 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			int re = test(arr, 0);
			System.out.println(re);
		} catch (ArrayIndexOutOfBoundsException e) {
			// 组组错误：超出较索引最大数
			System.out.println(e);
		} catch (ArithmeticException e) {
			// 数学错误：被除数是 0
			System.out.println("1." + e);
			System.out.println("----");
			e.printStackTrace();
			System.out.println("----");
			System.err.println(e);
			
		}
		
	}
	
	public static int test(int args[], int b) {
		return args[1] / b;
	}
	
}
