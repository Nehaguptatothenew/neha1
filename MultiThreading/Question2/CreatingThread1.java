//Write a program to create a thread using Thread class and Runnable interface each.
//By using a  thread class
class th extends Thread
{
    public void run()
    {
        System.out.println("Neha");
    }
}
public class CreatingThread1
{
    public static void main(String[] args) {
        th ob = new th();
        ob.start();
    }
}
