import java.util.Scanner;
import java.util.Arrays;
class Q2_lab7 
{
int counterEven=0,counterOdd=0;
int n;
	
        void addNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("specify Size of array : \n");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of array :");
		for(int i = 0; i < n; i++)
		{
		a[i] = sc.nextInt();
                }
	        System.out.println("Original Array: "+Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				counterEven++;
			}
			else
			{
				counterOdd++;
			}
		}
                
			System.out.printf("Even Elements in Array is : %d\n",counterEven);
			System.out.printf("ODD Elements in Array is : %d\n",counterOdd);
		}
              public static void main(String args[])
              {
              Q2_lab7 q= new Q2_lab7();
              q.addNumber();
               }
               }

