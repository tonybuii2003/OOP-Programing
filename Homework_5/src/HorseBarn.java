public class HorseBarn {
   /** The spaces in the barn. Each array element holds a reference to the horse

   * that is currently occupying the space. A null value indicates an empty space.

   */

   private Horse[] spaces;
   public HorseBarn(int size) {
	   spaces = new Horse[size];
   }
   public Horse[] getSpaces() {
	   return spaces;
   }
   public HorseBarn(Horse[] h) {
	   this.spaces = h;
   }
   /** 
    * Search for a place in Horsebarn(null) to add a new Horse h
    * @param h new Horse need to be added
    */
   public void add(Horse h) {
	  for (int i = 0; i<spaces.length; i++) {
		  if (spaces[i]==null) {
			  spaces[i] = h;
			  break;
		  }
	  }
   }
   public void remove(Horse h) {
	   for (int i = 0; i<spaces.length;i++) {
		   if (spaces[i] != null && spaces[i].equals(h)) {
			   spaces[i] = null;
			   break;
		   }
	   }
   }
   /** Returns the index of the space that contains the horse with the specified

    *  name.

    * Precondition: No two horses in the barn have the same name.

    * @param name the name of the horse to find

    * @return the index of the space containing the horse with the specified

    *      name;

    *      -1 if no horse with the specified name is in the barn.

    */

   public int findHorseSpace(String name) {
	   for (int i = 0; i<spaces.length; i++) {
		   if (spaces[i].getName().equals(name) && spaces[i] != null) {
			   return i;
		   }
		   
	   }
	   return -1;
   }

    /** Consolidates the barn by moving horses so that the horses are in

    *  adjacent spaces, starting at index 0, with no empty space between

    *  any two horses.

    * Postcondition: The order of the horses is the same as before the

    *  consolidation.

    */
   public void consolidate(){
	   int count = 0;
	   for (int i = 0; i<spaces.length; i++) {
		   if (spaces[i]!= null) {
			   spaces[count++] = spaces[i];
		   }
		   
	   }
	   for (int i = count; i<spaces.length; i++)
		   spaces[i] = null;
   }
   public String toString() {
	   String result = "Horses: ";
	   for (int i = 0; i < spaces.length; i++)
		   result+=spaces[i] + " ";
	   return result;
   }

}
