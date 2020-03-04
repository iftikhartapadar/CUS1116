//Note: The initial seating chart in this solution is generated as shown in the example. the solution also assumes that the user will enter a row and seat which start at 1 and where row 1 is the bottom front row.
/**
 * CUS-1116
 * @author Iftikhar Tapadar, Hong Zhao, Klay Dehaney
 * Project 1
 * 03/03/2020
 */
 
import java.util.Scanner;

public class SeatingChart
{
   /**
      Prints the price of seats in a grid like pattern.
      @param seats a 2D array of prices
   */
   public static void printSeats(int[][] seats)
   {
	   System.out.println("Available seats: ");
	   System.out.print("Col:  ");
	   
	   //Displays number of columns as grid style on top
	   for(int col = 1; col <= 10; col++) 
	   {
		   System.out.print(col + " ");
	   }
	   
	   System.out.println();
	   System.out.println("----------------------------------------------");
	   
	   // implement this method
	   //Prints the row
	   for(int i = 0; i < seats.length; i++) 
	   {
		   //Before each row, it will display 'Rowi' and a 'i' will indicate row number
		   System.out.print("Row" + (seats.length-i) + " ");
		   //Will print out elements in each row 
		   for(int j = 0; j < seats[i].length; j++) 
		   {
			   System.out.print(seats[i][j] + " ");
		   }
		   //Adds space after each row and column
		   System.out.println();
		   System.out.println();
	   }
	   System.out.println("----------------------------------------------");
   }
   
   /**
      Marks a seat with the price given to 0.
      @param seats the array of seat prices
      @param price the price to mark to zero
   */
   public static void sellSeatByPrice(int[][] seats, int price)
   {
       //Loops through each row 
	   for(int s = 0; s < seats.length; s++ )
	   {
		   //Loops through each colunm of each row
		   for(int p = 0; p < seats[s].length; p++)
		   {
			   //As soon as it matches the price
			   if (seats[s][p] == price)
			   {
				   //The specific seat will be set to 0, which will indicate as empty
				   seats[s][p] = 0;
				   //Formats the seat to lets user know which seat they aquired
				   System.out.printf("This seat [%d, %d] is available. It is your's.\n", s, p);
				   //Gives back result and exit loop
				   return;
			   }
		   }
	   }
	   //If price user entered if not found or available 
	   System.out.println("Sorry there are no seats found with that price.");
	}

   /**
      Marks a seat based on a given row and seat number from input.
      @param seats the array of seat prices
   */
   public static void sellSeatByNumber(int[][] seats)
   {
       //Prompts user
      System.out.println("Enter the row and seat number you want: ");
      Scanner input = new Scanner(System.in);

      //Store the row the user wants
      int row = input.nextInt();
       /**This is to produce the bottom row number of the array
        * since bottom is considered the front in this case
        */
      row = (9-row);
      //Store the column or exact seat within the row that user wants
      int column = input.nextInt();
      //To ensure the right column is displayed and avoid out of bounds error
      column = (column-1);

      //Checks if row is less than 0 and is less than or equal to length
      if (row > 0 && row <= seats.length)
      {
          //If seat is found, that will now equal 0
          seats[row][column] = 0;
          //Prints message to user
          System.out.printf("This seat [%d, %d] is available. It is your's.\n", row, column);
      }
      else
      {
          //Prints if it is invalid
         System.out.println("Sorry, invalid row.");
      }
   }

   //Main method
   public static void main(String[] args)
   {
      // initial values come from problem description
      int[][] seats = { 
    	 { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
         { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
         { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
         { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
         { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
         { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
         { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
         { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
         { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } }; 
 
      printSeats(seats);
 
      System.out.println("Pick by seat or price or  to quit: ");

      Scanner input = new Scanner(System.in);
      
      //user input on what they want 
      String choice = input.next();
      
      while (!choice.equals("quit"))
      {
         if (choice.equals("seat"))
         {
            sellSeatByNumber(seats);
         }
         else
         {
            // pick by price
            System.out.println("What price do you want to buy?");
            int price = input.nextInt();
            sellSeatByPrice(seats, price);
         }
         printSeats(seats);
         System.out.println("Pick by seat or price or  to quit: ");

         choice = input.next();
      }
   }
}