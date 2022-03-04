 import java.util.*;
 class Grade
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        
        String name[] = new String[n];
        int marks[] = new int[n];
        
        
        
        for (int i = 0; i < n; i++)
        {
            in.nextLine();
            System.out.print("Enter name of student " + (i+1) + ": ");
            name[i] = in.nextLine();
            System.out.print("Enter total marks of student " + (i+1) + ": ");
            marks[i]=in.nextInt();
             }
        
         for (int i = 0; i < n; i++) 
         {
            System.out.println("Marks for " + name[i] + " = "  + marks[i] );
               
    if(marks[i] > 90)
	{
	System.out.println("Grade is A+");
	}

    else if(marks[i] >80 && marks[i]<90)
    {
    System.out.println("Grade is A");
    }
	else if(marks[i]< 70 && marks[i]>80)
	{
	System.out.println("Grade is B+");
	}
	else if(marks[i] > 60 && marks[i] < 70 )
	{
	System.out.println("Grade is B");
	}
	else if(marks[i] > 50 && marks[i] < 60 )
	{
	System.out.println("Grade is C");
	}
	else if(marks[i]>40 && marks[i]<50)
	{
		System.out.println("Grade is Pass");
	}
	else if(marks[i] <40)
	{
	
	System.out.println("Grade is Fail");
	}
    }
        
    }
}