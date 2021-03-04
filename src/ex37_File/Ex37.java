package ex37_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

import com.sun.net.httpserver.Filter;

public class Ex37 {
	public static void main(String[] args) throws IOException {
		test01("文件 File 的方法");
		test02("list() 方法");
		test03("list() : 文件过滤器 方法");

	}

	public static void test00(String args) {
		System.out.println("== " + args + " ===========");
	}

	public static void test01(String args) throws IOException {
		System.out.println("== " + args + " ===========");

		File f = new File("test.txt");
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.isAbsolute());
		System.out.println(f.lastModified());
		System.out.println(f.length() + " bytes");
		System.out.println(f.delete());
	}

	public static void test02(String args) {
		System.out.println("== " + args + " ===========");
		File f = new File("D:\\Data\\eclipse-workspace\\Java_stu_01\\src");

		if (f.isDirectory()) {
			String[] names = f.list();
			for (String string : names) {
				System.out.println(string);
			}
		}

	}

	public static void test03(String args) {
		System.out.println("== " + args + " ===========");
		File f = new File("D:\\Data\\eclipse-workspace\\Java_stu_01");
		FilenameFilter filter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				File curFile = new File(dir, name);
				if (curFile.isFile() && name.endsWith(".txt")) {
					return true;
				} else {
					return false;
				}
			}
		};

		if (f.isDirectory()) {
			String[] names = f.list(filter);
			for (String string : names) {
				System.out.println(string);
			}
		}
	}

}
