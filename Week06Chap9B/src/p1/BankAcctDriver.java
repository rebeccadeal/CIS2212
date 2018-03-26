package p1;

public class BankAcctDriver {
	
	public static void main(String[] args) {
		
		// create instances of the BankAcct class
		BankAcct acct1 = new BankAcct(); // no-arg constructor creates the object, but doesn't initialize anything
		BankAcct acct2 = new BankAcct("Olive Oyl", 987654321, 1111.00);
		BankAcct acct3 = new BankAcct("Bugs Bunny", 987321456, 2222.25);
		BankAcct acct4 = new BankAcct("Fred Flintstone", 456321789, 3333.50);
		BankAcct acct5 = new BankAcct("Minnie Mouse", 789456123, 4444.75);
		
		// set up the bank name for ALL objects (static modifier)
		BankAcct.setBankName("\nSinclair Savings & Loan"); // use class name instead of reference variables's name
		
		// display account details
		System.out.println(acct1.toString());
		System.out.println(acct2);
		System.out.println(acct3);
		System.out.println(acct4);
		System.out.println(acct5);
		
		// change the bank name - if you change one, you change them ALL
		BankAcct.setBankName("\nWright Savings");
		
		// display account details
		System.out.println(acct1.toString());
		System.out.println(acct2);
		System.out.println(acct3);
		System.out.println(acct4);
		System.out.println(acct5);
		
		// .
		
	} // end main method
	
	// create method to add amount & display output a certain number of times
	public static void displayObject(BankAcct account, double amt, int num) {
		
		for (int i = 0; i < num; i++) {
			account.deposit(amt);
			System.out.println();
			// .
		}
		
	}

} // end BankAcctDriver class
