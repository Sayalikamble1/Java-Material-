import java.util.*;
public class SumOfNaturalNumber 
{
	public static void main(String...args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:-");
		int Number=sc.nextInt();
		for(int i=0;i<Number;i++)
		{
			sum= sum + i;
		}
		System.out.println("sum is :-"+sum);
	}
}
