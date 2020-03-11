//Implement Exception Handling for resource not found
package question3_4_6_7;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//This class is made to handle the Exception
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception
{
public ResourceNotFoundException(String message)
{
    super(message);
}
}
