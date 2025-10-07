package com.kader.users.repos;

import org.springframework.data.jpa.repository.JpaRepository; 
import com.kader.users.entities.Role; 
 
public interface RoleRepository extends JpaRepository<Role, Long> { 
 
 Role findByRole(String role); 
  
}