package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET04_Payer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * db04_payersのRepository
 */
public interface DB04_PayerRepository extends JpaRepository<ET04_Payer, Integer> {
}
