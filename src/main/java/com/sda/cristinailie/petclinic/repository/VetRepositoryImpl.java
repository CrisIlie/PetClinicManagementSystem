package com.sda.cristinailie.petclinic.repository;

import com.sda.cristinailie.petclinic.model.Vet;
import com.sda.cristinailie.petclinic.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class VetRepositoryImpl extends BaseRepositoryImpl<Vet> implements VetRepository {

    public VetRepositoryImpl() {
        super(Vet.class);
    }

    @Override
    public void createVet(String firstName, String lastName, String address, String speciality) {
        Vet vet = new Vet();
        vet.setFirstName(firstName);
        vet.setLastName(lastName);
        vet.setAddress(address);
        vet.setSpeciality(speciality);
        create(vet);
    }


    @Override
    public void updateVetById(int id, String firstName, String lastName, String address, String speciality) {
        Vet vet = new Vet();
        vet.setId(id);
        vet.setFirstName(firstName);
        vet.setLastName(lastName);
        vet.setAddress(address);
        vet.setSpeciality(speciality);
        updateById(id, vet);
    }


}
