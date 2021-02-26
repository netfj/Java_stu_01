package ex10;

class A{
	String className = "A";
	A() {
		System.out.println("A �ļ̳й�ϵ: " + className);
	}
}

class B extends A{
	String className = "B";
	B() {
		className = super.className + className;
		System.out.println("B �ļ̳й�ϵ: " + className);
	}
}

class C extends B{
	String className = "C";
	C() {
		className = super.className + className;
		System.out.println("C �ļ̳й�ϵ: " + className);
	}
}

public class Ex10 {
	public static void main(String[] args) {
		C c = new C();
	}
}
