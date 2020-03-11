package question2_8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeResource
{
    @Autowired
    private EmployeeDaoService service;
    //Methods used for getting the values using @GetMapping method
    @GetMapping("/employee")
    public List<Employee> retrieveAllEmployee()
    {
        return service.findAll();
    }

    @GetMapping(path="/employee/{id}")
    public Employee retrieveEmployee(@PathVariable int id)
        {
            return service.findOne(id);
        }


    @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Employee> updateUser(@PathVariable("id") int id, @RequestBody Employee employee) {
        System.out.println("Updating User " + id);

        Employee currentUser = EmployeeDaoService.findOne(id);

        if (currentUser==null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }

        currentUser.setName(employee.getName());
        currentUser.setAge(employee.getAge());
       // currentUser.setId(employee.getId());
        currentUser.setService(employee.getService());


        service.save(currentUser);
        return new ResponseEntity<Employee>(currentUser, HttpStatus.OK);
         }

}
