import java.util.*;
class ItemTrack

{
	public static void main(String []args)
	{
		int a;
		Alldata d = new Alldata();
		System.out.println("Menu");
		System.out.println("1.Track sales");
		System.out.println("2.Print sales");
		System.out.println("3.EXIT");
		
		Scanner s1 = new Scanner(System.in);
		a = s1.nextInt();
		switch(a)
		{
			case 1 : d.trackSales();
			break;
			case 2 : d.displayDetails();
			break;
			case 3 : default:
			System.out.println("Sir Please Enter Valid option");
		}
	}
}
class Alldata
{
	static String[] incoming = new String[10];
	static String[] remaining = new String[10];
	static String[] outgoing = new String[10];
	
	int i,j,z;
	public Alldata()
	{
		System.out.println("Enter the number of items that loaded");
		Scanner s2 = new Scanner(System.in);
		int n = s2.nextInt();
		System.out.println("Enter the items loaded in the shop");
		for(i=0; i<n; i++)
		{
			Scanner s = new Scanner(System.in);
			incoming[i] = s.nextLine();
		}
		
	}
	void trackSales()
		{
			System.out.println("Enter the number of item Sold for the day");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			System.out.println("Enter the Items which are Sold for the day");
			for(j=0;j<=s;j++)
			{
				Scanner s2 = new Scanner(System.in);
				outgoing[j] = s2.nextLine();
			}
			System.out.println("-Sold Items- ");
			for(j=0;j<=s;j++)
			{
				System.out.println(outgoing[j]);
			}
		}
	void displayDetails()
	{
		int a = incoming.length;
		int b = outgoing.length;
		int c = remaining.length;
		c = a-b;
		System.out.println("The Items Left which are in the Storess ");
		for(z=0;z<=9;z++)
		{
			System.out.println(remaining[z]);
		}
	}
}