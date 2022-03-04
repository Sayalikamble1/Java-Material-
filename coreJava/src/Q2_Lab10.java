import java.io.*;
import java.util.*;
public class Q2_Lab10
{
public static void main(String args[]) throws IOException,ClassNotFoundException
{
	String s="";
	Date d=new Date();
	System.out.println(d);
	FileOutputStream fout=new FileOutputStream("C:\\Users\\user\\Desktop\\JAVA2\\JAVA_LAB_10/date.txt");
	ObjectOutputStream oout=new ObjectOutputStream(fout);
	
	oout.writeObject(d);
	oout.close();
	fout.close();
	
	FileInputStream fin=new FileInputStream("C:\\Users\\user\\Desktop\\JAVA2\\JAVA_LAB_10/date.txt");
	ObjectInputStream oin=new ObjectInputStream(fin);
	
	Object r=oin.readObject();
	Date obj=(Date)r;
	System.out.println(obj);
	
	oin.close();
	fin.close();
	
}
}
