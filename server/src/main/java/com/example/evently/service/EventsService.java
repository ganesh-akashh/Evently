package com.example.evently.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.evently.model.EventsModel;
import com.example.evently.repository.EventsRepository;

@Service
public class EventsService {
    
    @Autowired
    EventsRepository er;

    public List<EventsModel> fetchAllEventDetails(int pgno) {
        Page<EventsModel> p = er.findAll(PageRequest.of(pgno, 6));
        return p.getContent();
    }

    public Optional<EventsModel> fetchEventById(int id) {
        return er.findById(id);
    }

    public List<EventsModel> fetchEventByUserId(int uid) {
        return er.findByOrganizerId(uid);
    }

    public List<EventsModel> fetchRelatedEvents(int cid) {
        List<EventsModel>e = er.findByCategoryId(cid);
        return e;
    }

    public EventsModel addEventDetails(EventsModel em) {
        return er.save(em);
    }

    public EventsModel updateEventDetails(EventsModel em) {
        return er.save(em);
    }

    public boolean deleteEventById(int id) {
        er.deleteById(id);
        return true;
    }

}
