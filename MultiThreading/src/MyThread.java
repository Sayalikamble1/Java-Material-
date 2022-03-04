public class MyThread extends Thread
{
public void run()
{
	int a=5,b=7;
	System.out.println("The Multiplication of " +a +" and " +b +" is " +(a*b));
	
}
public static void main(String[] args) 
{
	MyThread t=new MyThread();
	t.start();
}
}
