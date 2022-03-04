import java.io.*;  
class DeSerializationExample
{  
 public static void main(String args[])
 {  
  try{  
  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("E:\\Eclips workspace\\Serialization\\char.txt"));  
  Serialize s=(Serialize)in.readObject();  
  
  System.out.println("Name - "+s.name);
  System.out.println("Address - " +s.Address);
  System.out.println("Id - "+s.id);
  in.close();  
  }
  catch(Exception e)
  {
	  System.out.println(e);
	  }  
 }  
}  
