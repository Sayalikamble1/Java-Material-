package Sorting;

import java.util.Scanner;

public class HeapSort 
{
  
	static void heapify(int a[], int n, int i)  
	{  
	    int largest = i; 
	    int left = 2 * i + 1; 
	    int right = 2 * i + 2;    
	    if (left < n && a[left] > a[largest])  
	        largest = left;  

	    if (right < n && a[right] > a[largest])  
	        largest = right;  

	    if (largest != i) {  

	        int temp = a[i];  
	        a[i] = a[largest];  
	        a[largest] = temp;  
	          
	        heapify(a, n, largest);  
	    }  
	}  

	static void heapSort(int a[], int n)  
	{  
	    for (int i = n / 2 - 1; i >= 0; i--)  
	        heapify(a, n, i);  

	    for (int i = n - 1; i >= 0; i--) 
	    {  
           int temp = a[0];  
	        a[0] = a[i];  
	        a[i] = temp;  
	          
	        heapify(a, i, 0);  
	    }  
	}  

	static void printArr(int a[], int n)  
	{  
	    for (int i = 0; i < n; ++i)  
	        System.out.print(a[i] + " ");  
	}  
	public static void main(String args[])   
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
	  
	    System.out.print("Before sorting array elements are - \n");  
	    printArr(a, size);  
	    heapSort(a, size);  
	    System.out.print("\nAfter sorting array elements are - \n");  
	    printArr(a, size);  
	

}
}
