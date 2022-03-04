import java.util.*;
public class ArrayMin 
{
	public static int Minimum(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] <= min)
			{
				min=arr[i];
			}
		}
		return min;
		}
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Size : ");
	int size=input.nextInt();
	int a[]=new int[size];
	System.out.println("Enter Elements in Array :");
	{
		for(int i=0;i<size;i++)
		{
			a[i]=input.nextInt();
		}
		System.out.print("The Minimum From Array is :");
		int ar=Minimum(a);
		System.out.print(+ar);
	}
	}
	
	}
	
