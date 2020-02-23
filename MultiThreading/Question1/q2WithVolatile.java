//Role of "volatile" keyword.
//Runnning the program  using Volatile keyword will reflect the changes made in main method in the shutdown methid and it wiil not lead to an infinite loop
import java.util.*;
class App extends Thread{
    private volatile boolean running=true;

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
public class q2WithVolatile {
    public static void main(String[] args)
    {
        App obj= new App();
        obj.start();
        System.out.println("Press a key to terminate");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        obj.ShutDown();
    }
}
