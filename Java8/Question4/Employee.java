//Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and get the instance of the Class using constructor reference
interface EmployeeData
{
    Employee data(String name,int age,String city);
}
public class Employee {
    String name;
    int age;
    String city;

    public Employee( String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;

    }
    public String toString()
    {
        return "name "+name+" age "+age+" city "+city;
    }
        public static void main(String[] args)
        {
            EmployeeData ob = Employee::new;
                Employee emp=ob.data("Neha",21,"Baraut");
            System.out.println(emp.toString());
        }

}
