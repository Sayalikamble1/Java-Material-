package Sorting;

import java.util.Scanner;
public class InsertionSort 
{

static void Insertion(int a[],int size)
{
	int i,j,temp;
	for(i=1;i<a.length;i++)
	{
		temp=a[i];
	j=i;
	while(j > 0 && a[j-1] > temp)
	{
		a[j]=a[j-1];
		j=j-1;
	}
	a[j]=temp;
	}
	}
static void print(int a[],int size)
{
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}



	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Size :");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter Array Elements : ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	InsertionSort.Insertion(arr, size);
	System.out.print("Array elements after Sorting :");
	InsertionSort.print(arr, size);
}
}

