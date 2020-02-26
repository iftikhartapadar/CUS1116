/**
 * CUS-1116
 * Lab2_Q3
 * @author Iftikhar Tapadar
 * Date: 02/25/2020
 */

import java.util.ArrayList;
public class Lab2_Q3 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
	    
	    /** a) Invoke add() to enter the following names in sequence: Alice, 
		Bob, Connie, David, Edward, Fran, Gomez, Harry. Print the ArrayList again.*/
	    names.add("Alice");
	    names.add("Bob");
	    names.add("Connie");
	    names.add("David");
	    names.add("Edward");
	    names.add("Fran");
	    names.add("Gomez");
	    names.add("Harry");
	    
	    System.out.println("The names are for question A: " + names);
	    System.out.println();
	    
	    //b) Use get() to retrieve and print the first and last names.
	    String firstName = names.get(0);
	    String lastName = names.get(7);
	    
	    System.out.println("The first name in the array for question B: " + firstName);
	    System.out.println("The last name in the array for question B: " + lastName);
	    System.out.println();
	    
	    //c) Print the size() of the ArrayList.
	    System.out.println("The size of the array list for queston C: "+ names.size());
	    System.out.println();
	    
	    //d) Use size() to help you print the last name in the list.
	    System.out.println("The last name in the array for question D: " + names.get(names.size()-1));
	    System.out.println();
	    
	    //e) Use set() to change “Alice” to “Alice B. Toklas”. Print the ArrayList to verify the change.
	    names.set(0, "Alice B. Toklas");
	    System.out.println("The names in array list for question E: " + names);
	    System.out.println();
	    
	    //f) Use the alternate form of add() to insert “Doug” after “David”. Print the ArrayList again.
	    names.add(4 , "Doug");
	    System.out.println("The names in array list for question F:  " + names);
	    System.out.println();
	    
	    //g) Use an enhanced for loop to print each name in the ArrayList.
	    System.out.println("The names in the array list using the enhanced for loop in question G: ");
	    
	    for(String x : names) 
	    {
	    	System.out.println(x);
	    }
	    
	    System.out.println();
	    
	    /*h) Create a second ArrayList called names2 that is built by calling the ArrayList constructor 
	    that accepts another ArrayList as an argument. Pass names to the constructor to build names2. Then print the ArrayList.*/
	    ArrayList<String> names2 = new ArrayList<String>(names);
	    
	    System.out.println("The names in 'names2' for question H: " + names2);
	    System.out.println();
	    
	    /*i) Call names.remove(0) to remove the first element. Print names and names2. Verify 
	    that Alice B. Toklas was removed from names, but not from names2.*/ 
	    names.remove(0);
	    System.out.println("The names in 'names' are (Question I): " + names);
	    System.out.println("The names in 'names2' are (Question I): " + names2);
	    
	}

}
