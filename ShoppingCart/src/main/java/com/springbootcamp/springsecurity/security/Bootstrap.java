package com.springbootcamp.springsecurity.security;


import com.springbootcamp.springsecurity.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if(userRepository.count()<1){
            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            User userSecurity1 = new User();
            userSecurity1.setFirst_name("user");
            userSecurity1.setPassword(passwordEncoder.encode("pass"));
            //userSecurity1.setRoles("ROLE_USER");

            User userSecurity2 = new User();
            userSecurity2.setFirst_name("admin");
            userSecurity2.setPassword(passwordEncoder.encode("pass"));
            //userSecurity2.setRole("ROLE_ADMIN");

            userRepository.save(userSecurity1);
            userRepository.save(userSecurity2);
            System.out.println("Total users saved::"+userRepository.count());

        }
    }
}
