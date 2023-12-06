package Model.BO;

import Model.DAO.PersonDAO;

public class LoginBO {
	PersonDAO pD = new PersonDAO();
	public boolean validateUser(String username, String password) {
		if (username == null || password == null) {
			return false;
		}
		boolean checkUser = pD.isValidUser(username, password);
		if(checkUser) {return true;}
		return false;
	}
}
