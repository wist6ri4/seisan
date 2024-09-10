package com.example.seisan.Repository.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * db23_membersのEntity
 */
@Entity
@Table(name = "db23_members")
@Getter
@Setter
public class ET23_Member extends ET00_Common {
    // レート
    @Column(name = "rate")
    private float rate;

    // 金額固定フラグ
    @Column(name = "is_amount_fixed")
    private Integer isAmountFixed;

    // 実支払金額
    @Column(name = "amount")
    private Integer amount;

    // イベント
    @OneToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    @Fetch(FetchMode.JOIN)
    private ET10_Event event;
    
    // グローバルメンバー
    @OneToOne
    @JoinColumn(name = "global_member_id", referencedColumnName = "id")
    @Fetch(FetchMode.JOIN)
    private ET20_GlobalMember globalMember;
}
