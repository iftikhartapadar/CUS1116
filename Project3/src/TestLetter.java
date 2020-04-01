// To test your letter class.
// make sure to provide more example(letters)
/**
 * CUS-1116
 * @author Iftikhar Tapadar, Hong Zhao, Klay Dehaney
 * Project 2
 * 03/31/2020
 */
public class TestLetter
{
    public static void main(String[] args)
    {
        Letter dearJohn = new Letter("Mary", "John");
        dearJohn.addLine("I am sorry we must part.");
        dearJohn.addLine("I wish you all the best.");
        dearJohn.print();
    }

}
