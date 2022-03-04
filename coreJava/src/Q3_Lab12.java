class Q3_Lab12 
{
	   public static <T extends Comparable<T>> T max(T... elements) 
	   {
		    T max = elements[0];
		    for (T element : elements)
		    {
		        if (element.compareTo(max) > 0) 
		        {
		            max = element;
		        }
		    }
		    return max;
}
public static void main(String args[])
{
	
	
 System.out.println(" Max: " + max(Integer.valueOf(32), Integer.valueOf(856), Integer.valueOf(89), Integer.valueOf(3), Integer.valueOf(456), Integer.valueOf(78), Integer.valueOf(45)));
	      
	   
	   
	    

}
}
