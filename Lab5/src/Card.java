/**
 * CUS-1116
 * Lab5 (Card Superclass)
 * @author Iftikhar Tapadar
 * Date: 04/17/2020
 */
public class Card
{
    //Private instance variable
    private String name;

    //Default Constructor
    public Card()
    {
        name = "";
    }

    //Constructor to initialize name
    public Card(String n)
    {
        name = n;
    }

    //Getter for instance variable
    public String getName()
    {
        return name;
    }

    public boolean isExpired()
    {
        return false;
    }

    public String format()
    {
        return "Card holder: " + name;
    }
}
