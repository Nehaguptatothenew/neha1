//Write a method that takes a string and returns the number of unique characters in the string.
import java .util.*;
public class Collection2Updated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("Enter String");
            String s1=sc.nextLine();
            try {
                HashSet<Character> h = new HashSet<Character>();
                for (int i = 0; i < s1.length(); i++) {
                    h.add(s1.charAt(i));
                }
                Iterator<Character> itr = h.iterator();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }}
