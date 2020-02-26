import java.util.Scanner;

//Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created.
interface  Operations
{
    int operation(int a,int b);
}
public class Q3 {
    int add(int a,int b)
    {
        return a+b;
    }
    int subtract(int a,int b)
    {
        return a-b;
    }
    int multiply(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        System.out.println("Enter second number");
        int y=sc.nextInt();
        Operations ob=new Q3()::add;
        System.out.println("Sum = "+ob.operation(x,y));
        Operations ob1=new Q3()::subtract;
        System.out.println("differnce = "+ob1.operation(x,y));
        Operations ob2=new Q3()::multiply;
        System.out.println("Multiplication = "+ob2.operation(x,y));


        }

    }

