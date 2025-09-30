package com.masterilidan.usermanagmentservicetwitterlike.repository;

import com.masterilidan.usermanagmentservicetwitterlike.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
