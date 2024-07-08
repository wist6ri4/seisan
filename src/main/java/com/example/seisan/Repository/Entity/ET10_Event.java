package com.example.seisan.Repository.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDate;
import java.util.List;

/**
 * db10_eventsのEntity
 */
@Entity
@Table(name = "db10_events")
@Getter
@Setter
public class ET10_Event extends ET00_Common {
    // イベントタイトル
    @Column(name = "title")
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
    // イベントタグのリスト
    @OneToMany
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private List<ET12_EventRelation> eventRelations;
}
