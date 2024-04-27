package com.example.evently.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.evently.model.EventsModel;
import java.util.List;

@Repository
public interface EventsRepository extends JpaRepository<EventsModel, Integer> {
    List<EventsModel> findByOrganizerId(int organizerId);
    List<EventsModel> findByCategoryId(int categoryId);
}
