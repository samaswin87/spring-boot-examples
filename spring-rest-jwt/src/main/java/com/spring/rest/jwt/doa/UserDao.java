package com.spring.rest.jwt.doa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.jwt.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer>{

    public User findByUserName(String username);

}
