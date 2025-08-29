package org.codingwallah.em_project.Repository;

import org.codingwallah.em_project.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    
}
