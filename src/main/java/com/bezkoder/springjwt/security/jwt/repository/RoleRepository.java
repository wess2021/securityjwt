package com.bezkoder.springjwt.security.jwt.repository;

import java.util.Optional;

import com.bezkoder.springjwt.security.jwt.models.ERole;
import com.bezkoder.springjwt.security.jwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}