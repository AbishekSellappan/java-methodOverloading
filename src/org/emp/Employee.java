package org.emp;

public class Employee {
private void empId(String name) {
	System.out.println("My name is:"+name);

}
private void empId(int age) {
	System.out.println("My Employee age is :"+age);

}
private void empId(long sal) {
	System.out.println("My sal is:"+sal);

}
private void empId(float presal) {
	System.out.println("My preSal is :"+presal);

}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empId(234.34f);
	e.empId(23);
	e.empId(2345l);
	e.empId("Abi");
Employee x = new Employee();
x.empId(987.98f);
x.empId(98);
x.empId(1000l);
x.empId("Jeeva");
}
}
