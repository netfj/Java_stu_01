package ex15;

class Animal{
	public Animal() {
		System.out.println("I running... no args");
	}
	public Animal(String[] args) {
		System.out.println("\nhave args: " + args.length);
		System.out.println("���ǣ�" + args[0] );
		System.out.println("�ҵĽ�����" + args[1] );
		System.out.println("�ҵ�ʳ�" + args[2] );
	}
}

public class Ex15 {
	
	public static void main(String[] args) {
		Animal a = new Animal();
				
		String[] str = {"a","b","c"};
		Animal b = new Animal(str);

		String[] str2 = {"è","������~~~","�����"};
		Animal c = new Animal(str2);
		
		String[] str3 = {"��","������~~~","���ͷ"};
		Animal d = new Animal(str3);
		
		
		
		
		
	}
	
	

}
