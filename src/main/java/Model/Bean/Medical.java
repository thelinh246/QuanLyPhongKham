package Model.Bean;

public class Medical {
	private int MedicalID;
	private int PersonID;
	private String Detail;
	private double Price;
	
	//constructor
	public Medical(int MedicalID, int PersonID, String Detail, double Price) {
		this.MedicalID = MedicalID;
		this.PersonID = PersonID;
		this.Detail = Detail;
		this.Price = Price;
	}
	
	//Get method
	public int getMedicalID() {
		return MedicalID;
	}
	public int getPersonID() {
		return PersonID;
	}
	public String getDetail() {
		return Detail;
	}
	public double getPrice() {
		return Price;
	}
	
	//set method
	public void setMedicalID(int MedicalID) {
		this.MedicalID = MedicalID;
	}
	public void setPersonID(int PersonID) {
		this.PersonID = PersonID;
	}
	public void setDetail(String Detail) {
		this.Detail = Detail;
	}
	public void setPrice(double Price) {
		this.Price = Price;
	}
}
