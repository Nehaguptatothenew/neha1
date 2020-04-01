package com.springbootcamp.springsecurity.repos;

import com.springbootcamp.springsecurity.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByEmail(String email);
}
