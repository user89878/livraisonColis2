package com.example.livraisoncolis2.Repo;

import com.example.livraisoncolis2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
