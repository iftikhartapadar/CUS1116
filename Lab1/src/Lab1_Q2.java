/**
 * CUS-1116
 * Lab1 Q2
 * @author Iftikhar Tapadar
 * Date: 02/11/2020
 */
public class Lab1_Q2 {

	public static void main(String[] args) {
		
		//Sample array
		int[] array = {-4, 1, 2, 3, 6};
		
		System.out.println("Sample Array:");
		
		//Loop to print array
		for(int i = 0; i < array.length; i++ ) 
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("The sum of the sample array:");
		//Prints the sum by calling printSum method
		System.out.println(printSum(array));		
		
	}
	
	//Method to find sum of array elements 
	public static int printSum(int array[]) {
		
		//Variable that will store sum
		int sum = 0;
		
		//Loop that will cycle through each element
		for(int i = 0; i < array.length; i++)
		{
			//Each element will be added to sum
			sum = sum + array[i];
		}
		
		//Returns the sum of all array elements 
		return sum;
		
	}

}
