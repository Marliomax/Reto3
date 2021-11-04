/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.ciclo3.demo.controller;

import java.util.List;
import java.util.Optional;
import com.usa.ciclo3.demo.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.usa.ciclo3.demo.reports.CountClient;
import com.usa.ciclo3.demo.reports.ReservationStatus;

import com.usa.ciclo3.demo.service.ReservationService;

/**
 *
 * @author YO
 */
@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){ 
        return reservationService.getAll();}

    @GetMapping("/{id}")
    public Optional<Reservation> getCategory(@PathVariable("id") int id){
        return reservationService.getReservation(id);}
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    private Reservation save(@RequestBody Reservation reservation){
        return reservationService.save(reservation);}

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation update(@RequestBody Reservation reservation){
        return reservationService.update(reservation);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean delete(@PathVariable("id") int id){
        return reservationService.deleteReservation(id);}
    
    @GetMapping("/report-status")
    public ReservationStatus getReservationsStatusReport(){
        return reservationService.getReservationStatusReport();
    }

    @GetMapping("/report-dates/{dateOne}/{dateTwo}")
    public List<Reservation> getReservationReportDate(@PathVariable("dateOne") String dateOne, @PathVariable("dateTwo") String dateTwo){
        return reservationService.getReservationPeriod(dateOne,dateTwo);
    }

    @GetMapping("/report-clients")
    public List<CountClient> getClients(){
        return reservationService.getTopClients();
    }
}
