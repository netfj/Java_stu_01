package ex13_interface_Computer;

interface USB {
	public static final String name = "USB equipment";
	public abstract void turnOn();		//����ʱ�Ķ���
	public abstract void turnOff();		//�ػ�ʱ�Ķ���
	public abstract String getName();	//���ر�USB�豸������
}
