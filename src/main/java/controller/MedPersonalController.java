package main.java.controller;

import main.java.exceptions.LoginException;
import main.java.exceptions.RegisterException;
import main.java.model.MedPersonal;
import main.java.model.Position;
import main.java.utils.DBUtils;

import java.time.LocalDate;

/**
 * Created by mikhailov on 17.07.16.
 */
public interface MedPersonalController {

    MedPersonal logIn(String login, String password) throws LoginException;

    boolean register(String name, String surname, LocalDate dateOfBirth, String phoneNumber,
                         String email,  String login, String pass, Position position) throws RegisterException;


}
