import java.util.ArrayList;
import java.util.*;
//Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
public class q1 {
    public static void main(String[] args)
    {
        List<Float> list = new ArrayList<Float>();
        list.add(1.05f);
        list.add(1.25f);
        list.add(2.75f);
        list.add(3.45f);
        list.add(4.83f);
        System.out.print("The sum of the numbers is ");

        System.out.println(sum(list));
    }

    public static Number sum(List<Float> list)
    {
        float sum=0;
       Iterator<Float> it=list.iterator();
       while(it.hasNext())
       {
           sum=sum+it.next();
       }
       return sum;
    }

}
