import java.util.Scanner;
import java.net.URL;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Reads all data from a web page and writes them to a file.
 * 
 * @author Matt Wright
 * @version March 11, 2015
 */
public class WebPage
{
    public static void main(String[] args) throws IOException
    {
        Scanner user = new Scanner(System.in);
        System.out.print("Please enter an address: ");
        String address = user.next();
        
        URL page = new URL(address);
        
        Scanner in = new Scanner(page.openStream());
        
        PrintWriter out = new PrintWriter("Output.txt");
        while(in.hasNextLine()){
            out.println(in.nextLine());
        }
              
        in.close();
        out.close();
        
        System.out.println("\n\nFile saved successfully.");
    }

}
