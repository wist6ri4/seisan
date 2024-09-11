package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET21_GlobalMemberTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * db21_globals_members_tagsのRepository
 */
@Repository
public interface DB21_GlobalMemberTagRepository extends JpaRepository<ET21_GlobalMemberTag, Integer> {
}
