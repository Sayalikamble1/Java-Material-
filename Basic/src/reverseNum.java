import java.util.*;
public class reverseNum 
{
public static void main(String...args) 
{
	System.out.println("Enter The Number");
	Scanner sc=new Scanner(System.in);
	int Number=sc.nextInt();
	int reverse;
	String str="";
	while(Number != 0)
	{
	reverse= Number % 10;
	str= str + Integer.toString(reverse);
	Number=Number / 10;
	}
	System.out.println("Reverse of a Number is "+str);
}
}
