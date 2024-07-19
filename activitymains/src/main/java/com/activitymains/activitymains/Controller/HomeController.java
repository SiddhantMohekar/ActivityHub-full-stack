package com.activitymains.activitymains.Controller;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.activitymains.activitymains.DTO.EventDto;
import com.activitymains.activitymains.Model.Event;
import com.activitymains.activitymains.Service.EventService;

@Controller
public class HomeController {

    @Autowired
    private EventService eventService;
    
    @GetMapping("/Register")
    public String Register(){
            return "Register";
    }
    @GetMapping("/Events")
   public String getEvents(Model model) throws SQLException {
        List<Event> events = eventService.getAllEvents();

        // Convert BLOB to base64 string
        List<EventDto> eventDtos = events.stream().map(event -> {
            EventDto dto = new EventDto();
            dto.setId(event.getId());
            dto.setNameEvent(event.getNameEvent());
            dto.setExpDate(event.getExpDate());
            try {
                Blob imageBlob = event.getImage();
                if (imageBlob != null) {
                    int blobLength = (int) imageBlob.length();
                    byte[] imageBytes = imageBlob.getBytes(1, blobLength);
                    String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                    dto.setImage(base64Image);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return dto;
        }).collect(Collectors.toList());


        model.addAttribute("events", eventDtos);
        return "events";
    }

    @PostMapping("/addEvent")
    public String addEventToDB(@RequestParam("image") MultipartFile file,
     @RequestParam("nameEvent") String nameEvent,
    @RequestParam("description") String description,
    @RequestParam("expDate") String expDate
    ) throws IOException, SerialException, SQLException {


         byte[] bytes = file.getBytes();
        Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);

        Event event = new Event();
        event.setNameEvent(nameEvent);
        event.setDescription(description);
        event.setExpDate(expDate);
        event.setImage(blob);

        eventService.addEvent(event);
    
        return "Events";
    }

    @GetMapping("/")
    public String HomePage(){
            return "index";
    }

    @GetMapping("/Profile")
    public String Profile(){
            return "Profile";
    }
    @GetMapping("/Login")
    public String Login(){
            return "Login";
    }
    @GetMapping("/AdminLogin")
    public String AdminLogin(){
            return "AdminLogin";
    }
    @GetMapping("/AddDetails")
    public String AddDetails(){
            return "AddDetails";
    }
}
