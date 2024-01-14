
class Package {

	private String sender;

	private String recipient;

	private int cost = 0;

	private int distance;

	public Package(String sender,  String recipient, int distance) {

        this.sender = sender;

        this.recipient = recipient;

        this.distance = distance;

	}
	public int getDistance() {

        return distance;

     }

     public int getCost() {

        return cost;

     }
     public void setCost(int cost) {

        this.cost = cost; 

     }
     /**
      * This method calculate the total shipping cost due to the shipping distance.
      * @param packages is a list of Package to get the distance
      * @param costSchedule is the list of assigned price for each schedule depend on the shipping distance.
      * @return
      */
     public static int shippingCost(Package[] packages, int[] costSchedule) {
    	 int total = 0;
    	 for (int i = 0; i<packages.length; i++) {
    		 if (packages[i].getDistance() < 100) {
        		 packages[i].cost = costSchedule[0];
        	 }
        	 if (packages[i].getDistance() >= 100 && packages[i].getDistance() < 300) {
        		 packages[i].cost = costSchedule[1];
        	 }
        	 if (packages[i].getDistance() >= 300 && packages[i].getDistance() < 500) {
        		 packages[i].cost = costSchedule[2];
        	 }
        	 if (packages[i].getDistance()> 500) {
        		 packages[i].cost = costSchedule[3];
        	 }
        	 total += packages[i].cost;
    	 }
    	
    	 return total;
    }

}
