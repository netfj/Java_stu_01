package ex08;

/*
 * �����࣬������÷���ʾ��
 */

class OutClass {
	int number = 4;
	class InClass {
		public void dosomething() {
			System.out.println("The number is : " + number);
		}
	}

	public void test() {
		InClass in = new InClass();
		in.dosomething();
	}

}

public class Ex08 {
	public static void main(String[] args) {
		// �����ⲿ��ʵ����ͨ��ʵ�������������ڲ���
		OutClass out = new OutClass();
		out.test();
		
		// ֱ�Ӵ����ڲ��࣬���з���
		OutClass.InClass in = new OutClass().new InClass();
		in.dosomething();		
	}
}
