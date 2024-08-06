package com.sankiproject.fullstackbackend.repository;

import com.sankiproject.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
