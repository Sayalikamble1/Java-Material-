import java.util.Scanner;

class ArrayReverse
{
	public static void reverse(int brr[])
	{
		System.out.println("The Reverse elements are : ");
		for(int i=brr.length-1;i>=0;i--)
		{
			System.out.print(brr[i]+" ");
		}
	}
public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.println("Enter the Array elements : ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=input.nextInt();
	}
	
	System.out.println("Array elemets are :" ); 
	
	for(int x:arr)
	{
		System.out.print(x+" ");
	}
	System.out.println();
	reverse(arr);

	input.close();

	
	
}
}
