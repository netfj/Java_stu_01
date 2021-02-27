package ex12;

/*
 * �ӿ�
 */

interface Animal{
	public void eat();
	public void shout();
}

interface Pet{
	public void id();
}

// ��ʾ �� �̳��� 2 ���ӿ�
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


//��ʾ�ӿ�֮��ļ̳�
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
