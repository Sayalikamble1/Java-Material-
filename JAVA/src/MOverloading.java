class overL
{
 public int Multiply(int a,int b)
	{
		return a*b;
	}
	public double Multiply(double a,double b)
	{
		return a*b;
	}
}
class MOverloading 
{
public static void main(String[] args) 
{
	overL ol=new overL();
	int s=ol.Multiply(10,5);
	System.out.println("Result is :- "+s);
	double k=ol.Multiply(10.5,5.4);
	System.out.println("Result is :- "+k);
	
	
	
}
}
