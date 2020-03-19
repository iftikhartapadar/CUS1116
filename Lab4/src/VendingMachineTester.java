/**
 * CUS-1116
 * Lab4 (VendingMachineTester)
 * @author Iftikhar Tapadar
 * Date: 03/17/2020
 */
public class VendingMachineTester {

    public static void main(String[] args){

        //Throughout the program the answers to all questions are in different places

        //2.1 What methods would you supply for a VendingMachine class? Describe them informally.
        System.out.println("Answer for Lab_4 question 2.1:");
        System.out.println("You would need a method to keep track and update the number of tokens in the Vending Machine.");
        System.out.println("Method to fill vending machine with cans.");
        System.out.println("Method to return amount of cans.");
        System.out.println("Method to return amount of tokens.");
        System.out.println("----------------------------------------------------------------------------------------------");

        //THIS CODE BELOW WAS PROVIDED BY LAB TO USE
        VendingMachine machine = new VendingMachine();
        machine.fillUp(10); // Fill up with ten cans
        machine.insertToken();
        machine.insertToken();
        System.out.print("Token count: ");
        System.out.println(machine.getTokenCount());
        System.out.println("Expected: . . .");
        System.out.print("Can count: ");
        System.out.println(machine.getCanCount());
        System.out.println("Expected: . . .");

    }

}
