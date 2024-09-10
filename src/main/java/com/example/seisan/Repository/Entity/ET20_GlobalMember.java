package com.example.seisan.Repository.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

/**
 * db20_globals_membersのEntity
 */
@Entity
@Table(name = "db20_globals_members")
@Getter
@Setter
public class ET20_GlobalMember extends ET00_Common {
    // グローバルメンバー名
    @Column(name = "name")
    private String name;

    // 姓
    @Column(name = "family_name")
    private String familyName;

    // 名
    @Column(name = "last_name")
    private String lastName;
    
    // グローバルメンバータグのリスト
    @OneToMany
    @JoinColumn(name = "global_member_tag_id", referencedColumnName = "id", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private List<ET22_GlobalMemberRelation> globalMemberRelations;
}
