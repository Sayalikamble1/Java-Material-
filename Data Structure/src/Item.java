import java.util.*;
class ShoppingMart
{
int ItemCode;
String ItemName;
double ItemPrice;
}
 class Item
 {
  public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);

	System.out.println("How many items you want to add :");
	int input=sc.nextInt();

	ShoppingMart[] it=new ShoppingMart[input];
	
	for(int i=0;i<input;i++)
	{
	System.out.println("Enter Item Code : ");
	int ItemCode=sc.nextInt();
	System.out.println("Enter Item Name : ");
	String ItemName=sc.next();
	System.out.println("Enter Item Price : ");
	double ItemPrice=sc.nextDouble();
	
	ShoppingMart ol=new ShoppingMart();
	it[i]=ol;
}
	for(int j=0;j<input;j++)
	{
	System.out.println("Items Details : "+it);
	}
	
 }
 }


