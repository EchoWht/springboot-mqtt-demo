package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class DemoController {

    @Autowired
    private MqttGateway mqttGateway;

    @RequestMapping("/send")
    public String sendMqtt() {
        mqttGateway.sendToMqtt("abc", "hello7");
        return "OK";
    }
}