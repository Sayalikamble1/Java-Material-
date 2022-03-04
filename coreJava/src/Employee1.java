import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Employee1 implements Comparable<Employee1> 
{
private int empid = -1;
private  String firstName = null;
private String lastName = null;
private String department=null;
private int salary=-1;

public Employee1(int eid, String fName, String lName, String dept,int sal) 
{
 this.empid = eid;
 this.firstName = fName;
 this.lastName = lName;
 this.setDepartment(dept);
 this.salary=sal;
 }
public int compareTo(Employee1 s)
{ 
 return this.firstName.compareTo(s.firstName);
	
 }
public String toString() 
{
 return "Employee : " + empid + " - " + firstName + " - " + lastName + " - " + "department" + " - "   + salary  +" \n";
 }
public static void main(String[] args) {
 Employee1 e1 = new Employee1(1, " Sayali", "Kamble","Computer\n",18550);
 Employee1 e2 = new Employee1(2, "Sarika", "Sharma","Electrical\n",22200);
 Employee1 e3 = new Employee1(3, "Sanvi", "Gupta","Mechanical\n",25000);
 Employee1 e4 = new Employee1(4, "Shobha", "Kadam","Chemical\n",34000);
 List<Employee1> emp = new ArrayList<Employee1>();
 emp.add(e2);
 emp.add(e1);
 emp.add(e3);
 emp.add(e4);
 System.out.println(emp);
 Collections.sort(emp);
 System.out.println(emp);
 }
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
}