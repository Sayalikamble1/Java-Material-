import java.util.*;
public class FindUnique 
{
public static void main(String[] args)
{
 Scanner input =new Scanner(System.in);
 System.out.println("Enter the Size :");
 int size=input.nextInt();
 int arr[]=new int[size];
 System.out.println("Enter the elements :");
 for(int i=0;i<arr.length;i++)
 {
	 arr[i]=input.nextInt();
 }
 for(int index=0;index<size;index++)
 {
 int  count =0;
 for(int newIndex=0;newIndex<size;newIndex++)
 {
	 if(arr[index] == arr[newIndex])
	 {
		 count++;
     }
 }
 if(count == 1)
 {
	 for(int i=0;i<size;i++)
	 { 
	 System.out.println("Unique Elements are :"+arr[index] +" ");
	 break;
 }
	 
}
}
}
}

