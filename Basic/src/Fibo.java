import java.util.Scanner;

public class Fibo 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

       int sum=0;
       int first=0;
       int second=1;
        System.out.print(first+" "+second+" ");
       for(int i=1;i<=number;i++)
       {
           sum= first+second;
           first = second;
           second= sum;
           if(sum<number)
           {
               System.out.print(sum+" ");
           }
       }

    }
}


