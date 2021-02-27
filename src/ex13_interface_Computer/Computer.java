package ex13_interface_Computer;

//一台计算机的类

public class Computer {
	private USB[] usbArr = new USB[4];
	public void add(USB usb) {
		for (int i=0; i < usbArr.length; i++) {
			if( usbArr[i] == null ) {
				usbArr[i] = usb;
				break;
			}
		}
	}
	
	public void powerOn() {
		for (int i = 0; i<usbArr.length; i++) {
			if (usbArr[i] != null) {
				usbArr[i].turnOn();
			}
		}
	}
	
	public void powerOff() {
		for (int i = 0; i<usbArr.length; i++) {
			if (usbArr[i] != null) {
				usbArr[i].turnOff();
			}
		}
	}
	
	public void getUsbName() {
		for (int i = 0; i<usbArr.length; i++) {
			if (usbArr[i] != null) {
				String name = usbArr[i].getName();
				System.out.println(name);
			}
		}
	}

}
