//Role of "volatile" keyword.
//Runnning the program without using Volatile keyword will result in an infinite loop
import java.util.*;
class App1 extends Thread{
    private boolean running=true;

    @Override
    public void run() {
        while (running)
        {
            System.out.println("hello");
        }
    }
    public void ShutDown(){
        running=false;
    }
}
public class q2WithoutVolatile {
    public static void main(String[] args)
    {
        App1 obj= new App1();
        obj.start();
        System.out.println("Press a key to terminate");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        obj.ShutDown();
    }
}
