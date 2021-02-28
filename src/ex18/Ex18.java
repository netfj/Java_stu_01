package ex18;

public class Ex18 {
	public static void main(String[] args) {
		try {
			int re = divide(4, 10);
			System.out.println(re);
		} catch (Exception e) {
			System.err.println(e);
			System.out.println("异常信息：" + e.getMessage());
			return;
		}finally {
			System.out.println("finally is running ... 进行事后处理！");
		}
		
		System.out.println("Going on ...");
	}
	
	public static int divide(int x, int y) {
		int re = x / y;
		return re;
	}
}
