package Sorting;

import java.util.Scanner;

public class SelectionSort 
{
static void selection(int arr[],int size)
{
	int n = arr.length;

    for (int i = 0; i < n-1; i++)
    {
        int min_idx = i;
        for (int j = i+1; j < n; j++)
            if (arr[j] < arr[min_idx])
               min_idx = j;
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
    }
	
	}
public void print(int a[],int size)
{
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Size of an Array :");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter Array Elements : ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	SelectionSort ss= new SelectionSort();
	ss.selection(arr, size);
	System.out.print("Array elements after Sorting :");
	ss.print(arr, size);
}

}

