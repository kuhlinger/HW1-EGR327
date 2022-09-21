public class Main {

    public static void main(String[] args) {

        Car car= new Car("Honda", "Civic",2014,false,7000, 28, false);
        Truck truck= new Truck("Chevy","Silverado",2020,true,23000,22, false,10000);

        System.out.println(car.printVehicle());
        System.out.println();
        System.out.println(truck.printVehicle());

    }
}
