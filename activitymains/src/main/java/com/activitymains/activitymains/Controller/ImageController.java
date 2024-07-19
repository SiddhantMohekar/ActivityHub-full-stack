package com.activitymains.activitymains.Controller;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.activitymains.activitymains.Model.Image;
import com.activitymains.activitymains.Service.ImageService;

@Controller
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/add")
    public String addImage(@RequestParam("image") MultipartFile file, @RequestParam("username") String username,
    @RequestParam("password") String password,
    @RequestParam("email") String email,
    @RequestParam("phoneNo") String phoneNo) throws IOException, SerialException, SQLException{
        byte[] bytes = file.getBytes();
        Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);

        Image image = new Image();
        image.setImage(blob);
        image.setUsername(username);
        image.setPassword(password);
        image.setEmail(email);
        image.setPhoneNo(phoneNo);
        imageService.create(image);
        return "index";
    }

     @GetMapping("/display/{id}")
    public ResponseEntity<byte[]> displayImage(@PathVariable("id") long id) throws IOException, SQLException
    {
        Image image = imageService.viewByid(id);
        byte [] imageBytes = null;
        imageBytes = image.getImage().getBytes(1,(int) image.getImage().length());
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
    }
    
}
