package cn.itcast.chapter01;

public class HelloWorld {
	public static void main (String[] args) {
		System.out.println("Hello world ! git test!");	
		HelloWorld.t();
		HelloWorld.bb();
	}
	
	public static void t(){
	      System.out.println("yes!"); 
	   }
	
	public static void bb() {
		/*
		 * 强制类型转换
		 */
		int num = 4;
		byte xx = (byte) num;
		System.out.println(xx);
		
		byte a ;
		int b = 298 ;
		a=(byte)b;
		System.out.println(""+a+"|"+""+b);
		
		int c = 5;
		System.out.println(""+ c + "\n-----");
		c++;
		System.out.println(""+ c);
		++c;
		System.out.println(""+ c);
		c--;
		System.out.println(""+ c);
		--c;
		System.out.println(""+ c);
		
		System.out.println(5%2);
		
	}
	
	
}
