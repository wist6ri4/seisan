package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET12_EventRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ET12_EventRelationのRepository
 */
@Repository
public interface DB12_EventRelationRepository extends JpaRepository<ET12_EventRelation, Integer> {
}
