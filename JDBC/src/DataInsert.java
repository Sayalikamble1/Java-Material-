import java.sql.*;
import java.util.*;
class DataInsert
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
System.out.println("Enter address");
String addr=sc1.nextLine();
System.out.println("Enter phone no:");
long l=sc.nextLong();

String str="insert into hospital (PtientId,Name,Address,Phone)values("
+ i + ",'" + nam + "','"+addr+"',"+l+")";
System.out.println(str);

int cnt = sm.executeUpdate(str);
if(cnt>0)
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