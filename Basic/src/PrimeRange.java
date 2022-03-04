import java.util.*;
public class PrimeRange 
{
	static void ranger(int start,int end)
    {
        int count = 0;
        int current = start;
        for(int init=current;init<=end;init++)
        {

            for(int i=1;i<=end;i++)
            {
                if(current % i == 0)
                {
                    count++;
                }

            }
            if(count <= 2)
            {
                System.out.print(current+" ");
            }
            count=0;
            current++;


        }
    }

    public static void main(String args [])
    {
        ranger(13,27);
    }
}