package com.activitymains.activitymains.Model;

import java.sql.Blob;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_profile")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
     @Lob
    private Blob image;
    private String username;
    private String email;
    private String password;
    private String phoneNo;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<Role> roles;


    public Set<Role> getRoles() {
        return roles;
    }


    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }


    public Image() {
    }


    public Image(long id, Blob image, String username, String email, String password, String phoneNo) {
        this.id = id;
        this.image = image;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNo = phoneNo;
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


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getPhoneNo() {
        return phoneNo;
    }


    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }


    @Override
    public String toString() {
        return "Image [id=" + id + ", image=" + image + ", username=" + username + ", email=" + email + ", password="
                + password + ", phoneNo=" + phoneNo + "]";
    }

    
    
    
}
