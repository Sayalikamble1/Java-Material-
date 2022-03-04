import java.util.Scanner;

public class FindGreater 
{
public static void  find(int first,int second)
{
	if(first>second)
	{
		System.out.println(first + " is greatre");
	}
	else if(first == second)
	{
	System.out.println("Both Are Equal");	
	}
	else
	{
		System.out.println(second +" is greater ");
	}
		
}
public static void main(String[] args) 
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Two Numbers");
	int num1=input.nextInt();
	int num2=input.nextInt();
	
	find(num1,num2);
}

}
