package com.example.evently.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.evently.model.OrdersModel;
import java.util.List;


public interface OrdersRepository extends JpaRepository<OrdersModel,Integer> {
    


    public List<OrdersModel> findByBuyerId(int buyerId);

    public List<OrdersModel> findByEventId(int eventId);
}
