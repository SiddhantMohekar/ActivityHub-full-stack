package com.activitymains.activitymains.Model;

import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role implements GrantedAuthority{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<Image> users;


    public Role() {
    }


    public Role(long id, String name, Set<Image> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Set<Image> getUsers() {
        return users;
    }


    public void setUsers(Set<Image> users) {
        this.users = users;
    }


    @Override
    public String toString() {
        return "Role [id=" + id + ", name=" + name + ", users=" + users + "]";
    }


    @Override
    public String getAuthority() {
        // TODO Auto-generated method stub
       return name;
    }

    

    
}
