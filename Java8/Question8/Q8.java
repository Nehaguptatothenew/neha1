
// Implement multiple inheritance with default method inside  interface.
interface P1
{
    default  void show()
    {
        System.out.println("Display1");
    }
}
interface P2
{
    default  void show()
    {
        System.out.println("Display2");
    }
}
public class Q8 implements P1,P2 {
    public void show()
    {
        P1.super.show();
        P2.super.show();
    }

    public static void main(String[] args) {
     Q8 obj = new Q8();
     obj.show();
    }
}

