package main.java.db;

import main.java.exceptions.LoginException;
import main.java.exceptions.RegisterException;
import main.java.model.*;

import java.time.LocalDate;
import java.util.*;

public class LaboratoryDB {

    private Map<String, Report> reports = new HashMap<>();
    private Queue<String> newReportsID = new PriorityQueue<>();
    private Map<MedPersonal, List<String>> assistantsReportsId = new HashMap<>();
    private Map<MedPersonal, List<String>> doctorsReportsId = new HashMap<>();
    private Map<String, MedPersonal> medPersonalsByLogin = new HashMap<>();
    private Map<Patient, List<String>> patientsReports = new HashMap<>();


    public MedPersonal logIn(String login, String password) throws LoginException {
        MedPersonal foundPerson = medPersonalsByLogin.get(login);
        if(foundPerson == null || !password.equals(foundPerson.getPass())){
            throw new LoginException("Wrong login or password!");
        }
        return foundPerson;
    }


    public MedPersonal saveMedPerson(String name, String surname, LocalDate dateOfBirth, String phoneNumber,
                                     String email, String login, String pass, Position position) throws RegisterException {

        if(medPersonalsByLogin.containsKey(login)) throw new RegisterException("Login is exist, try another login");
        MedPersonal medPersonal = new MedPersonal(name, surname, dateOfBirth, phoneNumber, email, login, pass, position);
        medPersonalsByLogin.put(login, medPersonal);
        return medPersonal;
    }

    public static LaboratoryDB create() {
        return null;
    }

    public Map<String, Report> getReports() {
        return reports;
    }

    public void setReports(Map<String, Report> reports) {
        this.reports = reports;
    }

    public Queue<String> getNewReportsID() {
        return newReportsID;
    }

    public void setNewReportsID(Queue<String> newReportsID) {
        this.newReportsID = newReportsID;
    }

    public Map<MedPersonal, List<String>> getAssistantsReportsId() {
        return assistantsReportsId;
    }

    public void setAssistantsReportsId(Map<MedPersonal, List<String>> assistantsReportsId) {
        this.assistantsReportsId = assistantsReportsId;
    }

    public Map<MedPersonal, List<String>> getDoctorsReportsId() {
        return doctorsReportsId;
    }

    public void setDoctorsReportsId(Map<MedPersonal, List<String>> doctorsReportsId) {
        this.doctorsReportsId = doctorsReportsId;
    }

    public Map<String, MedPersonal> getMedPersonalsByLogin() {
        return medPersonalsByLogin;
    }

    public void setMedPersonalsByLogin(Map<String, MedPersonal> medPersonalsByLogin) {
        this.medPersonalsByLogin = medPersonalsByLogin;
    }

    public Map<Patient, List<String>> getPatientsReports() {
        return patientsReports;
    }

    public void setPatientsReports(Map<Patient, List<String>> patientsReports) {
        this.patientsReports = patientsReports;
    }
}
