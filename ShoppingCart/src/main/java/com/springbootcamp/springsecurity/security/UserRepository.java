package com.springbootcamp.springsecurity.security;

import com.springbootcamp.springsecurity.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

    User findByUsername(String username);
}
