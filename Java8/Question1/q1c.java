//Write the following a functional interface and implement it using lambda:
// (3) Concatination of 2 string                                                  Parameter (String , String ) Return (String)
import java.util.*;
interface Concat
{
    String calculate(String a,String b);
}
public class q1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first String");
        String x = sc.nextLine();
        System.out.println("Please enter second String");
        String y = sc.nextLine();
        Concat obj = (a, b) -> a + b ;
        System.out.println("Strings after concatenating " + obj.calculate(x,y));
    }

}
