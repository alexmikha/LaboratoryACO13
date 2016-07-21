import main.java.controller.MedPersonalController;
import main.java.controller.MedPersonalControllerImpl;
import main.java.db.LaboratoryDB;
import main.java.exceptions.RegisterException;
import main.java.model.Position;
import main.java.utils.DBUtils;

import java.io.IOException;
import java.time.LocalDate;

/**
 * Created by mikhailov on 17.07.16.
 */
public class LabBeta {
    public static void main(String[] args) throws RegisterException, IOException {

        LaboratoryDB db = new LaboratoryDB();
        MedPersonalController controller = new MedPersonalControllerImpl(db);

        controller.register("Adam", "Smith", LocalDate.of(0, 1, 1), "+38093777-77-77", "adam@gmail.com", "admin", "admin", Position.HEAD);
        controller.register("House", "Laurie", LocalDate.of(0, 2, 2), "+38093888-88-88", "xouse@gmail.com", "doctor", "doctor", Position.DOCTOR);
        controller.register("Assist", "Assist", LocalDate.of(0, 1, 3), "+38093999-99-99", "assist@gmail.com", "assis", "assis", Position.ASSISTANT);
        DBUtils.save(db);
    }
}
