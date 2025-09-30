package com.masterilidan.usermanagmentservicetwitterlike.repository;

import com.masterilidan.usermanagmentservicetwitterlike.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
