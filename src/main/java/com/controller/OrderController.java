package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.OrderRepository;
import com.entity.Order;
@RestController
@RequestMapping("/orders")
@CrossOrigin

public class OrderController {
	@Autowired
    private OrderRepository orderRepository;

    @PostMapping("/add")
    public Order addOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

//    @GetMapping("/get")
//    public List<Order> getAllOrders() {
//        return orderRepository.findAll();
//    }
    
    @GetMapping("/top")
    public List<Order> getTopOrders() {
        // You can customize the query here to limit the results to the top 5.
        return orderRepository.findTop5ByOrderByIdDesc();
    }
}


