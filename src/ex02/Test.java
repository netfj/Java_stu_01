package ex02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
	public static void main6(String[] args) {
		System.out.println("你好 JAVA !");
//		Test2 test2 = new Test2();
//		Test2.add();
//		Test2.arr();

//		int[] z10 = {1,2,3,4,5};
//		Test2.arr2(z10);

//		Test2.arr3();

		Test2.t01();

	}

}

class Test2 {

	public static void t01() {
		String name = "李兴华"; // 定义字符串
		int age = 30; // 定义整数
		float score = 990.356f; // 定义小数
		char sex = 'M'; // 定义字符

//		System.out.print("姓名：%s；年龄：%d；成绩：%f；性别：%c", name, age, score, sex);
		System.out.printf("姓名：%s , 年龄: %d ",name,age );
	}

	public static void add() {
		System.out.println("Test2.add() !!!");

		int[] x = new int[10];

		for (int i = 1; i < 10; i++) {
			x[i] = i;
		}

		System.out.println(x.toString());

		for (int n = 0; n < 10; n++) {
			System.out.print(x[n]);
			System.out.print("|");
		}

		x[10] = 100;
		System.out.println(x[10]);

	}

	public static void arr() {
		double[] y = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		// print out: method 1
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i]);
			System.out.print("|");
		}

		System.out.println("\n\nsprint out : method 2");
		for (double e : y) {
			System.out.print(e);
			System.out.print("|");
		}
	}

	public static void arr2(int[] arr) {
		System.out.println(arr.length);
	}

	public static void arr3() {
//		String str = {"1","5","2","3","4"};

//		int str = {1,3,2,,5,4};

		double[] y = { 1.1, 3.3, 2.0, 4.4, 2.2, 5.5 };

		Test3.printArray(y);

		Arrays.sort(y);
		Test3.printArray(y);

	}

}

class Test3 {

	public static void printArray(double[] args) {
		for (double e : args) {
			System.out.print(e);
			System.out.print("|");
		}
	}

}
