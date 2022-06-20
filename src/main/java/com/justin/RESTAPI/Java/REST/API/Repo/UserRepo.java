package com.justin.RESTAPI.Java.REST.API.Repo;

import com.justin.RESTAPI.Java.REST.API.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
