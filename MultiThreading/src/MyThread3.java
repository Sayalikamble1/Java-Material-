class NewThread extends Thread
{
	@Override
	public void run()
	{
		try
		{	
		MyThread3 t1=new MyThread3();
		t1.table();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
	}
}

public class MyThread3
{
	public static void main(String ar[]) throws InterruptedException
	{
		NewThread nt=new NewThread();
		nt.start();
		nt.setName("Thread1");
		nt.setPriority(1);
		System.out.println("Thread Alive?"+nt.isAlive());
		
		//nt.join();
		System.out.println("Thread name="+nt.getName());
		System.out.println("Thread priority="+nt.getPriority());
		System.out.println("Thread Alive?"+nt.isAlive());
		MyThread3 t1=new MyThread3();
		t1.pattern();
		System.out.println("Currently Running Thread:"+Thread.currentThread());
		
		
	}
	public void pattern()
	{
		for(int row=1;row<=20;row++)
		{
			for(int i=1;i<=row;i++)
				System.out.print('*');
			System.out.println();
		}
	}
	public void table() throws InterruptedException
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("i="+i+",i*i="+i*i);
			Thread.sleep(100);
		}
		System.out.println("Currently Running Thread:"+Thread.currentThread());
	}
}