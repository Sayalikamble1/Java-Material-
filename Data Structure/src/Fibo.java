public class Fibo
{
	public static int fiboRecursion(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fiboRecursion(n-2) + fiboRecursion(n-1);
	}
    public static void main(String args[]) {
	int Number = 20;
	System.out.print("Fibonacci Series of "+Number+" numbers: ");
	for(int i = 0; i < Number; i++){
			System.out.print(fiboRecursion(i) +" ");
		}
	}
}
