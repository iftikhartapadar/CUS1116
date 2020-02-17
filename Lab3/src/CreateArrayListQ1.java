import java.util.ArrayList;
import java.util.List;

public class CreateArrayListQ1 {

    public static void main(String[] args) {
    // Creating an ArrayList of String
    List<String> animals = new ArrayList<>();// or ArrayList 
    
    animals = new ArrayList(); 
   
    // Adding new elements to the ArrayList
    animals.add("Lion");
    animals.add("Tiger");
    animals.add("Cat");
    animals.add("Dog");
    // To Do: add more animals such as: Wolf, Fox, Cow, Zibra 
    animals.add("Wolf");
    animals.add("Fox");
    animals.add("Cow");
    animals.add("Zebra");
   
    System.out.println(animals);// print your ArrayList

    // Adding an element at a particular index in an ArrayList
    animals.add(2, "Elephant");
    // to Do: Add Mouse at index 0, Add Dock at the end of ArrayList
    // your code here ...
    animals.add(0, "Mouse");
    animals.add("Dock");
    
    System.out.println(animals);

    }
}
