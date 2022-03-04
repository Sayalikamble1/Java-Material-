
import java.util.Scanner;

class ArrangeNumbers
{
  public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        int value = 1;
        int start = 0;
        int end = size-1;
        while(start <= end)
        {
            arr[start]=value;
            value++;
            start++;
            arr[end] = value;
            value++;
            end--;

            if(start == end)
            {
                arr[start] = value;
                value--;
            }
            }

        for( int i : arr)
        {
            System.out.print(i+" ");
        }

    }
}