/**
 * CUS-1116
 * @author Iftikhar Tapadar, Hong Zhao, Klay Dehaney
 * Project 2
 * 03/31/2020
 */

/**
 A class that makes a letter.
 */
public class Letter
{
    private String from;
    private String to;
    //Initialized messageText to equal empty string to avoid null message
    private String messageText = " ";

    /**
     Takes the sender and recipient and initializes the letter.
     @param to the recipient
     @param from the sender

     */
    public Letter(String from, String to)
    {
        //to do, write your code here
        //Initializes instance variables using constructor
        this.from = from;
        this.to = to;
    }


    /**
     Appends a line of text to the message body.
     @param line the line to append
     */
    public void addLine(String line)
    {
        //to do, write your code here. Note: you write one message per line.
        //The body of letter will append the new line to the "messageText" variable
        this.messageText = this.messageText + "\n" + line;
    }

    /**
     Makes the message into one long string.
     */
    public String getText()
    {
        //to do: write your code here. See example in project description to see what to return
        //Created local variable text that will store entire letter in single string variable
        String text = "Dear " + this.to + ":\n" +
                this.messageText + "\n" +
                "Sincerely, \n" + this.from;

        //Returns the letter using the single string variable
        return text;
    }

    /**
     Prints the message text.
     */
    public void print()
    {
        //to do: write your code here print your letter
        System.out.println("Dear " + this.to + ":");
        System.out.println(this.messageText + "\n");
        System.out.print("Sincerely, \n" + this.from);
    }
}



