import java.util.*;
public class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number");
		Scanner input=new Scanner(System.in);
		int Number=input.nextInt();
		int sum=0;
		int armstrong=0;
		int num=Number;
		
		while(Number>0)
		{
			armstrong=num % 10;
			num=num/10;
			sum=sum + armstrong*armstrong*armstrong;
		
		}
		
		if(num == sum)
	    System.out.println("Number is ArmStrong");
	    else
		System.out.println("Number is Not an ArmStrong");
		
	}

}
