//  3. Create POST Method to create user details which can accept XML for user creation.
//       4. Create GET Method to fetch the list of users in XML format.
//       8. Create API which saves details of User (along with the password) but on successfully saving returns only non-critical data. (Use static filtering)
//        9. Create another API that does the same by using Dynamic Filtering.


package com.example.Rest2.Question3_4_8_9;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class ContentNegotiatonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentNegotiatonApplication.class, args);
	}

}
