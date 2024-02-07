package com.example.seisan.Repository.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDateTime;

/**
 * db02_membersのEntity
 */
@Entity
@Table(name = "db02_members")
@Getter
@Setter
public class ET02_Member {
    // メンバーID
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // メンバー名
    @Column(name = "name")
    private String name;
    // レート
    @Column(name = "rate")
    private float rate;
    // イベント
    @OneToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    @Fetch(FetchMode.JOIN)
    private ET01_Event Event;
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
