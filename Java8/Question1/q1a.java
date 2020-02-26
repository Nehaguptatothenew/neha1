//Write the following a functional interface and implement it using lambda:
//(1) First number is greater than second number or not      Parameter (int ,int ) Return boolean


import java.util.*;
interface Greater
{
    boolean calculate(int a,int b);
}
public class q1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first Integer value");
        int x = sc.nextInt();
        System.out.println("Please enter second Integer value");
        int y = sc.nextInt();
        Greater obj = (a, b) -> a > b ? true : false;
        System.out.println("First number is greater than second nuber" + obj.calculate(x,y));
    }

}
