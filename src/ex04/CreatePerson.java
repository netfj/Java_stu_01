package ex04;

public class CreatePerson {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.name = "Tom";
		person2.name = "Kite";
		
		
		person1.age = 33;
		person2.age = 55;
		
		person1.speak();
		person2.speak();
		
		
		Dog d1 = new Dog();
		d1.speak();
		
	}
}
