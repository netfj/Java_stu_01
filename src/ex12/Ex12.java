package ex12;

/*
 * 接口
 */

interface Animal{
	public void eat();
	public void shout();
}

interface Pet{
	public void id();
}

// 演示 类 继承了 2 个接口
class Cat implements Animal,Pet{
	public void eat() {
		System.out.println("cat eat fish.");
	}
	public void shout() {
		System.out.println("cat shout: miao ~~~~~~ ");
	}
	public void id() {
		System.out.println("my id is : 001");
	}
}


//演示接口之间的继承
interface LandAnimal extends Animal{
	public void walk();
}
class Dog implements LandAnimal{
	public void eat() {
		System.out.println("dog eat meat.");
	}
	public void shout() {
		System.out.println("dog shout: wang ~~~~~~ ");
	}
	public void walk() {
		System.out.println("dog walk on land !");
	}
}


public class Ex12 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.shout();
		c.id();
		
		Dog d = new Dog();
		d.eat();
		d.shout();
		d.walk();
	}
}
