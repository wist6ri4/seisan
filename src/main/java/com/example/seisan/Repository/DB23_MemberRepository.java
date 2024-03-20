package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET23_Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * db23_membersのRepository
 */
@Repository
public interface DB23_MemberRepository extends JpaRepository<ET23_Member, Integer> {
}
