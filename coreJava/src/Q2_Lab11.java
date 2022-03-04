
    import java.util.*;
	class Student
	{
		int regno;
		String name;
		int marks;
	    Student(int regno, String name, int marks)
		{
		this.regno = regno;
		this.name = name;
		this.marks = marks;
		}
		public String toString(){
		return "Registration no of student- "+ regno +"\nName of a student- "+
		name +"\nMark of student- "+ marks+"\n";
		}
		}
	
		public class Q2_Lab11
		{
		public static void main(String[] args)
		{
		Student S = new Student(1,"Sayali",95);
		Student S11 = new Student(2,"Sakshi",90);
		Student S12 = new Student(3,"Ram",85);
		Student S13 = new Student(4,"Raj",80);
		Student S14 = new Student(5,"pooja",99);
		
		ArrayList <Student> name = new ArrayList<Student>();
		name.add(S);
		name.add(S11);
		name.add(S12);
		name.add(S13);
		name.add(S14);
		
		Iterator<Student> s = name.iterator();
		while(s.hasNext())
		{
		System.out.println(s.next());
		}
		}
		}

