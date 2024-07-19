package com.activitymains.activitymains.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RegEvent {
    
    @Id
   private Long id;
   private String fullName;
   private String email;
   private String phoneNum;
   private String collegeName;
   private String department;
   private String year;
   private String participent1;
   private String participent2;
   private String utr;


public RegEvent() {
}


public RegEvent(Long id, String fullName, String email, String phoneNum, String collegeName, String department,
        String year, String participent1, String participent2, String utr) {
    this.id = id;
    this.fullName = fullName;
    this.email = email;
    this.phoneNum = phoneNum;
    this.collegeName = collegeName;
    this.department = department;
    this.year = year;
    this.participent1 = participent1;
    this.participent2 = participent2;
    this.utr = utr;
}


public Long getId() {
    return id;
}


public void setId(Long id) {
    this.id = id;
}


public String getFullName() {
    return fullName;
}


public void setFullName(String fullName) {
    this.fullName = fullName;
}


public String getEmail() {
    return email;
}


public void setEmail(String email) {
    this.email = email;
}


public String getPhoneNum() {
    return phoneNum;
}


public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
}


public String getCollegeName() {
    return collegeName;
}


public void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
}


public String getDepartment() {
    return department;
}


public void setDepartment(String department) {
    this.department = department;
}


public String getYear() {
    return year;
}


public void setYear(String year) {
    this.year = year;
}


public String getParticipent1() {
    return participent1;
}


public void setParticipent1(String participent1) {
    this.participent1 = participent1;
}


public String getParticipent2() {
    return participent2;
}


public void setParticipent2(String participent2) {
    this.participent2 = participent2;
}


public String getUtr() {
    return utr;
}


public void setUtr(String utr) {
    this.utr = utr;
}


@Override
public String toString() {
    return "RegEvent [id=" + id + ", fullName=" + fullName + ", email=" + email + ", phoneNum=" + phoneNum
            + ", collegeName=" + collegeName + ", department=" + department + ", year=" + year + ", participent1="
            + participent1 + ", participent2=" + participent2 + ", utr=" + utr + "]";
}



   
   

}
