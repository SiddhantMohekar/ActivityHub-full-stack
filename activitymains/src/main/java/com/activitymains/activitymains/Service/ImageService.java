package com.activitymains.activitymains.Service;

import org.springframework.stereotype.Service;

import com.activitymains.activitymains.Model.Image;

@Service
public interface ImageService {
    public Image create(Image image);
    public Image viewByid(long id);
}
