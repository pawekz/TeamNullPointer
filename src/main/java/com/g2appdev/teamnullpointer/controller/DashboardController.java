package com.g2appdev.teamnullpointer.controller;

import com.g2appdev.teamnullpointer.entity.DashboardEntity;
import com.g2appdev.teamnullpointer.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.naming.NameNotFoundException;

@RestController
@RequestMapping(method = RequestMethod.GET, path = "/dashboard")
public class DashboardController {
    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/print")
    public String print() {return "Dashboard Controller";}

    @GetMapping("/getdashboardrecords")
    public Iterable<DashboardEntity> getDashboardRecords() {
        return dashboardService.getDashboardRecords();
    }

    @PostMapping("/postdashboardrecord")
    public DashboardEntity postDashboardRecord(@RequestBody DashboardEntity dashboard) {
        return dashboardService.postDashboardRecord(dashboard);
    }

    @PutMapping("/putdashboardrecord")
    public DashboardEntity putDashboardRecord(@RequestParam int id, @RequestBody DashboardEntity newDashboard) throws NameNotFoundException {
        return dashboardService.putDashboardRecord(id, newDashboard);
    }

    @DeleteMapping("/deletedashboardrecord/{id}")
    public String deleteDashboardRecord(@PathVariable int id) {
        return dashboardService.deleteDashboardRecord(id);
    }
}
