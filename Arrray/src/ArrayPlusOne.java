import java.util.Scanner;

class ArrayPlusOne
{
public static void main(String args[])
{
	int flag,key;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size of an array :");
	int size=input.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter The array elements :");
	for(int i=0;i<arr.length;i++)
	{
	 arr[i]=input.nextInt();
	}
	System.out.println("Array elements are : ");
	System.out.println("=====================");
	for(int x: arr)
	{
		System.out.print(x+" ");
	}
	System.out.println("");
	System.out.println("=====================");
	System.out.println("Enter the element to search");
	key=input.nextInt();
    flag=0;
	
	for(int element=0;element<arr.length;element++)
	{
	if(arr[element] == key)
	{
		flag++;
	}
	}
		
	if(flag == 1)
	{
		System.out.println("Found");
	}
	else
	{
		System.out.println("Not Found");
	}
	
	System.out.println("================");
	System.out.println("Enter the element to Delete :");
	int del=input.nextInt();
	for(int element2=0;element2<arr.length;element2++)
	{
		if(arr[element2] == del)
		{
			arr[element2]=arr[element2]+1;
			continue;
		}
		else
		{
			System.out.print(arr[element2] + " ");
		}
	}
}
}


