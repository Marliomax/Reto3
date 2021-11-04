/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.ciclo3.demo.controller;

import java.util.List;
import java.util.Optional;
import com.usa.ciclo3.demo.model.Farm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.usa.ciclo3.demo.service.FarmService;

/**
 *
 * @author YO
 */
@RestController
@RequestMapping("/api/Farm")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class FarmController {
    @Autowired
    private FarmService farmService;
    
    @GetMapping("/all")
    public List<Farm> getAll(){
        return farmService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Farm> getFarm(@PathVariable("id")int id){
        return farmService.getFarm(id);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Farm save(@RequestBody Farm farm){ 
        return farmService.save(farm);}
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Farm update(@RequestBody Farm farm){
        return farmService.update(farm);}
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean delete(@PathVariable("id") int id){
        return farmService.deleteFarm(id);}
    
}
