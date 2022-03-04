
import java.util.Scanner;

public class SortZeroAndOne 
{

    public static void main(String [] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements in Array :");
        for(int index=0;index<size;index++)
        {
            arr[index] = input.nextInt();
        }
        for(int value : arr)
        {
            System.out.print(value+" ");
        }

        for(int index = 0; index < size; index++)
        {
            for(int nIndex = index+1; nIndex < size; nIndex++)
            {
                if(arr[index] > arr[nIndex])
                {
                    int a = arr[index];
                    arr[index] = arr[nIndex];
                    arr[nIndex] = a;
                }
            }
        }

        System.out.println();

        for(int value : arr)
        {
            System.out.print(value+" ");
        }
    }
}