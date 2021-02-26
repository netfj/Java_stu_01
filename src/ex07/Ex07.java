package ex07;

class Person {
	static {
		System.out.println("I actiong!");
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
	}
}
