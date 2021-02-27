package ex14;

class Test {
	public String getName() {
		return "Dog";
	}
}

public class Ex14 {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.getName());
	}
}
