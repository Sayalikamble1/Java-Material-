import java.util.ArrayList;
public class ArrayList1 
{
public static void main(String[] args) 
{
	ArrayList al=new ArrayList();
	al.add("Sayali");
	al.add(1);
	al.add(24.9);
	al.add('S');
	System.out.println("Elements of List :"+al);
	al.add(2, "03-1997");
    System.out.println(al);
    System.out.println(al.size());
    System.out.println(al.contains('S'));
    al.add('K');
    System.out.println(al);
    al.remove(3);
    System.out.println(al);
    System.out.println(al.get(0));
    System.out.println(al.set(3, "BE"));
    System.out.println(al);
    System.out.println(al.isEmpty());
    
    for(int i=0;i<al.size();i++)
    {
    	System.out.print(al.get(i)+ " ");
    }
    System.out.println();
    for(Object value :al)
    {
    	System.out.print(value+" ");
    }
	
}
}
