package MiniProject;

import java.util.*;

public class Mergesort {
	static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter size of an array :");
	  int size = scan.nextInt();
	  int[] numbers = new int[size];
	  System.out.println("enter Array Elements");
     for (int i = 0; i < numbers.length; i++) 
     {
      numbers[i] = sc.nextInt();
    }
    int choice=0;
    do {
  
    System.out.println("\n1-Elements Before Merge Operation  \n2-Perform Merge Operation \n3-Result \n4-exit \n");
    System.out.println("enter your choice :");
	 choice = scan.nextInt();
	
	
    switch(choice)
    {
    case 1:
    {
        System.out.println("Before Merge Operion :");
        printArray(numbers);
        break;
    }
    case 2:
    {	System.out.print("Merged \n");
    	 mergeSort(numbers); 
    	break;
    }
    	
    case 3:
    	 {
    		 System.out.print("Result :");
    		    printArray(numbers); 
    		   break;
    	 }
    case 4:
    {
    	System.out.println("exited");
    	break;
    }
    }
    
	}while(choice != 4);
	
    
  }


  private static void mergeSort(int[] inputArray) {
    int inputLength = inputArray.length;
    
    if (inputLength < 2) {
      return;
    }
    
    int midIndex = inputLength / 2;
    int[] leftHalf = new int[midIndex];
    int[] rightHalf = new int[inputLength - midIndex];
    
    for (int i = 0; i < midIndex; i++) {
      leftHalf[i] = inputArray[i];
    }
    for (int i = midIndex; i < inputLength; i++) {
      rightHalf[i - midIndex] = inputArray[i];
    }
    
    mergeSort(leftHalf);
    mergeSort(rightHalf);
    
    merge(inputArray, leftHalf, rightHalf);
  }

  private static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf) {
    int leftSize = leftHalf.length;
    int rightSize = rightHalf.length;
    
    int i = 0, j = 0, k = 0;
    
    while (i < leftSize && j < rightSize) 
    {
      if (leftHalf[i] <= rightHalf[j]) 
      {
        inputArray[k] = leftHalf[i];
        i++;
      }
      else {
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
      System.out.print(numbers[i]+" ");
    }
  }
 
}