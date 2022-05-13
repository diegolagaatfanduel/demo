package com.programmingsharing.demoreadwriterouting.repository;

import com.programmingsharing.demoreadwriterouting.entities.MessageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<MessageEntity, Integer> {
}
