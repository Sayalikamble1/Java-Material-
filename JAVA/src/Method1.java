class Method
{
int sum =0;
public int addition(int a,int b)
{
	sum=a+b;

	return sum;
}
}
class Method1
{
	public static void main(String[] args)
	{
		Method m1=new Method();
		int m=m1.addition(10,15);
		System.out.println("Sum is :- "+m);
	}
}
