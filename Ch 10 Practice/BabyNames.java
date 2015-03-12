import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNames
{
    public static final double LIMIT = 50;

    public static void main(String[] args) throws FileNotFoundException
    {  
        Scanner user = new Scanner(System.in);
        System.out.print("Please enter a file name: ");
        Scanner in = new Scanner(new File(user.next()));

        RecordReader boys = new RecordReader(LIMIT);
        RecordReader girls = new RecordReader(LIMIT);

        while (boys.hasMore() || girls.hasMore())
        {
            int rank = in.nextInt();
            System.out.print(rank + " ");
            boys.process(in);
            girls.process(in);
            System.out.println();
        }

        in.close();
    }
}   
