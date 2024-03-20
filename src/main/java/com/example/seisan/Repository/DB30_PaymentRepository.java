package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET30_Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * db30_paymentsのRepository
 */
@Repository
public interface DB30_PaymentRepository extends JpaRepository<ET30_Payment, Integer> {
}
