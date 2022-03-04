import java.util.*;
	
public class Q3_Lab11 
{
public static void main(String args[])
	{
	TreeSet<Integer> set=new TreeSet<Integer>();
	set.add(11);
	set.add(25);
	set.add(37);
	set.add(46);
	set.add(58);
	set.add(19);
	set.add(7);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number- ");
	int i = sc.nextInt();
	TreeSet<Integer> set1=new TreeSet<Integer>();
	SortedSet<Integer> q = set.tailSet(i);
	set1.addAll(q);
	Iterator<Integer> itr=set1.iterator();
	while(itr.hasNext())
	{
	System.out.print(itr.next()+" ");
	}
	}
	}

