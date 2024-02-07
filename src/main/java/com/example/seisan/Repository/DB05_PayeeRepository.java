package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET05_Payee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * db05_payeesのRepository
 */
public interface DB05_PayeeRepository extends JpaRepository<ET05_Payee, Integer> {
}
