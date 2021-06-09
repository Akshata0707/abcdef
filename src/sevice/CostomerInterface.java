package sevice;

import java.util.ArrayList;

import model.Customer;

public interface CostomerInterface {
	void getDB();
	void insertDetailsInService(Customer cm);
	//ArrayList<Customer> insertIntoDb(int userId, String userName, String DOB, int cardNumber, int atmPin, double cash);

	double deposite(Customer dep,int userId);
	
	double withdrawAmtfromDb();
}
