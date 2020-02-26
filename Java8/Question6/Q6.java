//Create and access default and static method of an interface.

interface DefaultInterface
{
    default void display(String s)
    {
        System.out.println("default method "+s);
    }

}
interface StaticInterface{
    static void display(String s)
    {
        System.out.println("static method "+s);
    }
}
public class Q6 implements DefaultInterface,StaticInterface {
    public static void main(String[] args)
    {
        Q6 obj = new Q6();
        obj.display();
        StaticInterface.display("static");
    }
}
