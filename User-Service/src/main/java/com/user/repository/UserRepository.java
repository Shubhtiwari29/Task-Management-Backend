package com.user.repository;

import com.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);

}
