package com.example.seisan.Repository.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * db24_payersのEntity
 */
@Entity
@Table(name = "db24_payers")
@Getter
@Setter
public class ET24_Payer extends ET00_Common {
    // 支払者ID
    @Id
    @Column(name = "payer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer payerId;

    // 支払
    @OneToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "id")
    @Fetch(FetchMode.JOIN)
    private ET30_Payment Payment;

    // メンバー
    @OneToOne
    @JoinColumn(name = "member_id", referencedColumnName = "id")
    private ET23_Member Member;
}
