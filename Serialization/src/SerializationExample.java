import java.io.*;    
class SerializationExample
{    
 public static void main(String args[]){    
  try{    
  
 Serialize s1 =new Serialize(); 
 s1.name="Sayali";
 s1.Address="Thane";
 s1.id=5;
 
  
  FileOutputStream fout=new FileOutputStream("E:\\Eclips workspace\\Serialization\\char.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);    
  out.writeObject(s1);    
  out.flush();    
  out.close();    
  System.out.println("Serialize data is saved in char.txt file ");    
  }
  catch(Exception e)
  {
	  System.out.println(e);
	  }    
 }    
}  

