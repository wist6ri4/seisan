package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET11_EventTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ET11_EventTagのRepository
 */
@Repository
public interface DB11_EventTagRepository extends JpaRepository<ET11_EventTag, Integer> {
}
