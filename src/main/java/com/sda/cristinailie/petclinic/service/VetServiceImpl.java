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
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First Name is invalid.");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last Name is invalid.");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address is invalid.");
        }
        if (speciality == null || speciality.isBlank()) {
            throw new IllegalArgumentException("Speciality is invalid.");
        }
        vetRepository.createVet(firstName, lastName, address, speciality);

    }

    @Override
    public List<Vet> getAllVets() {
        return vetRepository.getAll();
    }

    @Override
    public Optional<Vet> findById(int id) {
        return vetRepository.findById(id);
    }

    @Override
    public void updateVetById(int id, String firstName, String lastName, String address, String speciality) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id is invalid.");
        }
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First Name is invalid.");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last Name is invalid.");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address is invalid.");
        }
        if (speciality == null || speciality.isBlank()) {
            throw new IllegalArgumentException("Speciality is invalid.");
        }
        vetRepository.updateVetById(id, firstName, lastName, address, speciality);
    }

    @Override
    public void deleteVetById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id is invalid.");
        }
        vetRepository.deleteById(id);
    }


}

