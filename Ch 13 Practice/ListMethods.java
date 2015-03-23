import java.util.*;

public class ListMethods
{
    public static ArrayList makeList(int n)
    {
        ArrayList<Integer> tempList = null;
        if (n <= 0)  // The smallest list we can make
        {
            tempList = new ArrayList<Integer>();
            tempList.add(0);
        }
        else        // All other size lists are created here
        {
            tempList = new ArrayList<Integer>();
            tempList.add(n);
            ArrayList<Integer> otherList = makeList(n-1);
            tempList.add(otherList.get(0));
            //System.out.println(otherList.get(n-n-2));
        }
        return tempList;
    }

    public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (Integer i : tList)
        {
            list.add(new Integer(i));
        }
        return list;
    }

    public static ArrayList reverseList(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = ListMethods.deepClone(tList); 
        if (list.size() == 0)
        {
            
        }
        else
        {
            // Use the solution to a smaller version of the problem
            // to solve the general problem
        }
        return list;
    }
}