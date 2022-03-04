
import java.util.*;
public class TollBooth
{
static int PayVehicle;
static int NonPayVehicle;
static int TotalAmount; 
static int TotalVehicle;

TollBooth()
    {
	PayVehicle=0;
	NonPayVehicle=0;
	TotalAmount=0;
        TotalVehicle=0;
        
	}
static void HeavyVehicle()
{
 PayVehicle++;
 TotalVehicle++;
 TotalAmount=TotalAmount+50;
}
static void MediumVehicle()
{
	PayVehicle++;
        TotalVehicle++;
	TotalAmount=TotalAmount+20;
}
static void TwoWheeler()
{
	PayVehicle++;
        TotalVehicle++;
	TotalAmount=TotalAmount+10;
}
 static void NonPayVehicle()
{
	NonPayVehicle++;
        TotalVehicle++;
}
 static void Display()
 {
	 System.out.println("Total Amount collected by Vehicles : "+TotalAmount);
         System.out.println("Total Vehicles : "+TotalVehicle);
          
 }
 static void pvehicle()
 {
	 System.out.println("Total Paying Vehicles : "+PayVehicle); 
 }
 static void npvehicle()
 {
	 System.out.println("Total Non Paying Vehicles : "+NonPayVehicle);
 }
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int ch=0;
	 
	 do
	 {
		 System.out.println("1- Paying Heavy Vehicles(50)");
		 System.out.println("2- Paying Medium Vehicles(20)");
		 System.out.println("3- Paying Two Wheelers(10)");
		 System.out.println("4- Non-Paying Vehicles(50)");
		 System.out.println("5- Display paying Vehicle Count");
		 System.out.println("6- Display Non-paying Vehicle Count");
		 System.out.println("7- Display Total");
		 System.out.println("8- Exit");
		 ch=sc.nextInt();
		 
		 switch(ch)
		 {
		 case 1:
			 TollBooth.HeavyVehicle();
			 break;
		 case 2:
			 TollBooth.MediumVehicle();
			 break;
		 case 3:
			 TollBooth.TwoWheeler();
			 break;
		 case 4:
			 TollBooth.NonPayVehicle();
			 break;
		 case 5:
			 TollBooth.pvehicle();
			 break;
		 case 6:
			 TollBooth.npvehicle();
			 break;
		 case 7:
			 TollBooth.Display();
			 break;
			 
			 
		 
		 }
		 
	 }while(ch!=8);
 }
}
