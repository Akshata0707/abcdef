package dao.daoImpli;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Utility.DBUtil;
import dao.daoInterface;
import model.Customer;

public  class DaoCustomer implements daoInterface {

	public void creatDB() {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		ArrayList<Customer> cl=new ArrayList<Customer>();
		try {
			con=DBUtil.getConnection();
			st=con.createStatement();

			
			String query="select* from Customer;";
			rs=st.executeQuery(query);
			
			while(rs.next()) {
				int userId=rs.getInt(1);
				String userName=rs.getString(2);
				String DOB=rs.getString(3);
				int cardNumber=rs.getInt(4);
				int atmPin=rs.getInt(5);
				double cash=rs.getDouble(6);
				
				System.out.println(userId+" "+userName+" "+DOB+" "+cardNumber+" "+atmPin+" "+cash);
				
				//Customer cm=new Customer(userId,userName,DOB,cardNumber,atmPin,cash);
				
				//cl.add(cm);			
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	public void insertDB(Customer cm) {
		Connection con=null;
		PreparedStatement ps=null;
		//int rs=0;
		//ArrayList<Customer> cl=new ArrayList<Customer>();
		try {
			con=DBUtil.getConnection();
			
			ps=con.prepareStatement("insert into customer values (?,?,?,?,?,?);");
	
				ps.setInt(1, cm.getUserId());
				ps.setString(2,cm.getUserName());
				ps.setString(3,cm.getDOB());
				ps.setInt(4,cm.getCardNumber());
				ps.setInt(5,cm.getAtmPin());
				ps.setDouble(6,cm.getCash());
				
				ps.executeUpdate();
//				while(rs>0) {
//			    //cm=new Customer(userId,userName,dOB,cardNumber,atmPin,cash);
//				
//				cl.add(cm);			
//				}
//			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	public double getTotalAmt(Customer dep) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		double cash = 0;
		
		try {
			con=DBUtil.getConnection();
			st=con.createStatement();

			String query="select cash from Customer where userid="+dep.getUserId()+";";
			rs=st.executeQuery(query);
			while(rs.next()) {
				 cash=rs.getDouble(1);
			}
			
//			cm=new Customer(cash);
//			cl.add(cm);
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return cash;
		
		
	}

	public void updatingCash(Customer dep, double availableBal, int userId) {
		
		Connection con=null;
		Statement st=null;
		//ResultSet rs=null;
		double cash = 0;
		
		
		try {
			con=DBUtil.getConnection();
			st=con.createStatement();
			ResultSet rs=null;
			String query="update Customer set cash="+availableBal+"where userId="+userId;
			//rs=st.executeQuery(query);
//			while(rs.next()) {
//				// cash=rs.getDouble(1);
//			}
		st.executeUpdate(query);
		String query1="select * from Customer where userId ="+userId;
		
	//	((Statement) rs).executeQuery(query1);
		System.out.println(rs.getInt(userId));
//			cm=new Customer(cash);
//			cl.add(cm);
			}catch(SQLException e) {
				e.printStackTrace();
			}
		//return cash;
		
	}
	
	
}
