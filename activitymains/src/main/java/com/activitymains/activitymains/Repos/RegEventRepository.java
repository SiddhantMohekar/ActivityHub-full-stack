package com.activitymains.activitymains.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.activitymains.activitymains.Model.RegEvent;

public interface RegEventRepository extends JpaRepository<RegEvent,Long> {
    
}
