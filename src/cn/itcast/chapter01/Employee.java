package cn.itcast.chapter01;
import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	// Employee 类的构造器
	public Employee(String name) {
		this.name = name;
	}
	
	// 设置 age
	public void empAge(int empAge) {
		this.age = empAge;
	}
	
	// 打印信息
	public void printEmployee() {
		System.out.println("-----------------\n姓名："+name);
		System.out.println("年龄："+age);
	}
}




