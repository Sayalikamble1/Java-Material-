public class MyThread2 implements Runnable 
{
public void run()
{
	try
	{
	//System.out.println("Current Thread is " +Thread.currentThread().getId());
		System.out.println("Thread is running ");
	}
	catch(Exception e)
	{
		System.out.println("Exception is caught");
	}
		
}
public static void main(String[] args) 
{

	/*int n=5;
	for(int i=0;i<n;i++)
	{
		MyThread2 mt=new MyThread2();
		Thread t=new Thread(mt);
		t.start();
	}*/
	MyThread2 myt=new MyThread2();
	Thread T=new Thread(myt);
	T.start();
	System.out.println(T.getName());
	T.setName("Sayali");
	System.out.println(T.getName());
	System.out.println(T.getPriority());
	T.setPriority(Thread.MIN_PRIORITY);
	System.out.println(T.getPriority());
	
	
}
}
