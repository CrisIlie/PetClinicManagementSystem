package com.sda.cristinailie.petclinic.utils;

import com.sda.cristinailie.petclinic.model.Consult;
import com.sda.cristinailie.petclinic.model.Pet;
import com.sda.cristinailie.petclinic.model.Vet;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager extends AbstractSessionManager {

    private static final SessionManager INSTANCE = new SessionManager();
    private SessionManager(){

    }
    public static SessionFactory getSessionFactory(){
        return INSTANCE.getSessionFactory("pet_clinic");
    }

    public static void shutDown(){
        INSTANCE.shutdownSessionManager();
    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
      configuration.addAnnotatedClass(Vet.class);
      configuration.addAnnotatedClass(Pet.class);
      configuration.addAnnotatedClass(Consult.class);

    }
}
