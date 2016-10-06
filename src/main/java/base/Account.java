package base;

import java.util.Date;

import Exceptions.InsufficientFundsException;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account(){
		dateCreated = new java.util.Date();
	}
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new java.util.Date();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		double MonthlyInterestRate = annualInterestRate / 12 ;
		return MonthlyInterestRate;

	}
	public void withdraw(int moneywithdraw) throws InsufficientFundsException{
		if( moneywithdraw <= balance){
		balance -= moneywithdraw;
	}else{
		System.out.println("Insufficient Funds");
		double needmoney = moneywithdraw - balance;
		throw new InsufficientFundsException("You still need "+needmoney, needmoney);
	}
	}
	public void deposit(int moneydeposit){
		balance += moneydeposit;
	}
}
