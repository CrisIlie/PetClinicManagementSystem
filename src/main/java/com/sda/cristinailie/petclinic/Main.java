package com.sda.cristinailie.petclinic;

import com.sda.cristinailie.petclinic.controller.VetController;
import com.sda.cristinailie.petclinic.repository.VetRepositoryImpl;
import com.sda.cristinailie.petclinic.service.VetServiceImpl;
import com.sda.cristinailie.petclinic.utils.SessionManager;
import com.sda.cristinailie.petclinic.utils.UserOption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();

        VetController vetController = new VetController(new VetServiceImpl(new VetRepositoryImpl()));

        UserOption userOption;
        Scanner scanner = new Scanner(System.in);
        do {
            UserOption.displayAllOptions();
            System.out.println("Please select an option: ");
            int numericOption = scanner.nextInt();
            userOption = UserOption.findByNumericOption(numericOption);
            switch (userOption) {
                case ADD_VET:
                    vetController.createVet();
                    break;
                case VIEW_ALL_VETS:
                    vetController.showAllVets();
                    break;
                case UNKNOWN:
                    System.err.println("Invalid option selected!");
                case EXIT:
                    System.out.println("Goodbye!");
                    break;
            }

        } while (userOption != UserOption.EXIT);

        SessionManager.shutDown();

    }
}