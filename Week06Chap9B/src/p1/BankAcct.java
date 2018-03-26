package p1;

// this is the class that creates the objects
public class BankAcct {
	
	// data fields - ALWAYS use private access modifier for this course
	private static String bankName; // since name is the same for EVERY object, we can use "static" modifier
	private final static double INTEREST_RATE = 0.005; // interest rate is 1/2% for EVERY object - use "final static"
	private String custName;
	private long acctNum; // could be long or String
	private double balance;
	
	// create the no-arg constructor
	public BankAcct() {
		
	}
	
	// overloaded constructor
	public BankAcct(String name, long acct, double bal) {
		this.custName = name;
		this.acctNum = acct;
		this.balance = bal;
	}

	// getters & setters
	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		BankAcct.bankName = bankName;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(long acctNum) {
		this.acctNum = acctNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getInterestRate() {
		return INTEREST_RATE;
	}
	
	// instance method to deposit
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	// instance method to withdraw
	public void withdraw(double withdraw) {
		
		// validate that there is enough to withdraw
		if (withdraw > this.balance) {
			System.out.println("***Insufficient funds. Withdrawal not completed.***");
			System.out.println("A withdrawal of $" + withdraw + " from a balance of $" + this.balance + " is not permitted.");
		}
		else {
			this.balance -= withdraw;
		}
		
	}
	
	@Override
	public String toString() {
		String 	str = BankAcct.bankName;
				str += "\n  " + this.custName;
				str += "\n  Interest Rate: " + (BankAcct.INTEREST_RATE * 100) + "%";
				str += "\n  Acct Number: " + this.acctNum;
				str += "\n  Current Balance: $" + this.balance;
		return str;
	}

} // end BankAcct class
