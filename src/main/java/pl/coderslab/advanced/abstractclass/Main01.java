package pl.coderslab.advanced.abstractclass;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(220, "Volkswagen", "osobowy"));
        vehicles.add(new Train(400, "pendolino", 1435));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
