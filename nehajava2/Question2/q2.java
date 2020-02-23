//2. WAP to sorting string without using string Methods?.
import java.util.*;
public class q2 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String sorted=sortedString(s);
        System.out.println("The sorted string is :"+sorted);


    }
    public static String sortedString(String s)
    {
        char temp=0;
        char [] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch.length;j++)
            {
                if (ch[j] > ch[i])
                {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        String str=String.valueOf(ch);
        return str;
    }
}
