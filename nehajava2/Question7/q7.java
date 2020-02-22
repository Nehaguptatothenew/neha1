//7. WAP to convert seconds into days, hours, minutes and seconds.
import java.util.*;
public class q7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seconds");
        int sec=sc.nextInt();
        String s=answer(sec);
        System.out.println(s);
    }
    public static String answer(int sec)
    {
        int day=sec/(24*3600);
        sec=sec%(24*3600);
        int hour=sec/3600;
        sec=sec%3600;
        int min=sec/60;
        sec=sec%60;
        String s=day+" days "+hour+" hours "+min+" mins "+sec+" secs ";
        return s;
    }
}

