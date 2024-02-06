package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET02_Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DB02_MemberRepository extends JpaRepository<ET02_Member, Integer> {
}
