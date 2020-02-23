//Write a program to create a thread using Thread class and Runnable interface each.
//By using a  thread class
class th2 implements Runnable
{
    public void run()
    {
        System.out.println("Neha");
    }
}
public class CreatingThread2
{
    public static void main(String[] args) {
        th2 obj=new th2();
        Thread ob = new Thread(obj);
        ob.start();
    }
}
