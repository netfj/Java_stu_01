package ex11;

class A {
	public A(String name) {
		System.out.println("���ǣ�" + name);
		System.out.println("A ������");
	}
}

class B extends A {
	public B() {
		super("B���ݵĲ��� 001");
		System.out.println("B �����ˣ�");
	}
}

public class Ex11 {
	public static void main(String[] args) {
		B b = new B();
	}
}
