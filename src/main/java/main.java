import java.util.Scanner;
import java.util.Random;
public class main {
    
	public static void main(String args[])
	{
		passenger obj = new passenger();
		Scanner input = new Scanner(System.in);
	    int option=0;
	    
	    
	     do {
	    	 System.out.print( "WELCOME TO BEE's FLIGHT RESERVATION SYSTEM" + "\n"); 
	    	 System.out.print( "Choose any 1 of the options below: " + "\n");
	    	 System.out.print( "1.  BOOK YOUR FLIGHT" + "\n");
	    	 System.out.print( "2.  CANCEL YOUR FLIGHT" + "\n");
	    	 System.out.print( "3.  EDIT YOUR FLIGHT " + "\n");
	    	 System.out.print( "4.  VIEW PRICES OF THE FLIGHT:  " + "\n");
	    	 System.out.print( "5.  SEARCH FLIGHT:  " + "\n");
	    	 System.out.print( "6.  Exit from the System" + "\n");
	    	 
	    	 
	    	option= input.nextInt();
	    	
	    	switch(option)
	    	{
	    	case 1:
	    	{
	    	   PassengerDetails();
	    	   break;

	    	}
	    	case 2:
	    	{
	    		
	    	}
	    	case 3:
	    	{
	    		
	    	}
	    	case 4:
	    	{
	    		
	    	}
	    	case 5:
	    	{
	    		
	    	}
	    	case 6: 
	    	      {
	    	    	  System.exit(0);
	    	      }
	    	}
	     }
	     
	     while(option!=6);
	}
	

public static void PassengerDetails()
{
	 Scanner input2= new Scanner(System.in);
	 String name;
	 String gender;
	 int age;
	 String address;
	 int PassportNo;
	 String PlaneType;
	 String Destination;
	 //int id;
	 System.out.print(	"\nEnter your age : ");
		age = input2.nextInt();
		System.out.print(	"\nEnter your passport number : ");
		PassportNo = input2.nextInt();
		System.out.print(	"\nEnter youtur name : ");
		name = input2.next();
		System.out.print(	"\nEnter your gender : ");
		gender = input2.next();
	
		
		System.out.print(	"\nEnter your address : ");
		address = input2.next();
		System.out.print(	"\nEnter your type of flight : ");
		PlaneType = input2.next();
		System.out.print(	"\nEnter your destination : ");
		Destination = input2.next();
		
		Random rand= new Random();
		int upperbound= 105;
		// generating passenger id from 0 to 104;
		int id = rand.nextInt(upperbound);
		System.out.print("\nYOUR PASSENGER ID is:");
		System.out.print(id + "\n");
	passenger obj = new passenger(id, name, gender, age, address, PassportNo, PlaneType, Destination);

}
 public void Validatename(String name) throws Exception
 {
	 if (name.matches("[a-zA-Z]+"))
	 {
		 System.out.print("Exception checked: Name only consists of letters");
	 }
	 else 
		 System.out.print("Exception checked: Name contains special characters, numbers as well");
 }
 
 
}


