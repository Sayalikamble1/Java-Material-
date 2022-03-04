class InheritanceEx 
{
public int gear;
public int speed;

public InheritanceEx(int gear,int speed)
{
this.gear=gear;
this.speed=speed;
}
public String toString()
{
	return("No of gears are - " +gear +"\n"+"Speed is:- "+speed);
}
}
class Motor extends InheritanceEx
{
	public int seatHeight;

	public Motor(int gear, int speed,int StartHeight)
	{
		super( gear,speed);
		seatHeight=StartHeight;
		
	}
	public void seat(int newvalue)
	{
		seatHeight=newvalue;
	}
	public String toString()
	{
		return(super.toString()+"\nSeat height is :- "+seatHeight);
		
	}
	public static void main(String[] args) 
	{
		Motor m=new Motor(5,25,45);
		System.out.println(m.toString());
		
	}
}
