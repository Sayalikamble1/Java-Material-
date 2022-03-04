import java.util.*;
class Q2_lab6
{
	public static void main(String args[])
	{
		int i;
		char arr[];
		Scanner s = new Scanner(System.in);
        System.out.println("Enter alphabets :");
         arr=s.nextLine().toCharArray();
		for(i=0;i<arr.length;i++)		
		{	
		 switch(arr[i])
			{
			case 'a': case 'A': 
            			System.out.println("This is a Vowel");
            			break;
        
			case 'e': case 'E':
         	   		System.out.println("This is a Vowel");
        	    		break;
	        
			case 'i': case 'I':
        	    		System.out.println("This is a Vowel");
            			break;
        
			case 'o': case 'O':
        	    		System.out.println("This is a Vowel");
        	    		break;
        
			case 'u': case 'U':
        	    		System.out.println("This is a Vowel");
        	    		break;
        
	
			default: 
        	
 			 System.out.println("This is a Consonant");
			}
		}
	}
}
