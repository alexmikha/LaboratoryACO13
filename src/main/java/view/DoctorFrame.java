package main.java.view;

import main.java.db.LaboratoryDB;
import main.java.model.MedPersonal;

import javax.swing.*;

/**
 * Created by gorobec on 17.07.16.
 */
public class DoctorFrame extends JFrame{


    public DoctorFrame(MedPersonal result, LaboratoryDB db) {

        setTitle("DoctorFrame");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
