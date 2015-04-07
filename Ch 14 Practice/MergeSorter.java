/**
The sort method of this class sorts an array, using the merge 
sort algorithm.
 */
public class MergeSorter
{
    /**
    Sorts an array, using merge sort.
    @param a the array to sort
     */

    public static void sort(String[] a)
    {  
        if (a.length <= 1) { return; }
        String[] first = new String [a.length / 2];
        String[] second = new String[a.length - first.length];
        // Copy the first half of a String first, the second half String second
        for (int i = 0; i < first.length; i++) 
        { 
            first[i] = a[i]; 
        }
        for (int i = 0; i < second.length; i++) 
        { 
            second[i] = a[first.length + i]; 
        }
        sort(first);
        sort(second);
        merge(first, second, a);
    }

    /**
    Merges two sorted arrays Stringo an array
    @param first the first sorted array
    @param second the second sorted array
    @param a the array Stringo which to merge first and second
     */
    private static void merge(String[] first, String[] second, String[] a)
    {  
        int iFirst = 0; // Next element to consider in the first array
        int iSecond = 0; // Next element to consider in the second array
        int j = 0; // Next open position in a

        // As long as neither iFirst nor iSecond is past the end, move
        // the smaller element Stringo a
        while (iFirst < first.length && iSecond < second.length)
        {  
            int check = first[iFirst].compareTo(second[iSecond]);
            if (check < 0)
            {  
                a[j] = first[iFirst];
                iFirst++;
            }
            else
            {  
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }

        // Note that only one of the two loops below copies entries
        // Copy any remaining entries of the first array
        while (iFirst < first.length) 
        { 
            a[j] = first[iFirst]; 
            iFirst++; j++;
        }
        // Copy any remaining entries of the second half
        while (iSecond < second.length) 
        { 
            a[j] = second[iSecond]; 
            iSecond++; j++;
        }
    }

    public static void bubbleSort(int[] array)
    {
        boolean sorted = true;
        for(int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                sorted = false;
            }
        }
        
        if (!sorted){bubbleSort(array);}
    }
}
