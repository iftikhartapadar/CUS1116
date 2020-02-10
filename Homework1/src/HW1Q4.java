/**
 * CUS-1116
 * HW1 Q4
 * @author Iftikhar Tapadar
 * Date: 02/09/2020
 */
public class HW1Q4 {

	public static void main(String[] args) {

		//a. Printing all elements of an array in a single row, separated by spaces.
		int array[] = {-5, 1, 2, 3, 4};
		
		System.out.println("All elements in array printed for Hw1 Q4, Part a:");
		
		//Prints all elements of array using enhanced loop
		for(int x : array) 
		{
			System.out.print(x + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//------------------------------------------------------------------------------//
		
		//b. Computing the product of all elements in an array.
		//Variable to store the product of all elements 
		int product = 1;
		
		for(int x : array)
		{
			product *= x;
		}
		
		System.out.println("Product of array elements for Hw1 Q4, Part b:");
		//Prints product of all elements
		System.out.println(product);
		
		System.out.println();
		
		//------------------------------------------------------------------------------//
		
		//c. Counting how many elements in an array are negative.
		//Variable to store amount of negative elements
		int negElement = 0;
		
		for(int x : array)
		{
			if(x < 0)
			{
				negElement++;
			}
		}
		
		System.out.println("The amount of negative elements in array for Hw1 Q4, Part c:");
		//Prints amount of negative elements
		System.out.println(negElement);
		
		System.out.println();
		
		//------------------------------------------------------------------------------//
		

		//d. find the maximum element in array
		//Variable that will store the maximum value among array elements
		int maxElement = 0;
		
		for(int x : array) 
		{
			if(x > maxElement) 
			{
				maxElement = x;
			}
		}
		
		System.out.println("The maximum element in array for Hw1 Q4, Part d:");
		//Prints maximum number of all elements
		System.out.println(maxElement);	
		
	}

}
