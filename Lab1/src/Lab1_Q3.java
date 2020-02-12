/**
 * CUS-1116
 * Lab1 Q3
 * @author Iftikhar Tapadar
 * Date: 02/11/2020
 */
public class Lab1_Q3 {

	public static void main(String[] args) {
		
		double[] x = {1,2,3,4,5,6,7};
		
	    System.out.println("Before rotation:  ==============================");
	    
	    for (int i = 0; i < x.length; i++)
	    {
	    	System.out.println("x[" + i + "]:  " + x[i]);
	    }
	    
	    //Calls method to rotate x[]
	    x = rotate(x, 3);
	    
	    System.out.println("After rotation:  ==============================");   
	    
	    for (int i = 0; i < x.length; i++)
	    {
	    	System.out.println("x[" + i + "]:  " + x[i]);
	    }

	}
	
	//Method that will rotate array elements x by n
	static double[] rotate(double[] x, int n) {
		
		double [] newArray = new double[x.length];
		
		for(int i = 0; i < x.length; i++)
		{
			//Rotates array
			newArray[(i+n) % x.length ] = x[i];
		}
		return newArray;
	}
		
}
