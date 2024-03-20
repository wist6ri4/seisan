package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET25_Payee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * db25_payeesのRepository
 */
@Repository
public interface DB25_PayeeRepository extends JpaRepository<ET25_Payee, Integer> {
}
