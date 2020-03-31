package com.springbootcamp.springsecurity.security;

import com.springbootcamp.springsecurity.models.Role;
import com.springbootcamp.springsecurity.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Repository
public class UserDao {

    @Autowired
    UserRepository userRepository;

    AppUser loadUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        List<GrantAuthorityImpl> grantAuthorityList=new ArrayList<>();
        Set<Role> roleList= user.getRoles();
        roleList.forEach(role ->  grantAuthorityList.add(new GrantAuthorityImpl(role.getAuthority())));
        //System.out.println(user);

        if (username != null) {
            return new AppUser(user.getFirst_name(), user.getPassword(),grantAuthorityList);
        } else {
            throw new RuntimeException();
        }

    }
}
