import java.util.Scanner;
import java.io.File;

/**
 * Counts words
 * 
 * @author Matt Wright and Joe Deahr
 * @version March 9, 2015
 */
public class WC
{
    /**
     * Default constructor for objects of class WC
     */
    public WC()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
        throws java.io.FileNotFoundException
    {
        Scanner userFile = new Scanner(System.in);
        System.out.print("Please enter the file name: ");
        String file = userFile.next();
        
        File inputFile = new File(file);
        Scanner in = new Scanner(inputFile);
        
        //Prints number of words
        int count = 0;
        while(in.hasNext()){
            String word = in.next();
            count++;
        }
        System.out.println("Expecting word count: 9");
        System.out.println("count: "+ count +"\n");
        in.close();
        
        //Prints number of characters
        in = new Scanner(inputFile);
        in.useDelimiter("");
        int characters = 0;
        while(in.hasNext()){
            String word = in.next();
            characters++;
        }
        System.out.println("Expecting character count: 49");
        System.out.println("Character count: "+ characters +"\n");
        in.close();
        
        //Prints number of lines
        in = new Scanner(inputFile);
        in.useDelimiter("\n");
        int lines = 0;
        while(in.hasNext()){
            String word = in.next();
            lines++;
        }
        System.out.println("Expecting line count: 2");
        System.out.println("Line count: "+ lines);
        in.close();
    }

}
