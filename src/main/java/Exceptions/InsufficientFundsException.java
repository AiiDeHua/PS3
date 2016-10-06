package Exceptions;

public class InsufficientFundsException extends Exception {
	private double Amount;

	public InsufficientFundsException( String message, double Amount) {
		super(message);
		this.Amount = Amount;
		System.out.println(message);
	}

	public double getAmount() {
		return Amount;
	}

}