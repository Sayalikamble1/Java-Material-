import java.util.Scanner;
public class SwapAlternate {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the Elements :");
        for(int index=0;index<size;index++)
        {
            arr[index] = input.nextInt();
        }

        for( int index = 0;index<size-1;index = index+2)
        {

                int a = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = a;
                if (arr[index] == size)
                {
                    break;
                }
                }
        
        for(int index : arr)
        {
            System.out.print(index+" ");
        }
    }
}