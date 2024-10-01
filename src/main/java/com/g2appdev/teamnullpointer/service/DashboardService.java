package com.g2appdev.teamnullpointer.service;


import com.g2appdev.teamnullpointer.entity.DashboardEntity;
import com.g2appdev.teamnullpointer.repository.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.NameNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DashboardService {
    @Autowired
    DashboardRepository drepo;

    public DashboardService(){
        super();
    }

    public DashboardEntity postDashboardRecord(DashboardEntity dashboard) {
        return drepo.save(dashboard);
    }
    public List<DashboardEntity> getDashboardRecords() {
        return drepo.findAll();
    }

    public DashboardEntity putDashboardRecord(int id, DashboardEntity newDashboard){
        DashboardEntity dashboard = new DashboardEntity();
        try{
            dashboard = drepo.findById(id).get();
            dashboard.setUser(newDashboard.getUser());
            dashboard.setInstructor(newDashboard.getInstructor());
            dashboard.setCourse(newDashboard.getCourse());
            dashboard.setGroupDetails(newDashboard.getGroupDetails());
        }catch(NoSuchElementException e){
            throw new NameNotFoundException("Dashboard with id" + id + "Not found");
        }finally {
            return drepo.save(dashboard);
        }
    }

    public String deleteDashboardRecord(int id) {
        String msg = "";
        if(drepo.findById(id) != null){
            drepo.deleteById(id);
            msg = id + " deleted";
        }   else    {
            msg = "Dashboard with id " + id + " not found";
        }
        return msg;
        }
}
