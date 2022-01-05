import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
/**
 * @author abeeha
 *
 */
public class passenger {
	 private String name;
	 private String gender;
	 private int age;
	 private String address;
	 private int PassportNo;
	 private String PlaneType;
	 private String Destination;
	 private int id;
	 private static int idcounter;
	 public passenger()
	 {}
	 
	 public passenger(int ID, String NAME, String GENDER, int AGE, String ADDRESS, int PASSPORTNUM, String PLANETYPE, String DESTINATION )
	 {
		 this.id=++idcounter;
		 name=NAME;	 
		 gender=GENDER;
		 age=AGE;
		 address=ADDRESS;
		 PassportNo=PASSPORTNUM;
		 PlaneType=PLANETYPE;
		 Destination=DESTINATION ;
	     id=ID;
	 }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPassportNo() {
		return PassportNo;
	}

	public void setPassportNo(int passportNo) {
		PassportNo = passportNo;
	}

	public String getPlaneType() {
		return PlaneType;
	}

	public void setPlaneType(String planeType) {
		PlaneType = planeType;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}
	 
	 public String getPassengerInfo()
	 {
		 return "Name: " + name + "\n" +
	            "Gender: " + gender + "\n" +
	            "Age: " + age  + "\n" +
	            "Address: " + address + "\n" +
	            "Passport Number: " + PassportNo + "\n" +
	            "Plane Type: " + PlaneType + "\n" +
	            "Destination: " + Destination + "\n"+
	            "Passenger ID: " + id + "\n";
	       
	            
	 }
	 
	 public static int getPassengerCount()
	 {
		 return idcounter;
	 }
	 
	
}



