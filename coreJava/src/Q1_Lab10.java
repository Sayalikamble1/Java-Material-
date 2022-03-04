import java.io.*;
public class Q1_Lab10
{
 public static void main(String[] args)throws IOException
{
try
{
File f = new
File("C:\\Users\\user\\Desktop\\JAVA2\\JAVA_LAB_10\\data.txt");
BufferedReader read = new BufferedReader(new FileReader(f));
String str="java";
String str1="JAVA";
String line;
while((line = read.readLine())!=null)
{
if(line.contains(str))
{
System.out.println(line);
}
else if(line.contains(str1))
{
System.out.println(line);
}
}
read.close();
}
catch(IOException e)
{
System.out.print(e);
}
}
}