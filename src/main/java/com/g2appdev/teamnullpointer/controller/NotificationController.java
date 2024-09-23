package com.g2appdev.teamnullpointer.controller;

import com.g2appdev.teamnullpointer.entity.NotificationEntity;
import com.g2appdev.teamnullpointer.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(method = RequestMethod.GET, path = "/notification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @GetMapping("/print")
    public String print() {
        return "Notification Controller";
    }

    @GetMapping("/getnotificationrecords")
    public Iterable<NotificationEntity> getNotificationRecords() {
       return notificationService.getNotificationRecords();
    }

    @PostMapping("/postnoticationrecord")
    public NotificationEntity postNotificationRecord(@RequestBody NotificationEntity notification) {
        return notificationService.postNotificationRecord(notification);
    }
    @PutMapping("/putnotificationrecord")
    public NotificationEntity putNotificationRecord(@RequestParam int id, @RequestBody NotificationEntity newNotification) {
        return notificationService.putNotificationRecord(id, newNotification);
    }
    @DeleteMapping("/deletenotificationrecord/{id}")
    public String deleteNotificationRecord(@PathVariable int id) {
    return  notificationService.deleteNotificationRecord(id);
    }
}
