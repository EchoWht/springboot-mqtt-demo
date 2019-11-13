package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
public class MqttController {

    @Resource
    private SpringConfig.MqttGateway mqttGateway;

    @RequestMapping("/send/{topic}/{message}")
    public String send(@PathVariable String topic, @PathVariable String message) {
        // 发送消息到指定topic
        mqttGateway.sendToMqtt(topic, message);
        return "send message : " + message;
    }
}