/**
 * CUS-1116
 * Lab1 Q1
 * @author Iftikhar Tapadar
 * Date: 02/11/2020
 */
public class Lab1_Q1 {

	public static void main(String[] args) {
		
		//a)Create an array x of doubles with an initializer list that contains the following values: 8, 4, 5, 21, 7, 9, 18, 2, and 100.
		double x[] = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		
		//b) Print the number of items in the array by printing the expression x.length.
		System.out.println("Output for lab1 q1 b:");
		System.out.println("The number of items in the array is " + x.length);
		System.out.println();
		
		//c) Print the first array item, x[0].
		System.out.println("Output for lab1 q1 c:");
		System.out.println("The first array item is  " + x[0]);
		System.out.println();
		
		//d) Print the last array item. Be careful to choose the right index.
		System.out.println("Output for lab1 q1 d:");
		System.out.println("The last array item is " + x[8]);
		System.out.println();
		
		//e) Print the expression x[x.length – 1]. Why is this value the same as in part d?
		System.out.println("Output for lab1 q1 e:");
		System.out.println("x[x.length - 1] = " + x[x.length - 1]);
		System.out.println("The answer is the same as part d, because they end up having the same index --> x[8]");
		System.out.println();
		
		//f) Use a standard for loop to print all the values in the array without labels. 
		System.out.println("Output for lab1 q1 f:");
		
		for(int i = 0; i < 9; i++)
		{
			System.out.print(x[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//g) Use a standard ( loop to print all the values in the array with labels to indicate what each element is.
		System.out.println("Output for lab1 q1 g:");
		
		for(int i = 0; i < 9; i++) 
		{
			System.out.println("x[" + i + "]:  " + x[i]);
		}
		
		System.out.println();
		
		//h) Use a standard for loop to print all the values in the array in reverse order with labels to indicate what each element is.
		System.out.println("Output for lab1 q1 h:");
		
		for(int i = x.length - 1; i >= 0; i--) 
		{
			System.out.println("x[" + i + "]:  " + x[i]);
		}
		
		System.out.println();
		
		//i) Use an enhanced for loop to print all the values in the array without labels.
		System.out.println("Output for lab1 q1 i:");
		
		for(double i : x) 
		{
			System.out.print(i + " ");
		}

	}

}
