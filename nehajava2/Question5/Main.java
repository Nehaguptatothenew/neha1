package java2.question5;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        question5 obj = new question5("Neha", "Gupta");
        question5 obj2 = new question5(obj);
        System.out.println(obj2.fName);
        System.out.println(obj2.lName);

        tryingClone tc = new tryingClone();
        tc.name = "Neha";
        tryingClone tc1 = (tryingClone) tc.clone();
        System.out.println(tc1.name.toString());

    }
}


