import java.util.*;
interface admininterface{

    void addnewlibrarian(String name,int id,String email);

}

interface librarianinterface{

    void librarianshowdetails();

    void addnewstudent(String name1,int id1,String email1);

    void addnewbook(String bookname,String author,String subject);

}

interface studentinterface{

    void registerbook(String bookname);

    void showbookdetails();

}

class Admin implements admininterface{

    String librarianname;

    int librarianid;

    String librarianemail;


    @Override

    public void addnewlibrarian(String name, int id, String email) {

        this.librarianname=name;

        this.librarianid=id;

        this.librarianemail=email;

    }

}

class Librarian implements librarianinterface {

    String bookname;

    String author;

    String subject;

    Map<Integer,String> studentdata = new HashMap<Integer, String>();

    Admin a = new Admin();

    List<String> registeredbooks = new ArrayList<String>();

    @Override

    public void librarianshowdetails() {

        System.out.println("Librarian name is:"+a.librariannamename);

        System.out.println("Librarian id is"+a.librarianidid);

        System.out.println("Librarian email is :"+a.librarianemailemail);

    }


    @Override

    public void addnewstudent(String name1, int id1, String email1) {

        studentdata.put(id1,name1);

    }


    @Override

    public void addnewbook(String bookname1, String author1, String subject1) {

        this.bookname=bookname1;

        this.author=author1;

        this.subject=subject1;

    }

}

class Student implements studentinterface{

    Librarian lb = new Librarian();

    @Override

    public void registerbook(String bookname){;

        lb.registeredbooks.add(bookname);

    }


    @Override

    public void showbookdetails(String bookname) {

        System.out.println("Author of book is "+lb.author);

        System.out.println("Book belongs to: "+lb.subject);

    }

}

class MainClass{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for student and 0 for librarian");

        int response = sc.nextInt();

        if(response == 1){

            System.out.println("Enter 1 for login and 0 for signup");

            int response1=sc.nextInt();

            if(response1 ==1){

                System.out.println("Enter id and name");

                int id =sc.nextInt();

                String name= sc.next();

                Librarian lb = new Librarian();

                if(lb.studentdata.containsKey(id) && lb.studentdata.containsValue(name)){

                    System.out.println("Login Sucessfull");

                }

                else{

                    System.out.println("Invalid input");

                }

            }

            else{

                System.out.println("Enter details to sign up");

                String name = sc.next();

                int id = sc.nextInt();

                String email =sc.next();

                Librarian lb = new Librarian();

                lb.addnewstudent(name,id,email);


            }

        }

        else if(response ==0){

            System.out.println("Enter 1 for login and 0 for signup");

            int response2 = sc.nextInt();

            if(response2 ==1){

                System.out.println("Enter id and name");

                int id =sc.nextInt();

                String name= sc.next();

                Admin ad = new Admin();

                if(ad.librarianname.equals(name) && ad.librarianid==id){

                    System.out.println("Login Sucessfull");

                }

                else{

                    System.out.println("Invalid input");

                }

            }

            else{

                System.out.println("Enter details to sign up");

                String name = sc.next();

                int id = sc.nextInt();

                String email =sc.next();

                Admin ad = new Admin();

                ad.addnewlibrarian(name,id,email);


            }


        }

        else{

            System.out.println("Invalid Input");

        }

    }

}
