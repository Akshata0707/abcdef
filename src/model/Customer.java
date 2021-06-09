package model;

public class Customer {

	private int userId;
	private String userName;
	private String DOB;
	private int cardNumber;
	private int atmPin;
	private double cash;
	private double depCash;

	public Customer() {
		
	}
	
	public Customer(double cash) {
		this.cash=cash;
	}

	public Customer(int userId, String userName, String dOB, int cardNumber, int atmPin, double cash) {
		super();
		this.userId = userId;
		this.userName = userName;
		DOB = dOB;
		this.cardNumber = cardNumber;
		this.atmPin = atmPin;
		this.cash = cash;
	}

	public Customer(int userId, String userName, int atmPin, double depCash) {
		this.userId = userId;
		this.userName = userName;
		this.atmPin = atmPin;
		this.depCash = depCash;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public double getDepCash() {
		return depCash;
	}

	public void setDepCash(double depCash) {
		this.depCash = depCash;
	}

	@Override
	public String toString() {
		return "Customer [userid=" + userId + ", userName=" + userName + ", DOB=" + DOB + ", cardNumber=" + cardNumber
				+ ", atmPin=" + atmPin + ", cash=" + cash + "]";
	}

}
