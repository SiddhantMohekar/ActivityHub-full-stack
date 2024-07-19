package com.activitymains.activitymains.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activitymains.activitymains.Model.RegEvent;
import com.activitymains.activitymains.Repos.RegEventRepository;

@Service
public class RegEventService {

    @Autowired
    private RegEventRepository regEventRepository;
    
    public RegEvent saveEvent(RegEvent regEvent){

        return regEventRepository.save(regEvent);
    }
}
