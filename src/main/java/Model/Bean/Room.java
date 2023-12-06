package Model.Bean;

public class Room {
	private int RoomNumber;
	private int Specialty;
	
	//Construct
	public Room(int RoomNumber, int Specialty) {
		this.RoomNumber = RoomNumber;
		this.Specialty = Specialty;
	}
	
	//Get methods
	public int getRoomNumber() {
		return RoomNumber;
	}
	public int getSpecialty() {
		return Specialty;
	}
	
	//Set methods
	public void setRoomNumber(int RoomNumber) {
		this.RoomNumber = RoomNumber;
	}
	public void setSpecialty(int Specialty) {
		this.Specialty = Specialty;
	}
}
