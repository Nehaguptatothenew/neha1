import java.util.*;
enum choices
{
    PLASTIC,STEEL,WOOD;
    public static boolean contains(String s)
    {
        for(choices choice:values())
            if (choice.name().equals(s))
                return true;
        return false;
    }
};
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        boolean result = choices.contains(choice);
        if (result == true) {

            chair ch = new chair("wooden", true, true);
            table tb = new table("metal", true, true);
            System.out.println("Chair");
            System.out.println(ch.checkStress());
            System.out.println(ch.checkfire());
            System.out.println("*********************************");
            System.out.println("Table");
            System.out.println(tb.type);
            System.out.println(tb.checkfire());
            System.out.println(tb.checkStress());
        } else {
            System.out.println("wrong Choice");
        }
    }
}
