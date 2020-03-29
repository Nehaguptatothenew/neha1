package com.springbootcamp.springsecurity;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserSecurity,Integer> {

    UserSecurity findByUsername(String username);
}
