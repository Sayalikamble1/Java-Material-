package Searching;

import java.util.Scanner;

public class LinearSearch 
{

	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Entre Size of an Array");
		int size=input.nextInt();
		System.out.println("Enter Array elements :" );
		int a[]=new int[size];
		int i;
		for(int element=0;element<a.length;element++)
		{
			a[element]=input.nextInt();
		}
		System.out.println("Enter Element to Search : ");
		int search=input.nextInt();
		
		for(i=0;i<a.length;i++)
		{
			if(a[i] == search)
			{
				System.out.println(+search+" "+"is found at"+" "+(i+1));
				break;
			}
			
		}
		
	 if(i == 5)
	 {
		 System.out.println("Not Found");
	 }
		
		
	}
}



