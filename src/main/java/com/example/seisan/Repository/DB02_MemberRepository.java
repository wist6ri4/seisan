package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET02_Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * db02_membersのRepository
 */
public interface DB02_MemberRepository extends JpaRepository<ET02_Member, Integer> {
}
