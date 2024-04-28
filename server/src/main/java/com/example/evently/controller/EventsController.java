package com.example.evently.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.evently.model.EventsModel;
import com.example.evently.service.EventsService;

@RestController
@CrossOrigin
public class EventsController {

    @Autowired
    EventsService es;
   
    //fetchDetails through pagination.
    @GetMapping("/fetchAllEventDetails/{pgno}")
    public List<EventsModel> fetchAllEventDetails(@PathVariable int pgno) {
        return es.fetchAllEventDetails(pgno);
    }
    
    //fetchEventById
    @GetMapping("fetchEventById/{id}")
    public Optional<EventsModel> fetchEventById(@PathVariable int id) {
        return es.fetchEventById(id);
    }
    
    //fetchEventByUserId
    @GetMapping("fetchEventByUserId/{id}")
    public List<EventsModel> fetchEventByUserId(@PathVariable int uid) {
        return es.fetchEventByUserId(uid);
    }
    
    //fetchRelatedEvents based on categoryId.
    @GetMapping("fetchRelatedEvents/{id}")
    public List<EventsModel> fetchRelatedEvents(@PathVariable int cid) {
       return es.fetchRelatedEvents(cid);
    }

    //updateEventBasedOnId
    @PostMapping("/addEventDetails")
    public EventsModel addEventDetails(@RequestBody EventsModel em) {
        return es.addEventDetails(em);
    }
    
    //updateEvenDetails
    @PutMapping("/updateEventDetails")
    public EventsModel updateEventDetails(@RequestBody EventsModel em) {
        return es.updateEventDetails(em);
    }
    
    //deleteEventByAnAid
    @DeleteMapping("/deleteEventById/{id}")
    public boolean deleteEventById(@PathVariable int id) {
        return es.deleteEventById(id);
    }

}
