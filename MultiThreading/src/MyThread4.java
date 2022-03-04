 class MyThread4 extends Thread
{
public static void main(String[] args)
{
	MyThread4  nT=new MyThread4();
	
	nT.start();
	System.out.println("Thread is Alive ? : "+nT.isAlive());
	nT.setName("Sayali");
	nT.setPriority(2);
	System.out.println("Thread Name : "+nT.getName());
	System.out.println("Thread Priority : "+nT.getPriority());
	MyThread4 m4=new MyThread4();
	m4.table();
	
	
}

public void table()
{
	for(int i=0;i<11;i++)
	{
		System.out.println(2  +" * "  +i  +" = " +(2*i));
	}
	
}

}

