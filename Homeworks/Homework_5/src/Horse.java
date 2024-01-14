public class Horse {
	private String name;
	private int weight;
	public Horse(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
   /** @return the horse's name */

   public String getName() {
	  return name; 
   }

   /** @return the horse's weight */

   public int getWeight(){
	   	return weight;
	   }
   /**
    * Casting to Horse then compare with name
    */
   public boolean equals(Object o) {
	   if (o instanceof Horse)
		   return name.equals(((Horse)o).name);
	   return false;
   }
   public String toString() {
	   return  name + ":" + weight;
   }
   
}