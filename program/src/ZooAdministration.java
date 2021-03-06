import connectors.SQLZooData;
import connectors.UserSystemInterface;
import interfaces.ZooAdmDAO;

import java.util.ArrayList;

public class ZooAdministration {

    private static ZooAdmDAO zooAdmin = new SQLZooData();
    private static connectors.UserSystemInterface userInterface;

    public static void main(String[] args) {

        ArrayList<classes.Animals> animals = zooAdmin.getAnimals();
        ArrayList<classes.Compound> compounds = zooAdmin.getCompound();
        ArrayList<classes.Staff> staff = zooAdmin.getStaff();
        userInterface = new UserSystemInterface(animals, staff, compounds, zooAdmin);
        userInterface.menu();

    }
}
