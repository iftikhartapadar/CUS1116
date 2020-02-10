/**
 * CUS-1116
 * HW1 Q3
 * @author Iftikhar Tapadar
 * Date: 02/09/2020
 */
public class HW1Q3 {

	public static void main(String[] args) {

		/** a. (Incorrect Version)
		int[] values = new int[10];

		for (int i = 1; i <= 10; i++)
		{
		values[i] = i * i;
		} 
		*/
		
		//Correct Solution for a
		int[] values = new int[10];
		
		for(int i = 1; i < 10; i++)
		{
			values[i] = i * i;
		}
		
		//Question
		System.out.println("Hw1 Q3, Part a:");
		//Identfies error in code
		System.out.println("Error is the '=' within the for-loop condtional(check) statement.");
		//What the error caused
		System.out.println("This caused an ArrayIndexOutOfBoundsException.");
		//Solution implemented
		System.out.println("My solution was to remove the '='.");
		
		System.out.println();
		
		//---------------------------------------------------------------------//
		
		/** b. (Incorrect Verison)
	    int[] values;

		for (int i = 0; i < values.length; i++)
		{
		values[i] = i * i;
		}
		*/
		
		//Correct solution for b
		values = new int[10];
		
		for (int i = 0; i < values.length; i++)
		{
			values[i] = i * i;
		}
		
		//Question
		System.out.println("Hw1 Q3, Part b:");
		//Identification of the error
		System.out.println("The error was the initialization of the array.");
		//Solution implemented
		System.out.println("To correct this, I initialized the 'values' array properly.");	
		
	}

}
