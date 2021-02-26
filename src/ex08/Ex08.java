package ex08;

/*
 * 类中类，及其调用方法示例
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
		// 创建外部类实例，通过实例方法，访问内部类
		OutClass out = new OutClass();
		out.test();
		
		// 直接创建内部类，进行访问
		OutClass.InClass in = new OutClass().new InClass();
		in.dosomething();		
	}
}
