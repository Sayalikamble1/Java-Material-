import java.util.stream.LongStream;
import java.io.*;
public class Q1_Lab14 implements Runnable
{
@Override
public void run()
{

}
public static void main(String []args)
{
Natural nat =new Natural();
FactorialLambda factl=new FactorialLambda();
Q1_Lab14 q1 = new Q1_Lab14();
nat.start();
factl.start();
}
}
class Natural extends Thread
{
private PipedWriter pw1 = new PipedWriter();
public PipedWriter getPipedWriter()
{
return pw1;
}
@Override
public void run()
{
int num = 50, sum = 0;
for(int i=1;i<=num;i++)
{
sum += i;
}
System.out.println("Sum = " +sum);
}
}
class FactorialLambda extends Thread
{
private PipedWriter pw = new PipedWriter();
public PipedWriter getPipedWriter()
{
return pw;
}
public static long factorialStreams(long n)
{
return LongStream.rangeClosed(2, n).reduce(1,(long x, long y) -> x * y);
}
@Override
public void run()
{
long n = 5 ; 
long fact; 
fact = factorialStreams(n);
System.out.println("The Factorial using Lambda Expression "+n+" is : "+fact); 
}
}