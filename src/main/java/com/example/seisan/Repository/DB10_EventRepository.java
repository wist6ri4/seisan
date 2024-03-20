package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET10_Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * db10_eventsのRepository
 */
@Repository
public interface DB10_EventRepository extends JpaRepository<ET10_Event, Integer> {
}
