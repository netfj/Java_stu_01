package ex06;

class Person {
	private String name;

	public Person() { // 空构造方法，可以调用有参构造方法
		this("默认姓名");
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

		Person p2 = new Person("张三");
		p2.speak();
	}
}
