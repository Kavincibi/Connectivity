package com.example.connectivity.repository;

import com.example.connectivity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User,Integer> {
}
