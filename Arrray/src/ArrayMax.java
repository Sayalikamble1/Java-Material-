import java.util.*;
public class ArrayMax 
{
public static int max(int arr[])
{
	int max=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>=max)
		{
		max=arr[i];
		}
		}
	return max;
}
public static void main(String[] args) 
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter The Size : ");
	int size=input.nextInt();
	int a[]=new int[size];
	int max;
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
	System.out.print("The Max From Array is :");
	int ar=max(a);
	System.out.println(+ar);
}
}
