package main.java;

import main.java.controller.MedPersonalControllerImpl;
import main.java.db.LaboratoryDB;
import main.java.utils.DBUtils;
import main.java.view.LoginPassFrame1;

import java.io.IOException;

public class RunApp {
    public static void main(String[] args) {


        LaboratoryDB laboratoryDB;
        try {
            laboratoryDB = DBUtils.read();
            LoginPassFrame1 loginPassFrame = new LoginPassFrame1(new MedPersonalControllerImpl(laboratoryDB));
        } catch (IOException e) {
            e.printStackTrace();
//            todo can't connect to server frame
        }


    }

}
