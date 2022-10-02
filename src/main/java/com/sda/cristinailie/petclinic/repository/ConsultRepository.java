package com.sda.cristinailie.petclinic.repository;

import com.sda.cristinailie.petclinic.model.Consult;
import com.sda.cristinailie.petclinic.model.Pet;
import com.sda.cristinailie.petclinic.model.Vet;

import java.sql.Date;

public interface ConsultRepository extends BaseRepository<Consult> {
    void createConsult(Vet vet, Pet pet, Date date, String description);
}
