import java.util.*;
public class PerfectNum 
{
public static void Perfect(int Number)
{
	int sum=0;
	for(int value=1;value<Number;value++)
	{
		if(Number % value == 0)
		{
			sum=sum+value;
		}
	}
	if(sum == Number)
	{
		System.out.println(Number+" is a perfect Number");
	}
	else
	{
		System.out.println(Number+" is Not a perfect Number");
	}
}
public static void main(String[] args)
{
	System.out.println("Enter Number :-");
	Scanner sc=new Scanner(System.in);
	int Num=sc.nextInt();
	
	Perfect(Num);
}
}
