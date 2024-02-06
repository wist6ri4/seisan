package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET03_Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DB03_PaymentRepository extends JpaRepository<ET03_Payment, Integer> {
}
