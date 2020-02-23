// Write a program to sort HashMap by value.
import java.util.*;
import java.lang.*;

public class q4
{
 public static void main(String[] args)
 {
     HashMap<String ,Integer> hm= new HashMap<String, Integer>();
     hm.put("Neha",1);
     hm.put("Ishika",10);
     hm.put("Shhreya",3);
     hm.put("Ameesha",7);
     hm.put("Ayushi",6);
     hm.put("Shria",8);
     hm.put("geeta",12);
     hm.put("Reena",6);
     Map<String,Integer> hm1=sorting(hm);
     for(Map.Entry<String,Integer> xy : hm1.entrySet())
     {
         System.out.println("Key = " + xy.getKey() + ", Value = " + xy.getValue());
     }

 }
 public static HashMap<String,Integer> sorting(HashMap<String,Integer> hm)
 {
     List<Map.Entry<String, Integer> > list =
             new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
     Collections.sort(list, new Comparator<Map.Entry<String, Integer> >()
     {
         public int compare(Map.Entry<String, Integer> o1,
                            Map.Entry<String, Integer> o2)
         {
             return (o1.getValue()).compareTo(o2.getValue());
         }
     });
     HashMap<String,Integer> temp=new LinkedHashMap<String, Integer>();
     for(Map.Entry<String,Integer> aa : list ) {
         temp.put(aa.getKey(), aa.getValue());

     }
     return temp;
 }



 }




