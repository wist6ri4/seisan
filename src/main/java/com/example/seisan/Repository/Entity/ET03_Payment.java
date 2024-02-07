package com.example.seisan.Repository.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * db03_paymentsのEntity
 */
@Entity
@Table(name = "db03_payments")
@Getter
@Setter
public class ET03_Payment {
    // 支払ID
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
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
    private ET01_Event Event;
    // 削除フラグ
    @Column(name = "is-deleted")
    private int isDeleted;
    // 作成日時
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    // 更新日時
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;
}
