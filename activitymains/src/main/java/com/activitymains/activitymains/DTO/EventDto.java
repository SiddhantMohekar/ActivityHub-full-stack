package com.activitymains.activitymains.DTO;


public class EventDto {
    
    private long id;
    private String image;
    private String nameEvent;
    private String description;
    private String expDate;

    
    public EventDto() {
    }

    
    public EventDto(long id, String image, String nameEvent, String description, String expDate) {
        this.id = id;
        this.image = image;
        this.nameEvent = nameEvent;
        this.description = description;
        this.expDate = expDate;
    }


    public String getImage() {
        return image;
    }
    public void setImage(String image) {
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
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    
}
