import java.util.*;
class Address
{
private String name;
private String streetaddress;
private String city;
private String state;
private int zipcode;
Scanner sc=new Scanner(System.in);
public void setName()
{
System.out.println("Enetr the name: ");
name=sc.nextLine();
}
public String getName()
{
return name;
}
public void setstreetAddress()
{
System.out.println("Enetr the Street Adress: ");
streetaddress=sc.nextLine();;
}
public void setcity()
{
System.out.println("Enetr the City: ");
city=sc.nextLine();
}
public void setstate()
{
System.out.println("Enetr the State: ");
state=sc.nextLine();
}
public void setzipcode()
{
	System.out.println("Enetr the Zip Code: ");
	zipcode=sc.nextInt();
}
void printaddress()
{
System.out.println("Name is : "+name);
System.out.println("street address is : "+streetaddress);
System.out.println("city name is : "+city);
System.out.println("state name is : "+state);
System.out.println("zipcode is : "+zipcode);
}
}
class AddressBook {
public static void main(String[] args)
{
Address[] ad=new Address[100];
Scanner sc=new Scanner(System.in);
int count=0;
while(true)
{
System.out.println("Enter your choice");
System.out.println("1. Add Address");
System.out.println("2. Search for Address");
System.out.println("3. Exit");
int choice=sc.nextInt();
switch(choice)
{
case 1:
Address obj=new Address();
obj.setName();
obj.setstreetAddress();
obj.setcity();
obj.setstate();
obj.setzipcode();
ad[count]=obj;
count++;
break;
case 2 :
System.out.println("Enter the name to dislpay the address");
Scanner sc1=new Scanner(System.in);
String searchname=sc1.nextLine();
for(int i=0;i<count;i++)
{
String nameArr=ad[i].getName();
if(searchname.equals(nameArr))
{
ad[i].printaddress();
}
}
}
}
}
}
