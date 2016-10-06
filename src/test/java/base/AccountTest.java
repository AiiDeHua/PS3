package base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Exceptions.InsufficientFundsException;
import base.Account;

public class AccountTest {
	
	static Account newAccount;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		newAccount = new Account(1122,20000);
		newAccount.setAnnualInterestRate(0.045);
	}

	@After
	public void tearDown() throws Exception {
		newAccount = null;
	}

	@Test
	public final void testWithDraw() throws InsufficientFundsException {
		newAccount.withdraw(2500);
		newAccount.deposit(3000);
		
		System.out.println("Balance is " + newAccount.getBalance());
		System.out.println("Monthly interest fee is " + newAccount.getMonthlyInterestRate());
		System.out.println("The date that the account was created is " + newAccount.getDateCreated());
	}
	@Test(expected = InsufficientFundsException.class)
	public final void testWithDraw2() throws InsufficientFundsException {
		newAccount.withdraw(25000);
	}
}

