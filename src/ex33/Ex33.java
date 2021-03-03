package ex33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex33 {
	public static void main(String[] args) throws IOException {
		test01("¸´ÖÆÎÄ¼þ");
		

	}

	public static void test00(String args) {
		System.out.println("== " + args + " ===========");
	}

	public static void test01(String args) throws IOException  {
		System.out.println("== " + args + " ===========");
		
		InputStream in = new FileInputStream("example.txt");
		OutputStream out = new FileOutputStream("copy.txt");
		
		int len;
		
		long beginTime = System.currentTimeMillis();
		
		while ((len = in.read()) != -1) {
			out.write(len);		
			System.out.print(len);
		}
		
		long endTime = System.currentTimeMillis();
		
		in.close();
		out.close();
		System.out.println("\n--------------");
		System.out.println(args + " : Ok !");
		System.out.println("Use time: " + (endTime - beginTime) + " hm");
	}

	

}
