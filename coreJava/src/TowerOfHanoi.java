
public class TowerOfHanoi 
{
 static void tower(int n,char from_rod,char to_rod,char third_rod)
	{
		if(n==1)
		{
			System.out.println("Take a disk 1 from rod "   + from_rod  +"  to rod "  +to_rod);
			return ;
		}
		tower(n-1,from_rod,third_rod,to_rod);
		System.out.println("Take a disk " +  n  + " from rod " +  from_rod  +" to rod  " +to_rod);
		tower(n-1,third_rod,to_rod,from_rod);
		}
 public static void main(String args[])
 {
	 int n=3;
	 tower(n,'A','C','B');
 }
	}


