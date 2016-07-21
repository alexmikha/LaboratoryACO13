package main.java.model;

import java.time.LocalDate;

/**
 * Created by mikhailov on 17.07.16.
 */
public class Patient extends User{

    public Patient(String name, String surname, LocalDate dateOfBirth, String phoneNumber, String email) {
        super(name, surname, dateOfBirth, phoneNumber, email);
    }
}
