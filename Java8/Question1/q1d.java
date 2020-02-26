//Write the following a functional interface and implement it using lambda:
//(4) Convert a string to uppercase and return .                                Parameter (String) Return (String)

import java.util.*;
interface Case
{
    String calculate(String a);
}
public class q1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter String");
        String x = sc.nextLine();
        Case obj = (a) ->a.toUpperCase();
        System.out.println("String after converting to upper case " + obj.calculate(x));
    }

}
