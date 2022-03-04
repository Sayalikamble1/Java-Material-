import java.util.ArrayList;
import java.util.Collections;

public class List 
{
public static void main(String[] args) 
{
	ArrayList al=new ArrayList();
	al.add('X');
	al.add('A');
	al.add('L');
	al.add('U');
	al.add('C');
	//Add elements of an array list to another array list - addAll()
	ArrayList dup= new ArrayList();
	dup.addAll(al);
	System.out.println(dup);
	//Remove group of elements from the array - removeAll()
	dup.removeAll(al);
	System.out.println(dup);
	System.out.println("Before Sorting-"+al);
	//Sorting  - sort()
	Collections.sort(al);
	System.out.println("After Sorting-"+al);
	//Sorting - Reverse Order
	Collections.sort(al,Collections.reverseOrder());
	System.out.println("Reversed Order-"+al);
	//Shuffling
	Collections.shuffle(al);
	System.out.println("Shuffle-"+al);
	
	
	
	
}
}
