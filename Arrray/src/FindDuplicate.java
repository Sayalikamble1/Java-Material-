import java.util.*;
public class FindDuplicate 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The Size of an Array :");
		int size=input.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
		
		for(int index=0;index<size;index++)
		{
			int count =0;
			for(int newIndex=0;newIndex<size;newIndex++)
			{
				if(arr[index] == arr[newIndex])
				{
					count++;
				}
				
			}
			if(count!=1)
			{
				System.out.println("Duplicate Element is : "+arr[index]);
				break;
			}
		}
		

}
}
