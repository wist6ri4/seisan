package com.example.seisan.Repository.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * db01_eventsのEntity
 */
@Entity
@Table(name = "db01_events")
@Getter
@Setter
public class ET01_Event {
    // イベントID
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // イベントタイトル
    @Column(name = "text")
    private String title;
    // イベント概要
    @Column(name = "description")
    private String description;
    // 日付
    @Column(name = "date")
    private LocalDate date;
    // Notionリンク
    @Column(name = "notion_link")
    private String notionLink;
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
