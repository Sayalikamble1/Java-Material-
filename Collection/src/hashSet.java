import java.util.HashSet;
import java.util.Iterator;

public class hashSet 
{
public static void main(String[] args) 
{
	HashSet hs=new HashSet();
	hs.add(1);
	hs.add(4);
	hs.add(5);
	hs.add(9);
	hs.add(2);
	System.out.println(hs);//[1, 2, 4, 5, 9] Insertion order is not preserved
	
	System.out.println(hs.size());
	
	hs.add(11);
	System.out.println(hs);
	hs.remove(11);// remove element from hashset
	System.out.println(hs);
	
	System.out.println(hs.contains(5));
	
	for(Object h:hs)
	{
		System.out.print(h+" ");
	}
	System.out.println();
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
}
}
