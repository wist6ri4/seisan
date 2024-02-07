package com.example.seisan.Repository;

import com.example.seisan.Repository.Entity.ET01_Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * db01_eventsのRepository
 */
public interface DB01_EventRepository extends JpaRepository<ET01_Event, Integer> {
}
