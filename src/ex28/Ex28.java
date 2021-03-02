package ex28;


public class Ex28 {
	public static void main(String[] args) {
		Integer num = new Integer(200);
		int a = 200;
		System.out.println(a + num);
		System.out.println(a + num.intValue());
		
		System.out.println("----");
		System.out.println(a == num);
		System.out.println(a > num);
		System.out.println(a+1 > num);
		
		
		System.out.println("=====");
		System.out.println(a == num.intValue());
		System.out.println(a+1 > num.intValue());
		
		System.out.println("--~~~~~~~~~~~~~~~~-");
		System.out.println(num);
		System.out.println(a == num.intValue());
		
		String s = "123";
		System.out.println(s);
		int aa = 1; 
		int[] bb = new int[3];
		int cc = 0;
		
		bb[0] = Integer.parseInt(s);
		cc = aa + bb[0];
		System.out.println(cc);
		
		
	}
}
