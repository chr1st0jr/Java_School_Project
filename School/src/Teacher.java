import java.util.Date;

public class Teacher extends Person{
	String roomnumber;
	
	public Teacher(String name, String firstName, String dateOfBirth, String email){
		super(name, firstName, dateOfBirth, email);
		roomnumber = "17";
	}
	
}
