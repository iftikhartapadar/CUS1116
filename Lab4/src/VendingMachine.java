/**
 * CUS-1116
 * Lab4 (VendingMachine)
 * @author Iftikhar Tapadar
 * Date: 03/17/2020
 */
public class VendingMachine {

    //Throughout the program the answers to all questions are in different places

    //2.3 What instance variables do the methods need to do their work? Hint: You need to track the number of cans and tokens. Declare them with their type and access modifier.
    public int tokenCount;
    public int canCount;

    //2.9 a) A constructor with no arguments that initializes the vending machine with 10 soda cans
    public VendingMachine(){
        this.canCount = 10;
        this.tokenCount = 0;
    }

    //2.9 b) A constructor, VendingMachine(int cans), that initializes the vending machine with the given number of cans
    public VendingMachine(int cans){
        this.canCount = cans;
        this.tokenCount = 0;
    }

    //2.2 Now translate those informal descriptions into Java method headers, such a public void fillUp(int cans) Give the names, parameter variables, and return types of the methods. Do not implement them yet.
    //Method that fills up cans in vending machine
    public void fillUp(int cans){
        // 2.5) Now implement a method fillUp(int cans) to add more cans to the machine. Simply add the number of new cans to the can count.
        this.canCount += cans;
    }

    //Updates amount of tokens and number of cans in vending machine
    public void insertToken(){
        // 2.4) Consider what happens when a user inserts a token into the vending machine. The number of tokens is increased, and the number of cans is decreased. Implement a method:
        if(this.canCount <= 0)
        {
            System.out.println("There are no more cans.");
        }
        else
        {
            //Decreases can count by 1
            this.canCount--;
            //Increases can token count by 1
            this.tokenCount++;
        }
    }

    //Returns token count
    public int getTokenCount(){
        //2.6) Next, implement two methods, getCanCount and getTokenCount, that return the current values of the can and token counts.
        //Returns token count
        return this.tokenCount;
    }

    //Returns can count
    public int getCanCount(){
        //2.6) Next, implement two methods, getCanCount and getTokenCount, that return the current values of the can and token counts.
        //Return can count
        return this.canCount;
    }

}
