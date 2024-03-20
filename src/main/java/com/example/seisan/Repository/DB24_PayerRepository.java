package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET24_Payer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * db24_payersのRepository
 */
@Repository
public interface DB24_PayerRepository extends JpaRepository<ET24_Payer, Integer> {
}
