package ex05;

class Person{
	
	String name;
	int age;
	
	public Person(String con_name, int con_age){
		name = con_name;
		age = con_age;
	}
	
	public Person(String con_name) {
		name = con_name;
	}
	
	public void speak() {
		System.out.println("我是：" + name + ", 年龄：" + age);
	}
}

public class ConstructionMethod {
	public static void main(String[] args) {
		Person p1 = new Person("张三", 20);
		Person p2 = new Person("王老五");
		p1.speak();
		p2.speak();
	}

}
