
package question1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
    @RequestMapping("/WelcomeMessage")
    public String Welcome()
    {
        return "Welcome to Spring Boot"; //It will return the given statement
    }
}
