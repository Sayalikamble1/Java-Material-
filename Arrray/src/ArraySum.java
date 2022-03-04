import java.util.Scanner;

class ArraySum 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array :");
	int size=sc.nextInt();
	int arr[]=new int[size];
	int sum=0;
	
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(int value=0;value<size;value++)
    {
        System.out.print(arr[value]+" ");
        sum=sum+ arr[value];
    }
	System.out.println("");
	System.out.println("The sum of Array is : "+sum);
	
}
}
