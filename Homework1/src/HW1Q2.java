/**
 * CUS-1116
 * HW1 Q2
 * @author Iftikhar Tapadar
 * Date: 02/09/2020
 */
public class HW1Q2 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
		
		//a. int total = 0;
		int total = 0;

		for (int i = 0; i < 10; i++) 
		{ 
			total = total + a[i];
		}
		
		System.out.println("Total for Hw1 Q2, Part a:");
		System.out.println(total);
		System.out.println();
		
		//----------------------------------------------------------------//
		
		//b. int total = 0;
		total = 0;
		
		for (int i = 0; i < 10; i = i + 2) 
		{ 
			total = total + a[i]; 
		}
		System.out.println("Total for Hw1 Q2, Part b:");
		System.out.println(total);
		System.out.println();
		
		//----------------------------------------------------------------//
		
		//c. int total = 0;
		total = 0;
		
		for (int i = 1; i < 10; i = i + 2) 
		{ 
			total = total + a[i]; 
		}
		
		System.out.println("Total for Hw1 Q2, Part c:");
		System.out.println(total);
		System.out.println();
		
		//----------------------------------------------------------------//
		
		/** d. int total = 0;
		total = 0;
		for (int i = 2; i <= 10; i++) 
		{ 
			total = total + a[i]; 
		}
		*/
		System.out.println("Total for Hw1 Q2, Part d:");
		System.out.println("Produces an ArrayIndexOutOfBoundsException");
		System.out.println();
		
		//----------------------------------------------------------------//
		
		//e. int total = 0;
		total = 0;
		
		for (int i = 1; i < 10; i = 2 * i) 
		{ 
			total = total + a[i]; 
		}
		
		System.out.println("Total for Hw1 Q2, part e:");
		System.out.println(total);
		System.out.println();
		
		//----------------------------------------------------------------//
		
		//f. int total = 0;
		total = 0;
		
		for (int i = 9; i >= 0; i--) 
		{ 
			total = total + a[i];
		}
		
		System.out.println("Total for Hw1 Q2, part f:");
		System.out.println(total);
		System.out.println();
		
		//----------------------------------------------------------------//
		
		//g. int total = 0;
		total = 0;
		
		for (int i = 9; i >= 0; i = i - 2) 
		{ 
			total = total + a[i]; 
		}
		
		System.out.println("Total for Hw1 Q2, part g:");
		System.out.println(total);
		System.out.println();
		
		//----------------------------------------------------------------//
		
		//h. int total = 0;
		total = 0;
		
		for (int i = 0; i < 10; i++) 
		{ 
			total = a[i] - total; 
		}
		
		System.out.println("Total for Hw1 Q2, part h:");
		System.out.println(total);
		System.out.println();
		
	}

}
