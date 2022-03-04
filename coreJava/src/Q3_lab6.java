
import java.util.Scanner;
import java.util.Arrays;
public class Q3_lab6 
{
	  public static void main(String[] args) 
	  {

	 	Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the elements for first array: ");
	    int a1size = sc.nextInt();
	    System.out.print("Enter the elements for second array: ");
	    int a2size = sc.nextInt();

	    if(a1size != a2size) {
	      System.out.println("Both array must have same number of elements");
	    
	    }

	    
	    int array1[] = new int[a1size];
	    int array2[] = new int[a1size];
	    int array3[] = new int[a1size];

	    
	    System.out.println("first array elements: ");
	    for (int i=0; i<array1.length; i++)
	    {
	      array1[i] = sc.nextInt();
	    }

	    System.out.println("second array elements: ");
	    for (int i=0; i<array2.length; i++) 
	    {
	      array2[i] = sc.nextInt();
	    }

	    
	    for (int i=0; i<array3.length; i++) 
	    {
	      array3[i] = array1[i] + array2[i];
	    }

	    
	    System.out.println("Addition of Arrays : " + Arrays.toString(array3));
	  }
	}


