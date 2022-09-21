import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // create one car and one truck for the base vehicles
        Vehicle vehicle1 = new Car("Honda", "Civic", 2014, false, 7000, 28, false);
        Vehicle vehicle2 = new Truck("Chevy", "Silverado", 2020, true, 23000, 22, false, 10000);

        // create an array list to hold the vehicles and add them
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        // print out the information for each of the vehicles
        for (Vehicle vehicle : vehicles){
            vehicle.printVehicle();
            System.out.println();
        }
    }
}
