package Sorting;
import java.util.*;

 class Binary_List
{
	  int binarySearch(ArrayList<Integer> arr, int x) 
	    { 
	        int low = 0, high = arr.size() - 1;
	        
	        while (low <= high)
	        { 
	            int mid = low + (high - low) / 2; 
	    
	            if (arr.get(mid) == x) 
	                return mid; 
	    
	            if (arr.get(mid) < x) 
	                low = mid + 1; 
	    
	            else
	                high = mid - 1; 
	        } 
	    
	        return -1; 
	    } 

	    public static void main(String args[]) 
	    { 
	        Binary_List ob = new Binary_List(); 
	        
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        
	        arr.add(15);
	        arr.add(100);
	        arr.add(135);
	        arr.add(7);
	        arr.add(35);
	        arr.add(55);
	        arr.add(34); 
	        
	        int x = 35; 

	        System.out.println("The elements of the arraylist are: "+arr);
	        
	        int result = ob.binarySearch(arr, x); 
	        
	        if (result == -1) 
	        {
	            System.out.println("Element not Found"); 
	        }
	        
	        else
	        {
	            System.out.println("The Element " + x + " is found at "
	                               + "index " + result); 
	        }
	    

	}
	    }

