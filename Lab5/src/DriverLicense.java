/**
 * CUS-1116
 * Lab5 (DriverLicense Subclass)
 * @author Iftikhar Tapadar
 * Date: 04/17/2020
 */
public class DriverLicense extends Card
{
    //Private instance variables
    private String expirationYear;

    //Constructor
    public DriverLicense(String n, String expYear)
    {
        super(n);
        this.expirationYear = expYear;
    }

    //Getters for instance variable
    public String getExpirationYear(){
        return this.expirationYear;
    }

    //Method to format
    public String format()
    {
         return super.format() + " Expiration Year: " + expirationYear;
    }
}
