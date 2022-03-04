import java.util.Scanner;

class ArrayIntersection
{

    public static  void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of  array 1 : ");
        int N = input.nextInt();
        int arr1[] = new int[N];

        for(int index = 0;index<N;index++)
        {
            arr1[index] = input.nextInt();
        }

        for( int value : arr1)
        {
            System.out.print(value+" ");
        }
        System.out.println();
        System.out.println("Enter the size of array 2 : ");
        int M = input.nextInt();
        int arr2[] = new int[M];

        for(int index = 0;index<M;index++)
        {
            arr2[index] = input.nextInt();
        }

        for( int value : arr2)
        {
            System.out.print(value+" ");
        }

        System.out.println();

        for(int value = 0;value < arr1.length;value++)
        {
            for(int index=0;index<arr2.length;index++)
            {
                if(arr1[value] == arr2[index])
                {
                    System.out.print(arr2[index] + " ");
                }
            }

        }

    }
}