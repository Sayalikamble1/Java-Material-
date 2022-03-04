package Searching;
import java.util.Scanner;
public class BinarySearch
{
	 
	    static int binarySearch(int a[], int beg, int end, int val)    
	    {    
	        int mid;    
	        if(end >= beg)     
	        {  
	            mid = (beg + end)/2;    
	            if(a[mid] == val)    
	            {    
	                return mid+1;  
	
	            }    

	            else if(a[mid] < val)     
	            {  
	                return binarySearch(a, mid+1, end, val);    
	            }    
 
	            else    
	            {  
	                return binarySearch(a, beg, mid-1, val);    
	            }    
	        }    
	        return -1;    
	    }   
	    public static void main(String args[]) 
	    {  
	    	System.out.println("Enter Size of an array");
	    	Scanner sc=new Scanner(System.in);
	    	int size=sc.nextInt();
	        int a[]=new int [size]; 
	        System.out.println("Enter Array Elements :");
	        for(int i=0;i<a.length;i++)
	        {
	        	a[i]=sc.nextInt();
	        }
	        System.out.println("Enter Element to Search");
	        int search=sc.nextInt();
	      
	        int res = binarySearch(a, 0, size-1, search);   
	         
	        System.out.println("Element to be searched is: " + search);  
	        if (res == -1)  
	        System.out.println("Element is not present");  
	        else  
	        System.out.println("Element is present at " + res);  
	    }  
	    }  