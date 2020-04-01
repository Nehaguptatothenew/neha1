package com.springbootcamp.springsecurity.security;

import com.springbootcamp.springsecurity.models.Role;
import com.springbootcamp.springsecurity.models.User;
import com.springbootcamp.springsecurity.security.AppUser;
import com.springbootcamp.springsecurity.security.GrantAuthorityImpl;
import com.springbootcamp.springsecurity.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Repository
public class UserDao {

    @Autowired
    UserRepository userRepository;

   public AppUser loadUserByUsername(String username) {
        User user = userRepository.findByEmail(username);
        List<GrantAuthorityImpl> grantAuthorityList=new ArrayList<>();
        Set<Role> roleList= user.getRoles();
        roleList.forEach(role ->  grantAuthorityList.add(new GrantAuthorityImpl(role.getAuthority())));
        //System.out.println(user);

        if (username != null) {
            return new AppUser(user.getEmail(), user.getPassword(),grantAuthorityList);
        } else {
            throw new RuntimeException();
        }

    }
}
