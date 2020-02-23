//Using join method

public class UsingJoin {
    public static void main(String[] args) throws InterruptedException {
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    pc.print1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.print2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    public static class PC {
        public void print1() throws InterruptedException {
            synchronized (this) {
                System.out.println("hey");
            }
        }

        public void print2() throws InterruptedException {
            synchronized (this) {
                System.out.println("Hii");
            }
        }
    }
}




