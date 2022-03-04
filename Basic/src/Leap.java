import java.util.Scanner;

public class Leap 
{
public static void leap(int year)
{
	if((year % 4== 0 && year%100!=0)||(year % 400 == 0))
	{
	System.out.println(year+" is a leap year");	
	}
	else
	{
		System.out.println(year+" is not a leap year");	
	}
	}
public static void main(String[] args) 
{
	System.out.println("Enter year");
	Scanner sc=new Scanner(System.in);
	int inputYear=sc.nextInt();
	
	leap(inputYear);
}
}

