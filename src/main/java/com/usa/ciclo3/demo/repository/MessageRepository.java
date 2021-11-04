/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.ciclo3.demo.repository;

import com.usa.ciclo3.demo.crudrepository.MessageCrudRepository;
import java.util.List;
import java.util.Optional;
import com.usa.ciclo3.demo.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author YO
 */
@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll() {
        return (List<Message>) messageCrudRepository.findAll();
    }

    public Optional<Message> getMessage(int id) {
        return messageCrudRepository.findById(id); 
    }

    public Message save(Message message) {
        return messageCrudRepository.save(message); 
    }

    public void delete(Message message) {
        messageCrudRepository.delete(message); 
    }
    
    
}
