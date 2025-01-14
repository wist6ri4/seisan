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
 * db21_globals_members_tagsのEntity
 */
@Entity
@Table(name = "db21_globals_members_tags")
@Getter
@Setter
public class ET21_GlobalMemberTag extends ET00_Common {
    // グローバルメンバータグID
    @Id
    @Column(name = "global_member_tag_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer globalMemberTagId;

    // グローバルメンバータグ名
    @Column(name = "tag_name")
    private String tagName;

    // 色
    @Column(name = "color")
    private String color;
}
