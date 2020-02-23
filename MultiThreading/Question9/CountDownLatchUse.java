
//Write a program to demonstrate the use of CountDownLatch
import java.util.concurrent.CountDownLatch;

public class CountDownLatchUse {
    public static void main(String args[]) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);

        Thread app1 = new Thread(new Application("App1",  countDownLatch));
        Thread app2 = new Thread(new Application("App2",  countDownLatch));
        Thread app3 = new Thread(new Application("App3",  countDownLatch));
        Thread app4 = new Thread(new Application("App4",  countDownLatch));
        app1.start();
        app2.start();
        app3.start();
        app4.start();




        try{
            System.out.println("Statement before await");
            countDownLatch.await();
            Thread.sleep(2000);
            System.out.println("All applications are up and running.");
        } catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
         app1.join();
        app2.join();
        app3.join();
        app4.join();
    }
}

class Application implements Runnable {
    private String name;
    private CountDownLatch countDownLatch;

    public Application(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        try {
            System.out.println(name + " started. ");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println( name + " is Up and running.");
        //reduce the count by 1
        countDownLatch.countDown();
    }
}