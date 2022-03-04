import java.util.*;
public class PrimeNum 
{
public static void main(String...args)
{

        System.out.print("Enter the Number : ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int count=0;
        while(number > 2)
        {
            for(int i=1;i<=number;i++)
            {
                if(number%i == 0)
                {
                    count++;
                }
            }
            if (count > 2)
            {
                System.out.print("Not Prime Number");

            }
            else
            {
                System.out.print("Prime Number");
            }
            return;
        }
    }
}