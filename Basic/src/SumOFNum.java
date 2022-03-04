import java.util.Scanner;

public class SumOFNum 
{
public static void Sum(int start,int End)
{
	int sum=0;
	for(int i=start;i<End;i++)
	{
		 sum= sum+i;
	}
	System.out.println("The Sum of "+ start +" and "+ End+" is "+sum);
	
}
public static void main(String[] args) 
{
	System.out.println("Enter Range-");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	Sum(a,b);
}
}
