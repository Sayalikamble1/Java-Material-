import java.util.Scanner;
import java.util.ArrayList;


public class Shopping
{
public static void main(String[] args) 
{

	Scanner s1 = new Scanner(System.in);
	ArrayList<Integer> intList = new ArrayList<Integer>();
	boolean keeponGoing = true;
	int c = 0;
	int input = 0;
	int index=0;
	int total = 0;
	Integer item;

	while(keeponGoing)
	{
		System.out.println("\nMenu - Shopping Cart Options are");
		System.out.println("1 you want to add  item to cart");
		System.out.println("2 you want to remove an item from cart");
		System.out.println("3 view the items in  cart");
		System.out.println("4 Exit and check-out");
		System.out.println("5 Empty the cart");
		System.out.println("6 Exit");
		System.out.println("Select a menu option");
		c = s1.nextInt();
		if (c <1 || c >6)
		{
			System.out.println("please enter a opction from the above menu");
		}
		else
		{
		switch (c)
		{
			case 1:
			System.out.println("Enter the item you want");
			input = s1.nextInt();
			item = new Integer(input);
			intList.add(item);
			break;
			case 2:
			System.out.println("Enter the item which you want to remove:");
			input = s1.nextInt();
			item = new Integer(input);
			if (intList.contains(item))
			{
				intList.remove(item);
				System.out.println(item + " your selected item has been removed.");
			}
			else
			{
				System.out.println(item + " item not found in shopping cart.");
			}
			break;
			case 3:
			System.out.println(intList);
			break;
			case 4:
			for (int i = 0; i<intList.size(); i++)
			{
				item = intList.get(i);
				total = total + item.intValue();
			}
				System.out.println("Total is "+ total);
				System.out.println("have great day ahead");
				keeponGoing = false;
				break;
				case 5:
				intList.clear();
				break;
				case 6:
				keeponGoing = false;
				System.out.println("have a great day ahead");
				break;
		
			}
		}
	}
}
}