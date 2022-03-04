import java.sql.*;
public class LoadDriver 
{
public static void main(String[] args) 
{
	Connection con=null;
	Statement stmt=null;
	try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e);
	}
}
}
