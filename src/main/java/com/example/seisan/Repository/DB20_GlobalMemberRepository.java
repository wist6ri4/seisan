package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET20_GlobalMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ET20_GlobalMemberのRepository
 */
@Repository
public interface DB20_GlobalMemberRepository extends JpaRepository<ET20_GlobalMember, Integer> {
}
