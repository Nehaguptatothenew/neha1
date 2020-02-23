import static java.lang.Thread.*;

//Using sleep method
class app extends Thread{

    @Override
    public void run()
    {
    for(int i=0;i<5;i++)
    {


        try {
            //here sleep method is used to pause the exceution for 1 sec
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
    }
}
public class q1 {
    public static void main(String[] args) {
        app t1 = new app();
        app t2 = new app();
        t1.start();
        t2.start();
    }
}
