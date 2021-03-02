package ex21;

public class Ex21 {
	public static void main(String[] args) {
		try {
			int result = divede(4, -2);
			
		} catch (DivedeByMinusException e) {
			System.err.println(e);
		}
		
		
	}
	
	public static int divede(int x, int y) throws DivedeByMinusException {
		if (y==0) {
			throw new DivedeByMinusException("自定义异常信息： 除数是0");
		}
		if (y<0) {
			throw new DivedeByMinusException("自定义异常信息： 除数 小于0， 这是不被允许的");
		}
		int result = x / y;
		return result;
	}
}
