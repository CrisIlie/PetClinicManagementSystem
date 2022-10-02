package com.sda.cristinailie.petclinic.repository;

import com.sda.cristinailie.petclinic.model.Pet;

import java.sql.Date;

public interface PetRepository extends BaseRepository<Pet>  {

    void createPet(String race, Date birthdate, boolean isVaccinated, String ownerName);

    void updatePet(int id, String race, Date birthdate, boolean isVaccinated, String ownerName);

}
