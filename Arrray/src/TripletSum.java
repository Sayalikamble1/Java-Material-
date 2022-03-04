import java.util.*;
public class TripletSum 
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the Size :");
int size=input.nextInt();
int a[]=new int[size];
int pair=0;
int sum=0;
System.out.println("Enter The Elements :");
for(int i=0;i<a.length;i++)
{
	a[i]=input.nextInt();
}
System.out.println("Enter The Sum:");
int x=input.nextInt();
for(int i=0;i<size;i++)
{
	for(int j=i+1;j<size;j++)
	{
		for(int k=j+1;j<size;k++)
		{
			sum=a[i]+a[j]+a[k];
			if(sum == x)
			{
				System.out.println("pair found at (" +a[i] +"," +a[j] +"," +a[k] +")");
				return;
			}
		}
	}
}
}
}
