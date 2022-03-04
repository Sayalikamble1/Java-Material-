package MiniProject;

import java.util.Scanner;


public class Merge 
{
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
	

		System.out.println("Enter size of an array :");
		int size = scan.nextInt();
		int[] numbers = new int[size];

		int choice = 0;
		do {
			
			System.out.println("=========================");
       System.out.println("\n1-ADD ELEMENTS. \n2-ELEMENTS BEFORE MERGE OPERATION. \n3-PERFORM MERGE OPERATION. \n4-RESULT. \n5-EXIT.");
			System.out.println("==========================");
			System.out.println("enter your choice :");
			choice = scan.nextInt();
			System.out.println();
			

			switch (choice) 
			{
			case 1: 
			{
				addelement(numbers);
				break;

			}
			case 2: {
				System.out.println("Before Merge Opertion :");
				printArray(numbers);
				System.out.println();
				break;
			}

			case 3: 
			{
				System.out.print("**MERGED** \n");
				mergeSort(numbers);
				break;
			}
			case 4: {
				System.out.print("Result : ");
				printArray(numbers);
				System.out.println();
				break;
			}
			case 5:
				System.out.println("*EXIT*");
				break;
			}

		} while (choice != 5);

	}

	private static void mergeSort(int[] inputArray) 
	{
		int inputLength = inputArray.length;

		if (inputLength < 2) 
		{
			return;
		}

		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];

		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}
		for (int i = midIndex; i < inputLength; i++) 
		{
			rightHalf[i - midIndex] = inputArray[i];
		}

		mergeSort(leftHalf);
		mergeSort(rightHalf);

		merge(inputArray, leftHalf, rightHalf);
	}

	private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) 
	{
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;

		int i = 0, j = 0, k = 0;

		while (i < leftSize && j < rightSize) 
		{
			if (leftHalf[i] <= rightHalf[j]) 
			{
				inputArray[k] = leftHalf[i];
				i++;
			} else
			{
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}

		while (i < leftSize) 
		{
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}

		while (j < rightSize)
		{
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}

	}

	private static void printArray(int[] numbers) 
	{
		for (int i = 0; i < numbers.length; i++) 
		{
			System.out.print(numbers[i] + " ");
		}
	}

	private static void addelement(int numbers[]) 
	{

		System.out.println("ENTER ELEMENTS : ");
		for (int i = 0; i < numbers.length; i++) 
		{
			numbers[i] = scan.nextInt();
		}
		System.out.println("TOTAL ELEMENTS : " + numbers.length);
	}

}