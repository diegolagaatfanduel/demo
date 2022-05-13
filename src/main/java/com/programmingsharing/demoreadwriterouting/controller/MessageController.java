package com.programmingsharing.demoreadwriterouting.controller;

import com.programmingsharing.demoreadwriterouting.entities.MessageEntity;
import com.programmingsharing.demoreadwriterouting.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/product")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/write")
    public String writeConnection(Model model){
        System.out.println(messageService.getAllWrite().stream().map(MessageEntity::getId).collect(Collectors.toSet()));
        return "product-list";
    }

    @GetMapping("/read")
    public String readConnection(Model model){
        System.out.println(messageService.getAllRead().stream().map(MessageEntity::getId).collect(Collectors.toSet()));
        return "product-list";
    }

}
