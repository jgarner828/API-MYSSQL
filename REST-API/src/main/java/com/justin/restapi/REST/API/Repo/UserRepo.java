package com.justin.restapi.REST.API.Repo;

import com.justin.restapi.REST.API.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
