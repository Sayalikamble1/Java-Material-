
  class Q2_lab13
  {
  public static void main(String[] args)
  {
  BankAccount account = new BankAccount();
 final double AMOUNT = 100;
 int REPETITIONS = 100;
 final int THREADS = 100;
  for (int i = 1; i <= THREADS; i++)
 {
 DepositRunnable d = new DepositRunnable( account, AMOUNT, REPETITIONS);
 WithdrawRunnable w = new WithdrawRunnable(account, AMOUNT, REPETITIONS);
 
 Thread dt = new Thread(d);
 Thread wt = new Thread(w);
 dt.start();
 wt.start();
 }
 }
 }
  class DepositRunnable implements Runnable
   {
  private static final int DELAY = 1;
  private BankAccount account;
  private double amount;
  private int count;
  
  public DepositRunnable(BankAccount anAccount, double anAmount,
		   int aCount)
		   {
		   account = anAccount;
		   amount = anAmount;
		   count = aCount;
		   }
  
   public void run()
   {
   try
   {
   for (int i = 1; i <= count; i++)
   {
   account.deposit(amount);
   Thread.sleep(DELAY);
   }
   }
   catch (InterruptedException exception) {}
  }
   }
   class WithdrawRunnable implements Runnable
   {
   private static final int DELAY = 1;
   private BankAccount account;
   private double amount;
   private int count;
   
   WithdrawRunnable(BankAccount anAccount, double anAmount,
		    int aCount)
		    {
		    account = anAccount;
		    amount = anAmount;
		    count = aCount;
		    }
    public void run()
    {
    try
    {
    for (int i = 1; i <= count; i++)
    {
    account.withdraw(amount);
    Thread.sleep(DELAY);
    }
    }
   catch (InterruptedException exception) {}
    }
    }
   class BankAccount
   {
  private double balance;
 
   
  public BankAccount()
  {
 balance = 0;
  }
   
   void deposit(double amount)
    {
   System.out.print("Depositing " + amount);
    double newBalance = balance + amount;
   System.out.println(", new balance is " + newBalance);
    balance = newBalance;
    }
   
   public void withdraw(double amount)
    {
    System.out.print("Withdrawing " + amount);
    double newBalance = balance - amount;
    System.out.println(", new balance is " + newBalance);
   balance = newBalance;
   }
    double getBalance()
    {
    return balance;
    }
    }
   
   


