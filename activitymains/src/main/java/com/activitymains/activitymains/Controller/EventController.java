package com.activitymains.activitymains.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.activitymains.activitymains.Model.RegEvent;
import com.activitymains.activitymains.Service.RegEventService;

@Controller
@RequestMapping("/Events")
public class EventController {

    @Autowired
    private RegEventService regEventService;

    @GetMapping("/RegEvent")
    public String RegEvent(){
        return "RegEvent";
    }

    @PostMapping("/RegisterToEvent")
    public String RegToEvent(@RequestBody RegEvent regEvent){
           regEventService.saveEvent(regEvent);
           return "Registered";
    }
    
}
