
import java.util.*;
//Write a method that takes a string and returns the number of unique characters in the string.
public class q2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String");
        String s=sc.nextLine();
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch]++;
        }

        for (int i = 0; i < s.length(); i++) {
            char chh = s.charAt(i);
            // character which has arrived only one time in the string will be printed out
            if (count[chh] == 1) {
                System.out.println("index => " + i + " and unique character => " + s.charAt(i));

            }
        }

    }
}
