package com.example.seisan.Repository.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * db11_events_tagsのEntity
 */
@Entity
@Table(name = "db11_events_tags")
@Getter
@Setter
public class ET11_EventTag extends ET00_Common {
    // イベントタグID
    @Id
    @Column(name = "event_tag_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventTagId;

    // イベントタグ名
    @Column(name = "tag_name")
    private String tagName;

    // 色
    @Column(name = "color")
    private String color;
}
