package com.example.evently.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.evently.model.OrdersModel;
import com.example.evently.repository.OrdersRepository;

@Service
public class OrdersService {
    @Autowired
    OrdersRepository or;


    public OrdersModel createOrder(OrdersModel om){
        return or.save(om);
    }

    public List<OrdersModel> getOrderByUserId(int id){
        return or.findByBuyerId(id);
    }

    public List<OrdersModel> getOrdersByEventId(int id){
        return or.findByEventId(id);
    }

}
