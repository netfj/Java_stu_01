package ex06;

class Person {
	private String name;

	public Person() { // �չ��췽�������Ե����вι��췽��
		this("Ĭ������");
	}

	public Person(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("My name is " + this.name);
	}
}

public class Ex06 {
	public static void main(String[] args) {

		Person p1 = new Person();
		p1.speak();

		Person p2 = new Person("����");
		p2.speak();
	}
}
