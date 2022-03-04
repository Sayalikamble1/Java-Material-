import java.util.*;
public class PairSum 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The Size");
		int size=input.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the sum");
		int x=input.nextInt();
		int pair=0;
		int sum=0;
		for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                sum = arr[i]+arr[j];
                if (arr[i] + arr[j] == x)
                {
                    System.out.println("Pair found (" + arr[i] + "," + arr[j] + ")");
                    return;
                }
            }
        }
		
		
       
    }
}


