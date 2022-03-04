
class help
{
	int i=0;
	
	help()
	{
		i++;
	}
	
	public int get()
	{
		return i;
	}
	
	public int m1()
	{
		System.out.println("Inside method m1");
		this.m2();
		return 1;
		
	}
	public void m2()
	{
		System.out.println("In method 2 came from method m2");
	}
    }

 class Method2 
 {
public static void main(String[] args) {
	
	help h=new help();
	int s=h.m1();
	System.out.println("control return after m1 "+s);
	int k=h.get();
	System.out.println(k);
	
}
}
