package ex38_遍历文件夹;

import java.io.File;
import java.io.IOException;

public class Ex38 {

	public static void main(String[] args) {
		test01("遍历文件夹");

	}

	public static void test00(String args) {
		System.out.println("== " + args + " ===========");
	}
	
	
	public static void test01(String args) {
		System.out.println("== " + args + " ===========");
		
		File file = new File("c:\\Users\\LENX1F\\eclipse-workspace\\Java_stu_01\\");
		
		fileDir(file);
		
	}
	
	
	public static void fileDir(File dir) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				fileDir(file);
			}else {
				System.out.println(file.getAbsolutePath());
			}
		}
	}
	
}
