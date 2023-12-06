package Model.Bean;

import java.sql.Date;

public class Appoint {
	private int AppointmentID;
	private int RoomNumber;
	private int PersonID;
	private Date TimeStart;
	private Date TimeEnd;
	
	//Contructor
	public Appoint(int Appointment, int RoomNumber, int PersonID, Date TimeStart, Date TimeEnd) {
		this.AppointmentID = Appointment;
		this.RoomNumber = RoomNumber;
		this.PersonID = PersonID;
		this.TimeStart = TimeStart;
		this.TimeEnd = TimeEnd;
	}
	
	//Get method
	public int getApointmentID() {
		return AppointmentID;
	}
	public int getRoomNumber() {
		return RoomNumber;
	}
	public int getPersonID() {
		return PersonID;
	}
	public Date getTimeStart() {
		return TimeStart;
	}
	public Date getTimeEnd() {
		return TimeEnd;
	}
	
	//Set method
	public void setApointmentID(int AppointmentID) {
		this.AppointmentID = AppointmentID;
	}
	public void setRoomNumber(int RoomNumber) {
		this.RoomNumber = RoomNumber;
	}
	public void setPersonID(int PersonID) {
		this.PersonID = PersonID;
	}
	public void setTimeStart(Date TimeStart) {
		this.TimeStart = TimeStart;
	}
	public void setTimeEnd(Date TimeEnd) {
		this.TimeEnd = TimeEnd;
	}
}
