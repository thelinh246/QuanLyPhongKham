package Model.Bean;

public class Person {
	private int PersonID;
	private String Name;
	private int Age;
	private String PhoneNumber;
	private String Username;
	private String Password;
	private String Address;
	private int Role;
	
	//constructor
	public Person(int PersonID, String Name, int Age, String PhoneNumber, String Username, String Password, String Address, int Role) {
		this.PersonID = PersonID;
		this.Name = Name;
		this.Age = Age;
		this.PhoneNumber = PhoneNumber;
		this.Username = Username;
		this.Password = Password;
		this.Address = Address;
		this.Role = Role;
	}
	
	//Get method
	public int getPersonID() {
		return PersonID;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public String getUsername() {
		return Username;
	}
	public String getPassword() {
		return Password;
	}
	public String getAddress() {
		return Address;
	}
	public int getRole() {
		return Role;
	}
	
	//set method
	public void setPersonID(int PersonID) {
		this.PersonID = PersonID;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public void setAge(int Age) {
		this.Age = Age;
	}
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public void setRole(int Role) {
		this.Role = Role;
	}
}
