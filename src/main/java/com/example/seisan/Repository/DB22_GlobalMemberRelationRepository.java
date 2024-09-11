package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET22_GlobalMemberRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * db22_globals_members_relationsのRepository
 */
@Repository
public interface DB22_GlobalMemberRelationRepository extends JpaRepository<ET22_GlobalMemberRelation, Integer> {
}
