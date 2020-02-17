import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionQ2 {

    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        // Creating an ArrayList from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);


        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        // Adding an entire collection to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

       //To Do: Create an array of 3rd five prime numbers,: 31, 33, 37, 39, 41 name it first15PrimeNumbers
        List 
  
  
  
     
   
   
     first15PrimeNumbers = new ArrayList(firstTenPrimeNumbers); //your code here ... 
   
 System.out.println(firstTenPrimeNumbers);
    }
}