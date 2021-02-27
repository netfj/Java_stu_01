package ex13_interface_Computer;

interface USB {
	public static final String name = "USB equipment";
	public abstract void turnOn();		//开机时的动作
	public abstract void turnOff();		//关机时的动作
	public abstract String getName();	//返回本USB设备的名称
}
