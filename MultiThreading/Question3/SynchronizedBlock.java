//Write a program using synchronization block and synchronization method
//Using synchronized Block
class Table2 {
    void printTable(int n) {
        synchronized (this) {//instead of using synchroized method using synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        }
    }
}
class MyThread3 extends Thread
{
    Table t;
    MyThread3(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread4 extends Thread
{
    Table t;
    MyThread4(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

class SynchronizedBlock{
    public static void main(String args[]){
        Table obj = new Table();//only one object
        MyThread3 t1=new MyThread3(obj);
        MyThread4 t2=new MyThread4(obj);
        t1.start();
        t2.start();
    }
}