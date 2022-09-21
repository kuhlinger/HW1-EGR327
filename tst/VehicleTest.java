import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

// TEST FOR VEHICLE INFORMATION
public class VehicleTest {

        @Test
        public void Test() {
            // Arrange

            // create list to store vehicle information
            List<Vehicle> allVehicles = new ArrayList<>();

            // establish 2 different types of vehicles
            Vehicle vehicle1 = new Vehicle("Honda", "Civic", 2014, false, 7000, 28);
            Vehicle vehicle2 = new Vehicle("Chevy", "Silverado", 2020, true, 23000, 22);

            // establish 2 different types of cars
            Car car1 = new Car("Subaru", "Legacy",2011 , true, 5500,25, false);
            Car car2 = new Car("Mazda", "Miata", 2022, false, 27650,35 , true);

            // establish 2 different types of trucks
            Truck truck1 = new Truck("Nissan", "Titan",2017 , false, 29580,18 , false, 9000);
            Truck truck2 = new Truck("RAM", "1500", 2022, true,36500 , 23, true, 7000);

            // add all the types of vehicles (including the cars and trucks) to the vehicles list
            allVehicles.add(vehicle1);
            allVehicles.add(vehicle2);
            allVehicles.add(car1);
            allVehicles.add(car2);
            allVehicles.add(truck1);
            allVehicles.add(truck2);

            // create a new string that will have the expected result of each vehicle's information
            String[] expectedResult = new String[allVehicles.size()];

            expectedResult[0] = "2014 Honda Civic\nNo 4WD\n$7000\n28MPG";
            expectedResult[1] = "2020 Chevy Silverado\n4WD\n$23000\n22MPG";
            expectedResult[2] = "2011 Subrau Legacy\n4WD\n$5500\n25MPG\nNot Convertible";
            expectedResult[3] = "2022 Mazda Miata\nNo 4WD\n$27650\n35MPG\nConvertible";
            expectedResult[4] = "2017 Nissan Titan\nNo 4WD\n$29580\n18MPG\nNo side step\n9000";
            expectedResult[5] = "2022 RAM 1500\n4WD\n$36500\n23MPG\nHas side step\n7000";

            // Act
            // check the results
            for (Vehicle vehicle : allVehicles) {
                if (vehicle instanceof Car) {
                    ((Car) (vehicle)).printVehicle();
                } else if (vehicle instanceof Truck) {
                    ((Truck) (vehicle)).printVehicle();
                } else {
                    vehicle.printVehicle();
                }
            }

            // Assert
            // if there is something wrong output a message saying so
            for (int i = 0; i < allVehicles.size(); i++) {
                assertEquals("Sorry something is wrong!", expectedResult[i], allVehicles.get(i).toString());
            }
        }
}
