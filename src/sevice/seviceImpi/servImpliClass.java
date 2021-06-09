package sevice.seviceImpi;

import java.util.ArrayList;

import client.AddUserDetails;
import dao.daoImpli.DaoCustomer;
import model.Customer;
import sevice.CostomerInterface;

public class servImpliClass implements CostomerInterface {

	static DaoCustomer dao = new DaoCustomer();

//
//	public double withdrawAmtfromDb(int userId, String userName, String dOB, int cardNumber, int atmPin,
//			double cash) {
//		// TODO Auto-generated method stub
//		
//		AddUserDetails ad=new AddUserDetails();
//		 double totalAmt=dao.getTotalAmt(userId, userName, dOB, cardNumber, atmPin, cash);
//		double Bal=(totalAmt-ad.wdAmt);
//		return Bal;
//		
//	}


	@Override
	public void insertDetailsInService(Customer cm) {
		
			dao.insertDB(cm);
		
		
	}



	@Override
	public void getDB() {
		
		dao.creatDB();
	}





	public double deposite(Customer dep, int userId) {
		double totalAmt=dao.getTotalAmt(dep);
		double availableBal=(totalAmt+dep.getDepCash());
		dao.updatingCash(dep,availableBal,userId);
		return availableBal;
	}



	@Override
	public double withdrawAmtfromDb() {
		// TODO Auto-generated method stub
		return 0;
	}




}
