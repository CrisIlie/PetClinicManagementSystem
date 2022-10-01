package com.sda.cristinailie.petclinic.service;

import com.sda.cristinailie.petclinic.repository.VetRepository;

public class VetServiceImpl implements VetService {
    private final VetRepository vetRepository;

    public VetServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public void createVet(String firstName, String lastName, String address, String speciality) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First Name is invalid.");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last Name is invalid.");
        }
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Address is invalid.");
        }
        if (speciality == null || speciality.isEmpty()) {
            throw new IllegalArgumentException("Speciality is invalid.");
        }
        vetRepository.createVet(firstName, lastName, address, speciality);

    }
}

