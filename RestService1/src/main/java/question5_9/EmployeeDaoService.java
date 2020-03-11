package question5_9;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDaoService {
    private static List <EmployeeDetails> employees = new ArrayList<>();
    private static int employeecount=0       ;

   public List<EmployeeDetails> findAll()

    {
        return employees;
    }
   public EmployeeDetails save(EmployeeDetails employee)
    {
    if(employee.getId()==null)
        employee.setId(++employeecount);

    employees.add(employee);
    return employee;
    }




}
