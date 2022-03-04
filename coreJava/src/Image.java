import java.io.*;

public class Image 
{
public static void main(String args[]) throws IOException
{
	FileInputStream in=new FileInputStream("C:\\Users\\user\\Desktop\\JAVA2\\JAVA_LAB_9/dog.jpg");
	FileOutputStream out=new FileOutputStream("C:\\Users\\user\\Desktop\\JAVA2\\JAVA_LAB_9/dog2.jpg");
	int c;
	while((c=in.read())!= 1)
	{
		out.write(c);
	}
	in.close();
	out.close();
}
}
