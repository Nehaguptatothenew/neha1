//Create a custom exception that do not have any stack trace.
// A Class that represents use-defined expception
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}

// A Class that uses above MyException
public class q13
{
    public static void main(String args[])
    {
        try
        {
            throw new MyException("GeeksGeeks");
        }
        catch (MyException ex)
        {
            System.out.println("Caught");


            System.out.println(ex.getMessage());
        }
    }
}