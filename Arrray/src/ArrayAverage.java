import java.util.*;
public class ArrayAverage
{
	public static int average(int arr[])
	{
		int sum=0;
		int avg;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
			avg=(sum/arr.length);
			return avg;
		}
	
	

public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter The Size : ");
	int size=input.nextInt();
	int a[]=new int[size];
	int avg;
	System.out.println("Enter The Elements : ");
	for(int i=0;i<a.length;i++)
	{
		a[i]=input.nextInt();
	}
	for(int x:a)
	{
		System.out.print(x +" ");
	}
	System.out.println();
	System.out.print("The Average of Array is :");
	avg=average(a);
	System.out.println(+avg);
}
}

