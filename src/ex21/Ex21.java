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
			throw new DivedeByMinusException("�Զ����쳣��Ϣ�� ������0");
		}
		if (y<0) {
			throw new DivedeByMinusException("�Զ����쳣��Ϣ�� ���� С��0�� ���ǲ��������");
		}
		int result = x / y;
		return result;
	}
}
