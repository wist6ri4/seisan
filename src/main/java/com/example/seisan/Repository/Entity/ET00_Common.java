package com.example.seisan.Repository.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Entityのスーパークラス
 */
@MappedSuperclass
@Getter
@Setter
public class ET00_Common {
    // ID
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // 削除フラグ
    @Column(name = "is_deleted")
    private int isDeleted;

    // 作成日時
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    
    // 更新日時
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    /**
     * Insert時に実行されるメソッド
     */
    @PrePersist
    public void preInsert() {
        LocalDateTime localDateTime = LocalDateTime.now();
        setCreatedDate(localDateTime);
        setUpdatedDate(localDateTime);
    }

    /**
     * Update時に実行されるメソッド
     */
    @PreUpdate
    public void preUpdate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        setUpdatedDate(localDateTime);
    }
}
