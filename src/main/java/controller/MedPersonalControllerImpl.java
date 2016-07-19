package main.java.controller;

import main.java.db.LaboratoryDB;
import main.java.exceptions.LoginException;
import main.java.exceptions.RegisterException;
import main.java.model.MedPersonal;
import main.java.model.Position;

import java.time.LocalDate;

/**
 * Created by mikhailov on 17.07.16.
 */
public class MedPersonalControllerImpl implements MedPersonalController{

    private LaboratoryDB db;
    private MedPersonal medPersonal;

    public MedPersonalControllerImpl(LaboratoryDB db) {
        this.db = db;
    }

    @Override
    public MedPersonal logIn(String login, String password) throws LoginException {

//        todo validation

        this.medPersonal =  db.logIn(login, password);
        return medPersonal;

    }

    @Override
    public boolean register(String name, String surname, LocalDate dateOfBirth, String phoneNumber, String email, String login, String pass, Position position) throws RegisterException {
        this.medPersonal = db.saveMedPerson(name, surname, dateOfBirth, phoneNumber, email, login, pass, position);
        return true;
    }

    public LaboratoryDB getDb() {
        return db;
    }

    public void setDb(LaboratoryDB db) {
        this.db = db;
    }
}
