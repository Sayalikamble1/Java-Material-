    import java.io.*;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
    public class Q1_Lab11 
{
	public static void main(String[] args) throws IOException
	{
	SimpleDateFormat date = new SimpleDateFormat("dd-MM-YYYY");
	BufferedReader reader = new BufferedReader(new
	InputStreamReader(System.in));
	System.out.println("Enter first date in dd-MM-yyyy Format");
	String firstDate = reader.readLine();
	System.out.println("Enter second date in dd-MM-yyyy Format");
	String secondDate = reader.readLine();
	Date fDate = null;
	try 
	{
	fDate = date.parse(firstDate);
	} 
	catch (ParseException e) 
	{
	System.out.println(e);
	}
	Date sDate = null;
	try 
	{
	sDate = date.parse(secondDate);
	} catch (ParseException e) 
	{
	System.out.println(e);
	}
	long diff =fDate.getTime() - sDate.getTime();
	float daysbtw = (diff / (1000*60*60*24));
	System.out.println("Days between frist and second " +daysbtw);
	}
	}


