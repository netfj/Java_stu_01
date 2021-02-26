package ex10;

class A{
	String className = "A";
	A() {
		System.out.println("A 的继承关系: " + className);
	}
}

class B extends A{
	String className = "B";
	B() {
		className = super.className + className;
		System.out.println("B 的继承关系: " + className);
	}
}

class C extends B{
	String className = "C";
	C() {
		className = super.className + className;
		System.out.println("C 的继承关系: " + className);
	}
}

public class Ex10 {
	public static void main(String[] args) {
		C c = new C();
	}
}
