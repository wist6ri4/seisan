package com.example.seisan.Repository.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDate;

/**
 * db30_paymentsのEntity
 */
@Entity
@Table(name = "db30_payments")
@Getter
@Setter
public class ET30_Payment extends  ET00_Common {
    // 支払ID
    @Id
    @Column(name = "payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;

    // 支払タイトル
    @Column(name = "title")
    private String title;

    // 支払金額
    @Column(name = "amount")
    private int amount;

    // 支払日
    @Column(name = "date")
    private LocalDate date;
    
    // イベント
    @OneToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    @Fetch(FetchMode.JOIN)
    private ET10_Event Event;
}
