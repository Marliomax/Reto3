/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usa.ciclo3.demo.crudrepository;

import com.usa.ciclo3.demo.model.Client;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author YO
 */

public interface ClientCrudRepository extends CrudRepository<Client, Integer>{
    
}
