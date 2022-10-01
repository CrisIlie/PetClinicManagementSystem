package com.sda.cristinailie.petclinic.service;

import com.sda.cristinailie.petclinic.model.Vet;
import com.sda.cristinailie.petclinic.repository.VetRepository;
import com.sda.cristinailie.petclinic.utils.SessionManager;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Vet> getAllVets() {
        return vetRepository.getAllVets();
    }

    @Override
    public Optional<Vet> findById(int id) {
       return vetRepository.findById(id);
    }
}

