package ex11;

class A {
	public A(String name) {
		System.out.println("我是：" + name);
		System.out.println("A 运行了");
	}
}

class B extends A {
	public B() {
		super("B传递的参数 001");
		System.out.println("B 运行了！");
	}
}

public class Ex11 {
	public static void main(String[] args) {
		B b = new B();
	}
}
