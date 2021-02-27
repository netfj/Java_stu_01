package ex13_interface_Computer;

public class Test01 {
	public static void main(String[] args) {
		
		System.out.println("\n构造一台电脑");
		Computer c = new Computer();
		
		System.out.println("\n安装键盘");
		KeyBoard k = new KeyBoard();
		c.add(k);
		
		System.out.println("\n安装鼠标");
		Mouse m = new Mouse();
		c.add(m);
		
		System.out.println("\n打开电源 ....");
		c.powerOn();
		
		System.out.println("\n显示USB设备列表");
		c.getUsbName();
		
		System.out.println("\n关闭电源。");
		c.powerOff();
		
	}
}
