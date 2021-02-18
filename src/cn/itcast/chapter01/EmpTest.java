package cn.itcast.chapter01;

public class EmpTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Tom");
		Employee emp2 = new Employee("Jake");
		
		emp1.empAge(30);
		emp2.empAge(34);
		
		emp1.printEmployee();
		emp2.printEmployee();		
	}

}
