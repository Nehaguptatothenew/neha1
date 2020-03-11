package question2_8;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDaoService {
    private static List <Employee> employees = new ArrayList<>();
    private static int employeecount=4;
    static {
        employees.add(new Employee("Neha",1,21,"Trainee"));
        employees.add(new Employee("Ameesha",2,21,"Trainee"));
        employees.add(new Employee("Ishika",3,21,"Trainee"));
        employees.add(new Employee("Apurva",4,21,"Trainee"));

    }

    public List<Employee> findAll()

    {
        return employees;
    }//It wiil return list of all the users
   public Employee save(Employee employee)//It will save new users
    {
    if(employee.getId()==null)
        employee.setId(++employeecount);

    employees.add(employee);
    return employee;
    }
    public static Employee findOne(Integer id)//This method will find a particular user based on their id.
    {
        for(Employee employee:employees)
        {
            if(employee.getId()==id)
                return employee;
        }
       return null;
    }

}
