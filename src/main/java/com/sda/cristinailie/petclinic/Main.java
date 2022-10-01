package com.sda.cristinailie.petclinic;

import com.sda.cristinailie.petclinic.utils.SessionManager;

public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();
        SessionManager.shutDown();

    }
}