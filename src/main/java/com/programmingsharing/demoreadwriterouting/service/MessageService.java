package com.programmingsharing.demoreadwriterouting.service;

import com.programmingsharing.demoreadwriterouting.entities.MessageEntity;
import com.programmingsharing.demoreadwriterouting.model.MessageModel;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MessageService {
    List<MessageEntity> getAllWrite();
    @Transactional(readOnly = true)
    List<MessageEntity> getAllRead();
}
