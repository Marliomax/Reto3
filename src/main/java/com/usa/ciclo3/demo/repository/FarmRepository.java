/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.ciclo3.demo.repository;

import com.usa.ciclo3.demo.crudrepository.FarmCrudRepository;
import java.util.List;
import java.util.Optional;
import com.usa.ciclo3.demo.model.Farm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author YO
 */
@Repository
public class FarmRepository {
    @Autowired
    private FarmCrudRepository farmCrudRepository;

    public List<Farm> getAll() {
        return (List<Farm>)  farmCrudRepository.findAll();
    }

    public Optional<Farm> getFarm(int id){
        return farmCrudRepository.findById(id);
    }

    public Farm save(Farm farm){
        return farmCrudRepository.save(farm);
    }

    public void delete(Farm farm){
        farmCrudRepository.delete(farm);}
}
