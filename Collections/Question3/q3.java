import java.util.Scanner;

//Write a method that takes a string and print the number of occurrence of each character characters in the string.
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String");
        String s = sc.nextLine();
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            count[ch]++;
        }

        /*for (int i = 0; i < s.length(); i++) {
            char chh = s.charAt(i);
            // character which has arrived only one time in the string will be printed out
            if (count[chh] >0) {
                System.out.println( "character => " +chh+"occurance => " + count[chh]);

            }*/
        for (int i = 0; i < 256; i++)
        {
        if(count[i]>0)
        {
            int REDIX=10;
            char c=Character.forDigit(count[i],REDIX);
            //char chh=(char)count[i];
           //  System.out.println(chh);
            System.out.println( "character => " +c+"occurance => " + count[i]);
        }
        }
    }

    }

