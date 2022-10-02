package com.sda.cristinailie.petclinic.controller;

import com.sda.cristinailie.petclinic.service.ConsultService;

import java.sql.Date;
import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConsultController {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    private final Scanner scanner = new Scanner(System.in);
    private final ConsultService consultService;

    public ConsultController(ConsultService consultService) {
        this.consultService = consultService;
    }

    public void createConsult(){
        try {
            System.out.println("please insert vet Id: ");
            int vetId = Integer.parseInt(scanner.nextLine());
            System.out.println("Please insert pet Id: ");
            int petId = Integer.parseInt(scanner.nextLine());
            System.out.println("Please insert consult date: ");
            Date date = Date.valueOf(LocalDate.parse(scanner.nextLine(), FORMATTER));
            System.out.println("Please insert consult description: ");
            String description = scanner.nextLine();

            consultService.createConsult(vetId, petId, date, description);
        }catch(IllegalArgumentException | DateTimeException e){
            System.out.println("Invalid data " + e.getMessage());
        }catch(Exception e){
            System.out.println("Internal server error " + e.getMessage());
        }
    }

}
