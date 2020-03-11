package question2_8;

public class Employee {
    private String name;//Employee Details
    private Integer id;
    private int age;
    private String service;

    protected Employee()//default constructor is made because it
                        // will be overridden by parametarized constructor
    {
    }
    public Employee(String name, Integer id, int age, String service) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", service='" + service + '\'' +
                '}';
    }

}
