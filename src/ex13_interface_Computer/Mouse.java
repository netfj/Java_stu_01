package ex13_interface_Computer;

//USB Û±Í

public class Mouse implements USB {

	@Override
	public void turnOn() {
		System.out.println("Mouse is on warking!");

	}

	@Override
	public void turnOff() {
		System.out.println("Mouse is off!");

	}


	@Override
	public String getName() {
		return "USB-Mouse";
	}
	
}
