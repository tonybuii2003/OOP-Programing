
public class StockDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock google = new Stock("GOOD", "Google");
		google.setPreviousClosingPrice(100);
		google.setCurrentPrice(90);
		double percentChange = google.changePercent();
		System.out.println(percentChange);
		
		Stock tesla = new Stock("TSLA", "Tesla");
		tesla.setPreviousClosingPrice(877.36);
		tesla.setCurrentPrice(864.27);
		double percentChange2 = tesla.changePercent();
		System.out.println(percentChange2);
		
		Stock apple = new Stock("APPL", "Apple");
		apple.setPreviousClosingPrice(147.01);
		apple.setCurrentPrice(148.76);
		double percentChange3 = tesla.changePercent();
		System.out.println(percentChange3);
	}

}
