package main.java.view;

import main.java.db.LaboratoryDB;
import main.java.model.MedPersonal;

import javax.swing.*;

/**
 * Created by mi on 19.07.2016.
 */
public class AssistantFrame extends JFrame{

    public AssistantFrame(MedPersonal result, LaboratoryDB db) {
        setTitle("AssistantFrame");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
