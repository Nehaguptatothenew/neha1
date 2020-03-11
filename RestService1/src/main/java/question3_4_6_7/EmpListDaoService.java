package question3_4_6_7;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class EmpListDaoService
{
    private static List<Emp> employees = new ArrayList<>();
    private static int employeecount=4;
    static {
        employees.add(new Emp("Neha",1));
        employees.add(new Emp("Ameesha",2));
        employees.add(new Emp("Ishika",3));
        employees.add(new Emp("Apurva",24));

    }
    public List<Emp> findAll()
    {
        return employees;
    }//Method for finding list of employees
    public Emp findOne(Integer id)
    {
        for(Emp employee:employees)
        {
            if(employee.getId()==id)
                return employee;
        }
        return null;
    }

    public Emp deleteById(Integer id)
    {
        Iterator<Emp> iterator=employees.iterator();
        while (iterator.hasNext())
        {
            Emp emp=iterator.next();
            if(emp.getId()==id)
            {
                iterator.remove();
                return emp;
            }

        }

        return null;
    }
}
