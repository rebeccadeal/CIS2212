package p3Stock;

public class StockDriver {

	public static void main(String[] args) {
		
		Stock stock1 = new Stock("ORCL", "Oracle Corporation"); // overloaded constructor
		
		stock1.setPreviousClosingPrice(34.5);	// data from the textbook
		stock1.setCurrentPrice(34.35);			// data from the textbook
		
		System.out.println("Symbol: " + stock1.getSymbol());
		System.out.println("Name: " + stock1.getName());
		System.out.println("Previous Closing: " + stock1.getPreviousClosingPrice());
		System.out.println("Current Closing: " + stock1.getCurrentPrice());
		System.out.println("Percent Change: " + stock1.calcChangePercent());

	}

}
