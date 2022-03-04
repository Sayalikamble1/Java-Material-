import java.sql.*;
public class Data
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
try
{

con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pgdac","root","root");
System.out.println("connected");

stmt=
con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
ResultSet rst=stmt.executeQuery("select * from hospital");

//ResultSetMetaData rsmd=rst.getMetaData();
//int cols=rsmd.getColumnCount();

//for(int i=1;i<=cols;i++)
//System.out.print(rsmd.getColumnName(i)+"\t");
//System.out.println();

//while(rst.next())
//{

rst.next();
System.out.println
(rst.getInt("PtientId")+"\t"+rst.getString(2)+"\t"+rst.getString(3)+"\t"+rst.getLong(4));
//}

}
catch(SQLException e)
{
System.out.println(e);
}
finally
{
try
{
stmt.close();
con.close();
}

catch(Exception e)

{System.out.println(e);
}
}
}
}