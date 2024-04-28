package com.example.evently.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.evently.model.OrdersModel;
import com.example.evently.service.OrdersService;

@CrossOrigin
@RestController
public class OrdersController {
     
     OrdersService os;
     
     //create an Order.
    @GetMapping("/createOrder")
    public OrdersModel createOrder(@RequestBody OrdersModel om){
        return os.createOrder(om);
    }

    //getOrdersByUserId
    @GetMapping("/getOrdersByUserId/{id}")
    public List<OrdersModel> getOrdersByUserId(@PathVariable int id){
        return os.getOrderByUserId(id);
    }

    //getOrdersByEventId
    @GetMapping("getOrderByUserId/{id}")
    public List<OrdersModel> getOrdersByEventId(@PathVariable int id){
        return os.getOrdersByEventId(id);
    }




}
