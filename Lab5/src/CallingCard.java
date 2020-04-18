/**
 * CUS-1116
 * Lab5 (CallingCard Subclass)
 * @author Iftikhar Tapadar
 * Date: 04/17/2020
 */
public class CallingCard extends Card
{
    //Private instance variables
    private String cardNumber;
    private String pin;

    //Constructor
    public CallingCard(String n, String cardNum, String pinNum)
    {
        super(n);
        this.cardNumber = cardNum;
        this.pin = pinNum;
    }

    //Getters for instance variable
    public String getCardNumber()
    {
        return this.cardNumber;
    }

    public String pin()
    {
        return this.pin;
    }

    //Method to format
    public String format()
    {
        return super.format() + " Card Number: " + cardNumber + " Pin: " + pin;
    }
}
