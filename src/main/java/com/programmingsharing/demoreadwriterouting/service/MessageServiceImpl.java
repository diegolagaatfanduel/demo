package com.programmingsharing.demoreadwriterouting.service;

import com.programmingsharing.demoreadwriterouting.entities.MessageEntity;
import com.programmingsharing.demoreadwriterouting.model.MessageModel;
import com.programmingsharing.demoreadwriterouting.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<MessageEntity> getAllWrite() {
        List<MessageEntity> messageList = new ArrayList<>();
        messageRepository.findAll().forEach(messageList::add);
        return messageList;
    }

    @Override
    @Transactional(readOnly = true)
    public List<MessageEntity> getAllRead() {
        List<MessageEntity> messageList = new ArrayList<>();
        messageRepository.findAll().forEach(messageList::add);
        return messageList;
    }
}
