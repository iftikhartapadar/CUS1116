import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListQ3 {
    public static void main(String[] args) {
    	
        List<String> topCompanies = new ArrayList<>();
        
        // Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        // Find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
        System.out.println(topCompanies);
        // To do: Add folloiwng companies to your ArrayList: Samsung, Sony, IBM, Twitter
        // Also print size of arraylist after adding above items
        topCompanies.add("Samsung");
        topCompanies.add("Sony");
        topCompanies.add("IBM");
        topCompanies.add("Twitter");
        
        //Finds new size of ArrayList
        System.out.println("Updated size of array list is " + topCompanies.size());

        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);
        // to Do: 3rd element, 7 elements , 10 elements
        String thirdElement = topCompanies.get(2);
        String seventhElement = topCompanies.get(6);
        //String tenthElement = topCompanies.get(9); ARRAY OUT OF BOUDS
        
        System.out.println("Third Element: " + thirdElement);
        System.out.println("Seventh Element: " + seventhElement);
        //System.out.println("Tenth Element: " + tenthElement); ARRAY OUT OF BOUNDS
 
        // Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
        
        //To Do replace Sony with Starbucks, note: use for loop or for-each-loop to find Sony then replace with Starnucks
        int i = 0;
        for(String x: topCompanies) 
        {
        	if(x == "Sony") 
        	{
        		topCompanies.set(i, "Starbucks");
        	}
        	i++;	
        }
   
        System.out.println("The new list of top companies are " + topCompanies); 
    }
}