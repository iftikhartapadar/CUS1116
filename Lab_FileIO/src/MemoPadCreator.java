/**
 * CUS-1116
 * Lab_FileIO
 * @author Iftikhar Tapadar
 * Date: 04/24/2020
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class MemoPadCreator
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //Date object
        Date now = new Date();
        Scanner console = new Scanner(System.in);
        //Will be used to store file name
        System.out.print("Output file: ");
        String filename = console.nextLine();

        //Printwriter object named out
        PrintWriter out = new PrintWriter(new File(filename));

        boolean done = false;
        while (!done)
        {
            //Will be used to store topic of file(memo)
            System.out.println("Memo topic (enter -1 to end):");
            String topic = console.nextLine();
            if (topic.equals("-1"))
            {
                //When equal true, it will quit
                done = true;
            }
            else
            {
                //If not program continues on the following will take place
                //Stores text of the file
                System.out.println("Memo text:");
                String message = console.nextLine();
                //Create the new date object and obtain a dateStamp
                Date dateStamp = new Date();
                //Will print out the topic, dateStamp, and message of the file
                System.out.println(topic + "\n" + dateStamp + "\n" + message);
            }
        }
        // Close the output file
        out.close();
    }
}