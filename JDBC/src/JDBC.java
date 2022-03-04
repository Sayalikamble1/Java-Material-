import java.sql.*;

class JDBC 
{
public static void main(String[] args)throws SQLException
{
String url="jdbc:mysql://localhost:3306/pgdac";
String uname="root";
String password="root";
String query= "SELECT PtientId ,Name, Address, Phone FROM hospital";

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
}
catch(ClassNotFoundException e)
{
e.printStackTrace();	
}
try
{
	Connection con=DriverManager.getConnection(url,uname,password);
	Statement statement=con.createStatement();
	ResultSet result=statement.executeQuery(query);
	
	while(result.next())
	{
       String hospitaldata="";
       //for(int i=1;i<3;i++)
       //{
    	   //hospitaldata+=result.getString(i) + " : ";
    	   System.out.print("ID: " + result.getInt("PtientId"));
           System.out.print(", Name: " + result.getString("Name"));
           System.out.print(", Address: " + result.getString("Address"));
           System.out.println(", phone: " + result.getInt("Phone"));
    	
    	  // hospitaldata+=result.getInt("PtientId")+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getLong(4);
       //}
      // System.out.println(hospitaldata);
	}
	
}
catch(SQLException e)
{
	e.printStackTrace();
}
}
}
