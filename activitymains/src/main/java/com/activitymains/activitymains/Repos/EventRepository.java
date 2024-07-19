package com.activitymains.activitymains.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.activitymains.activitymains.Model.Event;

public interface EventRepository extends JpaRepository<Event,Long> {
    
    
}
