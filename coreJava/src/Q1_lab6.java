
import java.util.*;
public class Q1_lab6 
{
	public static void main(String[] args)
	{
	int n, max;
	Scanner sc = new Scanner(System.in);
	System.out.print("specify Size of array : \n");
	n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the elements of array : \n");
	for(int i = 0; i < n; i++)
	{
	a[i] = sc.nextInt();
	}
	max = a[0];
	for(int i = 0; i < n; i++)
	{
	if(max < a[i])
	{
	max = a[i];
	}
	}
	System.out.println("Largest number in array is:"+max);
	}
	}
	
			
