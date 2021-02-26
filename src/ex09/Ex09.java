package ex09;

class Animal{
	String type = "Animal";
	int sex = 0;
	public void shout() {
		System.out.println("Animal shout!");
	}
	
}

class Dog extends Animal{
	String name = "";
	int leg = 4;
	public void shout() {
		super.shout();
		System.out.println("wang wang!");
	}
	
}


public class Ex09 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.name = "中华田园狗花花";
		
		System.out.println("name: "+ d.name +" | type: "+ d.type + " | sex: " + d.sex + " | leg: " + d.leg);
		d.shout();
	}
}
