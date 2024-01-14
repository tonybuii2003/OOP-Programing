
public class Stock {
	private String symbol, name;
	private double previousClosingPrice, currentPrice;
	public String getSymbol() {
		return this.symbol;
	}
	public String getName() {
		return this.name;
	}
	public double getPreviousClosingPrice() {
		return this.previousClosingPrice;
	}
	public double getCurrentPrice() {
		return this.currentPrice;
	}
	public void setPreviousClosingPrice(double a) {
		this.previousClosingPrice = a;
	}
	public void setCurrentPrice(double a) {
		this.currentPrice = a;
	}
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	public double changePercent() {
		return (getCurrentPrice()-getPreviousClosingPrice())/getPreviousClosingPrice() * 100;
	}
	
}
