package Sorting;

import java.util.Scanner;

public class QuickSort 
{

	int partition (int a[], int start, int end)  
	{  
	    int pivot = a[end]; 
	    int i = (start - 1);  
	  
	    for (int j = start; j <= end - 1; j++)  
	    {   
	        if (a[j] < pivot)  
	        {  
	            i++; 
	            int t = a[i];  
	            a[i] = a[j];  
	            a[j] = t;  
	        }  
	    }  
	    int t = a[i+1];  
	    a[i+1] = a[end];  
	    a[end] = t;  
	    return (i + 1);  
	}  

	void quick(int a[], int start, int end) 
	{  
	    if (start < end)  
	    {  
	        int p = partition(a, start, end);  
	        quick(a, start, p - 1);  
	        quick(a, p + 1, end);  
	    }  
	}  

	void printArr(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	}  
	    public static void main(String[] args) 
	    {  
	    	Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of an Array");
			int size=sc.nextInt();
			int a[] = new int[size];
			System.out.println("Enter Array Elements :");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
	  
	  
	    System.out.println("Before sorting array elements are - ");  
	    QuickSort q1 = new QuickSort();  
	    q1.printArr(a, size);  
	    q1.quick(a, 0, size - 1);  
	    System.out.println("\nAfter sorting array elements are - ");  
	    q1.printArr(a, size);  
	    System.out.println();  
	    }  
	}  

