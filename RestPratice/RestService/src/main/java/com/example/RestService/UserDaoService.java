package com.example.RestService;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
public class UserDaoService {
    private static List <User>users = new ArrayList<>();
    private static int usercount=3;
    static {
        users.add(new User("neha",1,new Date()));
        users.add(new User("gupta",2,new Date()));
        users.add(new User("ishika",3,new Date()));
        users.add(new User("ameesha",4,new Date()));
    }
    public List<User> findAll()
    {
        return users;
    }
    public User saveUser(User user)
    {
    if(user.getId()==null)
        user.setId(++usercount);

    users.add(user);
    return user;
    }
    public User findOne(Integer id)
    {
        for(User user:users)
        {
            if(user.getId()==id)
                return user;
        }
       return null;
    }

}
