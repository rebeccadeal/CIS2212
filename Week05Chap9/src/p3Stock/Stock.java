package p3Stock;

public class Stock {
	
	private String symbol, name;
	private double previousClosingPrice, currentPrice;
	
	// no-arg constructor
	public Stock() {
		// not initialized
	}
	
	// overloaded constructor
	public Stock(String newSymbol, String newName) {
		this.symbol = newSymbol;
		this.name = newName;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
		
	public double calcChangePercent() {
		double change = (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice * 100;
		return change;
	}

} // end Stock class
