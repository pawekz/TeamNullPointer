package com.g2appdev.teamnullpointer.service;

import com.g2appdev.teamnullpointer.entity.NotificationEntity;
import com.g2appdev.teamnullpointer.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.NameNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class NotificationService {
    @Autowired
    NotificationRepository nrepo;

    public NotificationService(){
        super();
    }

    public NotificationEntity postNotificationRepository(NotificationEntity notification){
        return nrepo.save(notification);

    }

   public List<NotificationEntity> getAllNotifications(){
        return nrepo.findAll();
    }

    public NotificationEntity postNotificationRecord(NotificationEntity notification) {
        return nrepo.save(notification);
    }

    public List<NotificationEntity> getNotificationRecords() {
        return nrepo.findAll();
    }
    @SuppressWarnings("finally")
    public NotificationEntity putNotificationRecord(int id,  NotificationEntity newNotification) {
        NotificationEntity notification  = new NotificationEntity();

            try{
                notification = nrepo.findById(id).get();

                notification.setMessage(newNotification.getMessage());
                notification.setDatePost(newNotification.getDatePost());

            }catch(NoSuchElementException e){
                throw new NameNotFoundException("Notification with id" + id + "Not found");
            }finally {
                return nrepo.save(notification);
            }
    }


   public String deleteNotificationRecord(int id) {
       String msg = "";
       if(nrepo.findById(id) != null){
           nrepo.deleteById(id);
           msg =  id + " deleted";
    }else{
           msg = id + " not found";
       }
       return msg;
    }
}
