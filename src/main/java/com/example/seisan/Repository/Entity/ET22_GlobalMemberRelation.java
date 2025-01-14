package com.example.seisan.Repository.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * db22_globals_members_relationsのEntity
 */
@Entity
@Table(name = "db22_globals_members_relations")
@Getter
@Setter
public class ET22_GlobalMemberRelation extends ET00_Common {
    // グローバルメンバー関連ID
    @Id
    @Column(name = "global_member_relation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer globalMemberRelationId;

    // グローバルメンバーID
    @Column(name = "global_member_id")
    private Integer globalMemberId;

    // グローバルメンバータグ
    @OneToOne
    @JoinColumn(name = "global_member_tag_id", referencedColumnName = "id")
    @Fetch(FetchMode.JOIN)
    private ET21_GlobalMemberTag globalMemberTag;
}
