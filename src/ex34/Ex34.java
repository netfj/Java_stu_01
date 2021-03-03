package ex34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import ex13_interface_Computer.Test01;

public class Ex34 {
	public static void main(String[] args) throws IOException {
		test01("读取文件");
		test02("写入文件");
		test03("以追加方式，写入文件");
		test03("以追加方式，写入文件，带错误处理机制的规范格式");

	}

	public static void test00(String args) {
		System.out.println("== " + args + " ===========");
	}

	public static void test01(String args) throws IOException {
		System.out.println("== " + args + " ===========");
		FileInputStream in = new FileInputStream("test.txt");
		int b = 0;
		while (true) {
			b = in.read();
			if (b == -1) {
				break;
			}
			System.out.println(b);

		}
		in.close();
	}

	public static void test02(String args) throws IOException {
		System.out.println("== " + args + " ===========");

		FileOutputStream out = new FileOutputStream("example.txt");
		String str = "这是一个测试";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out.close();
		System.out.println("写入文件完成！");
	}

	public static void test03(String args) throws IOException {
		System.out.println("== " + args + " ===========");
		OutputStream out = new FileOutputStream("example.txt", true);
		String str = "【这是追加的内容】";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out.close();
		System.out.println("OK!");
	}

	public static void test04(String args)  {
		System.out.println("== " + args + " ===========");

		OutputStream out2 = null;
		try {
			out2 = new FileOutputStream("example.txt", true);
			String str = "【这是追加的内容】";
			byte[] b = str.getBytes();
			for (int i = 0; i < b.length; i++) {
				out2.write(b[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				out2.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		System.out.println("OK!");
	}

}
