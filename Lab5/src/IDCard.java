/**
 * CUS-1116
 * Lab5 (IDCard Subclass)
 * @author Iftikhar Tapadar
 * Date: 04/17/2020
 */
public class IDCard extends Card
{
    //Private instance variable
    private String idNumber;

    //Constructor
    public IDCard(String n, String id)
    {
        super(n);
        this.idNumber = id;
    }

    //Getters for instance variable
    public String getIdNumber(){
        return this.idNumber;
    }

    //Method to format
    public String format()
    {
        return super.format() + " ID Card Number: " + idNumber;
    }
}
