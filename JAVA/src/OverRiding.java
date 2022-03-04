class overR1
{
void print()
{
	System.out.println("Hello I am 1st");
}
}
class overR2 extends overR1
{
void print()
{
	System.out.println("hello I am 2nd");
}
}
class overR3 extends overR1
{
	void print()
	{
		System.out.println("Hello I am 3rd");
	}
}
 class OverRiding 
{
public static void main(String[] args)
{
	overR1 R1;
	R1=new overR1();
	R1.print();
	R1=new overR2();
	R1.print();
	R1=new overR3();
	R1.print();
	
	
	
}
}
