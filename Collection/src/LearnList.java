import java.util.*;
 class LearnList 
{
public static void main(String args[])
{
	ArrayList li= new ArrayList();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(50);
	System.out.println(li);
	li.add(60);
	System.out.println(li);
	li.add(1, 200);
	System.out.println(li);
	System.out.println(li.contains(50));
	System.out.println(li.contains(500));
	li.remove(2);
	System.out.println(li);
	li.remove(Integer.valueOf(200));
	System.out.println(li);
	System.out.println(li.get(2));
	li.set(1, 20);
	System.out.println(li);
	
	for(int i=0;i<li.size();i++)
	{
		System.out.println("List Elements are :  " + li.get(i));
	}
	
//	for(Object value :li)
//	{
//		System.out.println("For Each elements are :  " +li);
//	}
	li.forEach((n) -> System.out.print(n+" "));
	System.out.println("");
	
	Iterator<Integer> itr=li.iterator();
	while(itr.hasNext())
	{
		
		System.out.print(itr.next() +" ");
	}
}
}
