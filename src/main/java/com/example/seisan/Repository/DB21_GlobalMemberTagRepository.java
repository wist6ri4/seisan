package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET21_GlobalMemberTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ET21_GlobalMemberTagのRepository
 */
@Repository
public interface DB21_GlobalMemberTagRepository extends JpaRepository<ET21_GlobalMemberTag, Integer> {
}
