// Override the default method of the interface.
interface DefaultInterface
{
    default void display()
    {
        System.out.println("Default Interface");
    }
}
public class Q7 implements DefaultInterface{
    @Override
    public void display() {
        System.out.println("Overriding deafult interface ");
    }

    public static void main(String[] args) {
        Q7 obj = new Q7();
        obj.display();

    }
}
