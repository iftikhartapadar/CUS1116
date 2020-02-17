import java.util.*;
public class Lab2_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
	    System.out.println(names);
	    
	    
	    //a) Invoke add() to enter the following names in sequence: Alice, Bob, Connie, David, Edward, Fran, Gomez, Harry. Print the ArrayList again.
	    names.add("Alice");
	    names.add("Bob");
	    names.add("Connie");
	    names.add("David");
	    names.add("Edward");
	    names.add("Fran");
	    names.add("Gomez");
	    names.add("Harry");
	    
	    System.out.println("The names are:" + names);
	    
	    System.out.println();
	    
	    //b) Use get() to retrieve and print the first and last names.
	    String firstName = names.get(0);
	    String lastName = names.get(7);
	    
	    System.out.println("The first name in the array is " + firstName);
	    System.out.println("The last name in the array is " + lastName);
	    
	    System.out.println();
	    
	    //c) Print the size() of the ArrayList.
	    System.out.println(names.size());
	    
	    System.out.println();
	    
	    //d) Use size() to help you print the last name in the list.
	    System.out.println("The last name in the array is " + (names.size()-1));
	    System.out.println();
	    
	    //e) Use set() to change “Alice” to “Alice B. Toklas”. Print the ArrayList to verify the change.
	    names.set(0, "Alice B. Toklas");
	    System.out.println("The names are " + names);
	    System.out.println();
	    
	    //f) Use the alternate form of add() to insert “Doug” after “David”. Print the ArrayList again.
	    names.add(4 , "Doug");
	    System.out.println("The names are " + names);
	    System.out.println();
	    
	    //g) Use an enhanced for loop to print each name in the ArrayList.
	    System.out.println("The names in the array list using the enhanced for loop are:");
	    for(String x : names) {
	    	System.out.print(x + ", ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    //h) Create a second ArrayList called names2 that is built by calling the ArrayList constructor that accepts another ArrayList as an argument. Pass names to the constructor to build names2. Then print the ArrayList.
	    ArrayList<String> names2 = new ArrayList<String>(names);
	    
	    System.out.println("The names in 'names2' are: " + names2);
	    System.out.println();
	    
	    //i) Call names.remove(0) to remove the first element. Print names and names2. Verify that Alice B. Toklas was removed from names, but not from names2. 
	    names.remove(0);
	    System.out.println("The names in 'names' are: " + names);
	    System.out.println("The names in 'names2' are: " + names2);
	    
	}

}
