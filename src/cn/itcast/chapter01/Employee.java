package cn.itcast.chapter01;
import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	// Employee ��Ĺ�����
	public Employee(String name) {
		this.name = name;
	}
	
	// ���� age
	public void empAge(int empAge) {
		this.age = empAge;
	}
	
	// ��ӡ��Ϣ
	public void printEmployee() {
		System.out.println("-----------------\n������"+name);
		System.out.println("���䣺"+age);
	}
}




