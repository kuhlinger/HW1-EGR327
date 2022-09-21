class Car extends Vehicle
{
    // create variable for convertible
    private boolean convert;

    // constructor that adds a boolean variable if the car is a convertible
    public Car(String make, String model, int year, boolean fwd, int price, int mileage, boolean convert) {

        super(make, model, year, fwd, price, mileage);
        this.convert = convert;
    }

    //getters and setters

    public boolean isConvert() {
        return convert;
    }

    public void setConvert(boolean convert) {
        this.convert = convert;
    }

    // method that prints the vehicle info with convertible addition
    public String printVehicle() {
    System.out.println(this.getYear() + " " + this.getMake() + " " + this.getModel());
        if (this.isFwd())
            System.out.println("4WD");
        else
            System.out.println("No 4WD");
        System.out.println("$" + this.getPrice());
        System.out.println(this.getMileage() + "MPG");
        if (this.isConvert())
            System.out.println("Convertible");
        else
            System.out.println("Not Convertible");
        return null;
    }
}