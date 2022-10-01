package com.sda.cristinailie.petclinic;

import com.sda.cristinailie.petclinic.controller.VetController;
import com.sda.cristinailie.petclinic.repository.VetRepositoryImpl;
import com.sda.cristinailie.petclinic.service.VetServiceImpl;
import com.sda.cristinailie.petclinic.utils.SessionManager;

public class Main {
    public static void main(String[] args) {
     VetController vetController = new VetController(new VetServiceImpl(new VetRepositoryImpl()));
     vetController.createVet();
    }
}