package com.activitymains.activitymains.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.activitymains.activitymains.Model.Image;
import com.activitymains.activitymains.Repos.ImageRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Image image = imageRepository.findByEmail(username);
        if (image == null) {
            throw new UsernameNotFoundException("Username not found" + username);
        }
        return new org.springframework.security.core.userdetails.User(image.getEmail(), image.getPassword(), image.getRoles());
    }
    
}
