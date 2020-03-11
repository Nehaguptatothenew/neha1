////Create a simple REST ful service in Spring Boot which returns the Response "Welcome to spring boot".
package question1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeToSpringBoot {

    public static void main(String[] args) {

        SpringApplication.run(WelcomeToSpringBoot.class, args);
    }


}
