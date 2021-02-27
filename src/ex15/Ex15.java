package ex15;

class Animal{
	public Animal() {
		System.out.println("I running... no args");
	}
	public Animal(String[] args) {
		System.out.println("\nhave args: " + args.length);
		System.out.println("我是：" + args[0] );
		System.out.println("我的叫声：" + args[1] );
		System.out.println("我的食物：" + args[2] );
	}
}

public class Ex15 {
	
	public static void main(String[] args) {
		Animal a = new Animal();
				
		String[] str = {"a","b","c"};
		Animal b = new Animal(str);

		String[] str2 = {"猫","喵喵喵~~~","鱼和鼠"};
		Animal c = new Animal(str2);
		
		String[] str3 = {"狗","旺旺旺~~~","大骨头"};
		Animal d = new Animal(str3);
		
		
		
		
		
	}
	
	

}
