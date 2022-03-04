import java.security.DomainCombiner;
import java.util.Scanner;
 class Login 
{
	String UserName;
	String PassWord;
	String Status;
	
	Login()
	{
		UserName="Sayali";
		PassWord="Sk1234";
		Status="Enable";		
	}
	
	  void login()
	    {
	       
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter username:");
	        UserName = s.nextLine();
	        System.out.print("Enter password:");
	        PassWord = s.nextLine();
	        if(UserName.equals("Sayali") && PassWord.equals("Sk1234"))
	        {
	            System.out.println("Welcome to Login Page");
	            System.out.println("Status :"+Status);
	           
	        }
	        else
	        {   System.out.println("OOps...Username and Password is incorrect");
	            System.out.println("Status Disabled");
	         
	        }
	        }
	         public static void main(String args[])
	       {
	    	   Login lo=new Login();
	    	   lo.login();
	       }
	    }
	


