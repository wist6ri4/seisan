package com.example.seisan.Repository.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDateTime;

@Entity
@Table(name = "DB05_Payee")
public class ET05_Payee {
    // 被支払者ID
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // 支払
    @OneToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "id")
    @Fetch(FetchMode.JOIN)
    private ET03_Payment Payment;

    // メンバー
    @OneToOne
    @JoinColumn(name = "member_id", referencedColumnName = "id")
    private ET02_Member Member;

    // 削除フラグ
    @Column(name = "is_deleted")
    private int isDeleted;

    // 作成日時
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    // 更新日時
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;
}
