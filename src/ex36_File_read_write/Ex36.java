package ex36_File_read_write;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex36 {
	public static void main(String[] args) throws IOException {
		test01("读取文件：字符流 测试");
		test02("写入文件：字符流 测试");
		test03("复制文件：字节流 缓冲区 读写 方式");

	}

	public static void test00(String args) {
		System.out.println("== " + args + " ===========");
	}

	public static void test01(String args) throws IOException {
		System.out.println("== " + args + " ===========");
		FileReader reader = new FileReader("test.txt");
		int ch;
		while ( (ch = reader.read()) != -1) {
			System.out.println((char)ch);
		}
		reader.close();
	}

	public static void test02(String args) throws IOException {
		System.out.println("== " + args + " ===========");
		FileWriter w = new FileWriter("writer.txt");
		String str = "你好，我是李焕英！";
		w.write(str);
		w.write("\r\n");
		w.write("我再写一行\n");
		w.close();
		System.out.println("OK!");
	}
	
	public static void test03(String args) throws IOException {
		System.out.println("== " + args + " ===========");
		
		BufferedReader r = new BufferedReader(new FileReader("ts.txt"));
		BufferedWriter w = new BufferedWriter(new FileWriter("tsnew.txt"));
		w.write("new ts.txt \n\r");
		String line = null;
		while ((line = r.readLine()) != null) {
			System.out.println(line);
			w.write(line);
			w.newLine();
			w.flush();
		}
		r.close();
		w.close();
		
	}
}
