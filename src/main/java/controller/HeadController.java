package main.java.controller;

import main.java.exceptions.RegisterException;
import main.java.model.Position;

import java.time.LocalDate;

/**
 * Created by mikhailov on 17.07.16.
 */
public interface HeadController extends DoctorController {
    boolean register(String name, String surname, LocalDate dateOfBirth, String phoneNumber,
                     String email,  String login, String pass, Position position) throws RegisterException;
}
