//Create An ATM Application using Folder Structure and JDBC in which you can perform below Operations
//    i- Create Customer
//            userid ----> primary
//            userName
//            DOB
//            CardNumber
//            AtmPin
//            Cash
//    ii- user want to deposite the cash
//   
//    iii- user want to withdraw the cash
//   
//    iV-user details as per the Id

package Utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	private static final String URL = "jdbc:mysql://localhost:3306/Atm";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Agmpatil1234";

	// getting connection
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}
}