
import java.util.*;
public class Employee {
int eid;
private String name;
private int salary;
Scanner sc=new Scanner(System.in);
Employee()
{
System.out.println("Enter Name of Employee");
name=sc.nextLine();
System.out.println("Enter Salary of Employee");
salary=sc.nextInt();

}
void raiseSalary()
{
System.out.println("Enter the % to raise salary");
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
int raisedsal=salary+(salary*p/100);
System.out.println("Name of the Employee -  " +name);
System.out.println("Salary of the Employee -  " +salary);
System.out.println("The raised salary of employee is -  " +raisedsal);

}
public static void main(String[] args)
{
Employee emp=new Employee();
emp.raiseSalary();
}
}