package Sorting;
import java.util.Scanner;

public class BubbleSort 
{
	static void Bsort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            if (swapped == false)
                break;
        }
    } 
	 	 
	 	
	 
	 public static void print(int a[],int len)
	 {
		 int i;
		 for(i=0;i<a.length;i++)
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
BubbleSort bs=new BubbleSort();
bs.Bsort(arr, size);
System.out.print("Sorted Elements are : ");
bs.print(arr, size);

}	

}
