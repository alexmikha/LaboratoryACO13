import controller.MedPersonalControllerImpl;
import db.LaboratoryDB;
import utils.DBUtils;
import view.LoginPassFrame;

import javax.swing.*;
import java.io.IOException;

public class RunApp {
    public static void main(String[] args) {

        LaboratoryDB laboratoryDB = null;
        try {
            laboratoryDB = DBUtils.read();
            new LoginPassFrame(new MedPersonalControllerImpl(laboratoryDB));
        } catch (IOException e) {
            e.printStackTrace();
           JOptionPane.showMessageDialog(null,
            e.getMessage(),
                    e.getClass().getName(),
                    JOptionPane.ERROR_MESSAGE);
        }


    }

}
