import java.nio.*;
import java.nio.channels.*;
import java.io.*;
 class Q3_Lab10 
{
public static void main(String[] args) throws FileNotFoundException,
IOException
{
File file = new
File("C:\\Users\\user\\Desktop\\JAVA2\\JAVA_LAB_10\\data.txt");
try
{
FileInputStream fin=new FileInputStream(file);
FileChannel fc =fin.getChannel();
ByteBuffer re=ByteBuffer.allocate(1024*2);
while(fc.read(re) > 0)
 {
 re.flip();
 for (int i = 0; i < re.limit(); i++)
 {
 System.out.print((char) re.get());
 }
 re.clear();
 }
 fc.close();
 fin.close();
}
catch(IOException ex)
 {
 System.out.println(ex);
 }
 }
 }
