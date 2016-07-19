package main.java.view;

import main.java.db.LaboratoryDB;
import main.java.model.MedPersonal;

import javax.swing.*;

/**
 * Created by mi on 19.07.2016.
 */
public class HeadFrame extends JFrame{

    public HeadFrame(MedPersonal result, LaboratoryDB db) {
        setTitle("HeadFrame");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
