class Car extends Vehicle
{
    private boolean convert;

    //constructor
    public Car(String make, String model, int year, boolean fwd, float price, int mileage, boolean convert)
    {
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

    //print method
    public String printVehicle() {
    System.out.println(this.getYear() + " " + this.getMake() + " " + this.getModel());
        if (this.isFwd())
            System.out.println("4WD");
        else
            System.out.println("No 4WD");
        System.out.println("$" + this.getPrice());
        System.out.println(this.getMileage() + "MPG");
        if (this.isConvert())
            System.out.println("Convertable");
        else
            System.out.println("Not Convertable");
        return null;
    }
}