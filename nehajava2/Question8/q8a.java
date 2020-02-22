//WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
//a)while statement
//b)do-while statement
import java.util.*;
public class q8a {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the words");
        String s=sc.next();
        while(!s.equals("done"))
        {
            if(s.charAt(0)==s.charAt(s.length()-1))
                System.out.println("Yes, the first and the last characters of "+s+" are same.");
            else
                System.out.println("No, the first and the last characters of "+s+" are not same.");

            s=sc.next();
        }
    }

}
