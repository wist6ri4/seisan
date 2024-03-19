package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET10_Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * db10_eventsのRepository
 */
public interface DB10_EventRepository extends JpaRepository<ET10_Event, Integer> {
}
