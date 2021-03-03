package ex35;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex35 {
	public static void main(String[] args) throws IOException {
		test01("复制文件，使用缓冲区");
		test02("复制文件：字节缓冲流 测试");

	}

	public static void test00(String args) {
		System.out.println("== " + args + " ===========");
	}

	public static void test01(String args) throws IOException {
		System.out.println("== " + args + " ===========");
		InputStream in = new FileInputStream("card.pdf");
		OutputStream out = new FileOutputStream("card_copy.pdf");
		byte[] buff = new byte[1024];
		int len;
		
		while((len = in.read(buff)) != -1) {
			out.write(buff, 0, len);
		}
		
		in.close();
		out.close();
		System.out.println("OK!");
	}

	public static void test02(String args) throws IOException {
		System.out.println("== " + args + " ===========");
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test_01.txt"));
		int len;
		while( (len = bis.read()) != -1) {
			bos.write(len);
		}
		bis.close();
		bos.close();
		System.out.println("OK!");
	}
		
}
