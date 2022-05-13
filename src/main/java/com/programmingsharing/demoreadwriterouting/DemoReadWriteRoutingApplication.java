package com.programmingsharing.demoreadwriterouting;

import com.programmingsharing.demoreadwriterouting.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoReadWriteRoutingApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoReadWriteRoutingApplication.class, args);
    }
}
