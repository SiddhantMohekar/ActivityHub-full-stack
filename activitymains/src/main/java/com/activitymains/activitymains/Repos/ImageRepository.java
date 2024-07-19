package com.activitymains.activitymains.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.activitymains.activitymains.Model.Image;



@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{
    Image findByEmail(String email);
}
