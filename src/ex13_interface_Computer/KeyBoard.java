package ex13_interface_Computer;

//USB¼üÅÌ

public class KeyBoard implements USB {
	
	@Override
	public void turnOn() {
		System.out.println("Keyboard is power on!");
	}

	@Override
	public void turnOff() {
		System.out.println("Keyboard is power off!");
	}

	@Override
	public String getName() {
		return "USB-KeyBoard" ;
	}
	
}
