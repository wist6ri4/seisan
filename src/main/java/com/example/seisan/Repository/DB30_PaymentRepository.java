package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET30_Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * db30_paymentsのRepository
 */
public interface DB30_PaymentRepository extends JpaRepository<ET30_Payment, Integer> {
}
