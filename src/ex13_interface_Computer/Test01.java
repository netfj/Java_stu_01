package ex13_interface_Computer;

public class Test01 {
	public static void main(String[] args) {
		
		System.out.println("\n����һ̨����");
		Computer c = new Computer();
		
		System.out.println("\n��װ����");
		KeyBoard k = new KeyBoard();
		c.add(k);
		
		System.out.println("\n��װ���");
		Mouse m = new Mouse();
		c.add(m);
		
		System.out.println("\n�򿪵�Դ ....");
		c.powerOn();
		
		System.out.println("\n��ʾUSB�豸�б�");
		c.getUsbName();
		
		System.out.println("\n�رյ�Դ��");
		c.powerOff();
		
	}
}
