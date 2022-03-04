
import java.sql.*;

import java.util.*;

class DataUpdate
{

public static void main(String[] args)
{
Connection con;
Statement sm;
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
}
catch(ClassNotFoundException e)
{
System.out.println(e);
}
try

{
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pgdac","root","root");

sm=con.createStatement();

System.out.println("Enter patient id");
int i=sc.nextInt();
System.out.println("Enter patient name");
String nam=sc1.nextLine();

String str="update hospital set Name='"+nam+"' where PtientId="+i;
System.out.println(str);

int cnt = sm.executeUpdate(str);

System.out.println("Rows affected:"+cnt);

sm.close();
con.close();

}
catch(SQLException e)
{
System.out.println(e);
}

}
}