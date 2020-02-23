//. WAP showing try, multi-catch and finally blocks.
public class q6 {
    public static void main(String args[]){
        try{
            int a[]=new int[7];
            a[4]=30/0;
            System.out.println("First print statement in try block");
        }
        catch(ArithmeticException e){
            System.out.println("Warning: ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("Warning: Some Other exception");
        }
        finally
        {
            System.out.println("finally block executed");
        }
        System.out.println("Out of try-catch-finally block...");
    }
}
