package com.example.seisan.Repository.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * db12_events_relationsのEntity
 */
@Entity
@Table(name = "db12_events_relations")
@Getter
@Setter
public class ET12_EventRelation extends ET00_Common {
    // イベント関連ID
    @Id
    @Column(name = "event_relation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventRelationId;

    // イベントID
    @Column(name = "event_id")
    private Integer eventId;

    // イベントタグ
    @OneToOne
    @JoinColumn(name = "event_tag_id", referencedColumnName = "id")
    @Fetch(FetchMode.JOIN)
    private ET11_EventTag eventTag;
}
