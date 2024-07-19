package com.activitymains.activitymains.Model;

import java.sql.Blob;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;


@Entity
public class Event {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Lob
    private Blob image;
    private String nameEvent;
    private String description;
    private String expDate;

    public Event() {
    }

   

    public Event(long id, Blob image, String nameEvent, String description, String expDate) {
        this.id = id;
        this.image = image;
        this.nameEvent = nameEvent;
        this.description = description;
        this.expDate = expDate;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Blob getImage() {
        return image;
    }



    public void setImage(Blob image) {
        this.image = image;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }


    @Override
    public String toString() {
        return "Event [id=" + id + ", image=" + image + ", nameEvent=" + nameEvent + ", description=" + description
                + ", expDate=" + expDate + ", SubEvent=" + "]";
    }



    
    
    
    
}
