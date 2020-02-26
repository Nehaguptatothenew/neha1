//Create a functional interface whose method takes 2 integers and return one integer.
import java.util.*;
interface OneInteger
{
    int calculate(int a,int b);
}
//Here performing addition so as to convert two integers into a single integer
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first Integer value");
        int x = sc.nextInt();
        System.out.println("Please enter second Integer value");
        int y = sc.nextInt();
        OneInteger obj = (a, b) -> a *b;
        System.out.println("Returning a single integer after performing multiply operation " + obj.calculate(x,y));
    }

}
