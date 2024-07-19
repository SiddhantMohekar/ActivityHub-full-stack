package com.activitymains.activitymains.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activitymains.activitymains.Model.Event;
import com.activitymains.activitymains.Repos.EventRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    public Event addEvent(Event e){
        Event event = eventRepository.save(e);
        return event;
    }

    
    
}
