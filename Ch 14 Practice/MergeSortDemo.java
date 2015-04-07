import java.util.Arrays;

/**
   This program demonstrates the merge sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class MergeSortDemo
{  
   public static void main(String[] args)
   {  
      String[] a = {"Hello", "rohit", "Bye", "matt"};
      System.out.println(Arrays.toString(a));
      MergeSorter.sort(a);
      System.out.println(Arrays.toString(a));
      
      System.out.println("\n\n");
      
      String[] b = {"Hello", "Rohit", "Bye", "matt"};
      System.out.println(Arrays.toString(b));
      MergeSorter.sort(b);
      System.out.println(Arrays.toString(b));
      
      System.out.println("\n\n");
      
      int[] c = ArrayUtil.randomIntArray(20,100);
      System.out.println(Arrays.toString(c));      
      MergeSorter.bubbleSort(c);      
      System.out.println(Arrays.toString(c));
   }
}

