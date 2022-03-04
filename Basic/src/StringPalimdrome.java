import java.util.*;
public class StringPalimdrome
{
public static void main(String[] args) 
{
	System.out.println("Enter String:-");
	Scanner sc=new Scanner(System.in);
	String text=sc.nextLine();
	int len=text.length();
	String reverse="";
	for(int i=0;i<len;i++)
	{
	char temp=text.charAt(i);
	reverse=temp+reverse;
	}
	if(text.equals(reverse))
	{
		System.out.println(reverse+" is a Palimdrome");
	}
	else
	{
		System.out.println(reverse+" is  not a Palimdrome");
	}
}
}
