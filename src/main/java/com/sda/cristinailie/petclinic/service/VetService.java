package com.sda.cristinailie.petclinic.service;

import com.sda.cristinailie.petclinic.model.Vet;

import java.util.List;
import java.util.Optional;

public interface VetService {
    void createVet(
            String firstName,
            String lastName,
            String address,
            String speciality
    );

    List<Vet> getAllVets();

    Optional<Vet> findById(int id);

    void updateVetById(
            int id,
            String firstName,
            String lastName,
            String address,
            String speciality
    );
}
