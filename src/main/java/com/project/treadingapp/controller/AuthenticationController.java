package com.project.treadingapp.controller;

import com.project.treadingapp.model.Broker;

import com.project.treadingapp.repository.BrokerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication")
public class AuthenticationController {

    @Autowired
    BrokerRepository brokerRepository;

    @PostMapping("/registration")
    public ResponseEntity<Broker> registerUser(@RequestBody Broker broker){

        Broker newBroker = new Broker();
        newBroker.setEmail(broker.getEmail());
        newBroker.setFullName(broker.getFullName());
        newBroker.setPassword(broker.getPassword());

        Broker savedBroker = brokerRepository.save(newBroker);

        return new ResponseEntity<>(savedBroker, HttpStatus.CREATED);
    }
}
