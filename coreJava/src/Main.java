 class Main implements Runnable 
{
	private Account acct = new Account();
	public static void main(String[] args) 
	{
		Main m = new Main();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();
	}
	@Override
	public void run() 
	{
		for (int i = 0; i < 5; i++)
		{
			Withdraw(10);
			if (acct.getBalance() < 0)
			{
				System.out.println("account is overdrawn!");
			}
		}
	}
	 synchronized void Withdraw(int amt) 
	 {
		if (acct.getBalance() >= amt) 
		{
			System.out.println(Thread.currentThread().getName() + " is going to deposit");
			try 
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException ex) 
			{
				
			}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
		} 
		else 
		{
			System.out.println("Not enough balance in account for " + Thread.currentThread().getName() + " to withdraw " + acct.getBalance());
		}
	}
}
class Account 
{
     int balance = 50;
	public int getBalance() 
	{
	return balance;
	}
	public void withdraw(int amount) 
	{
	balance = balance - amount;
	}
}
