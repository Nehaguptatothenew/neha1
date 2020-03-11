//Implement GET http request using path variable top get one employee
package question3_4_6_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpListResource
{
    @Autowired
    private EmpListDaoService service;


    @GetMapping("/getEmployees")
    public List<Emp> retrieveAllUsers()
    {
        return service.findAll();
    }
    @GetMapping(path="/getOneEmployee/{id}")
    public Emp retrieveEmployee(@PathVariable int id) throws ResourceNotFoundException {
        Emp emp=service.findOne(id);
        if(emp==null)
            throw new ResourceNotFoundException("id-"+id);//It will show error message if the id is not found
                                                          //and if the id is found then it will return the values  assosiated with id
        return emp;
    }
    //This method will delete the user values associated with that id
    @DeleteMapping(path="/deleteOneEmployee/{id}")
    public Emp deleteUser(@PathVariable int id) throws ResourceNotFoundException {
        Emp emp=service.deleteById(id);
        if(emp==null)
            throw new ResourceNotFoundException("id-"+id);

        return emp;
    }





}