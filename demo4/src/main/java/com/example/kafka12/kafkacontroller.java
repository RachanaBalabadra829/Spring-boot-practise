package com.example.kafka12;


//package demokafka2;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demokafka.demokafka;



@RestController

@RequestMapping(value = "/kafka-example/")

public class kafkacontroller {

    

    @Autowired

    demokafka demokafka;



    @GetMapping(value = "/produce")

    public String producer(@RequestParam("message") String message) {

    	demokafka.send(message);



        return "Success";

    }



}