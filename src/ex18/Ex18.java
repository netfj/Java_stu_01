package ex18;

public class Ex18 {
	public static void main(String[] args) {
		try {
			int re = divide(4, 10);
			System.out.println(re);
		} catch (Exception e) {
			System.err.println(e);
			System.out.println("�쳣��Ϣ��" + e.getMessage());
			return;
		}finally {
			System.out.println("finally is running ... �����º���");
		}
		
		System.out.println("Going on ...");
	}
	
	public static int divide(int x, int y) {
		int re = x / y;
		return re;
	}
}
