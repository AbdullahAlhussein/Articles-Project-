package com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    public User findByName(String name);
    public User findByEmail (String email);
    public User findByMobileNumber (String phone);
}
