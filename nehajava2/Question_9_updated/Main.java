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
        System.out.println("Enter the choice for chair");
        String choice = sc.next();
        System.out.println("Enter the choice for table");
        String choice1=sc.next();

            chair ch = new chair(choices.valueOf(choice), true, true);
            table tb = new table(choices.valueOf(choice1), true, true);
            System.out.println("Chair");
            System.out.println(ch.checkStress());
            System.out.println(ch.checkfire());
            System.out.println("*********************************");
            System.out.println("Table");
            System.out.println(tb.type);
            System.out.println(tb.checkfire());
            System.out.println(tb.checkStress());


    }
}
