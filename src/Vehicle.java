public class Vehicle
{
    // create the variables for all information needed
    private String make;
    private String model;
    private int year;
    private boolean fwd;
    private int price;
    private int mileage;

    // constructor to make general vehicle
    public Vehicle(String make, String model, int year, boolean fwd, int price, int mileage) {
        // get the variables from above
        this.make = make;
        this.model = model;
        this.year = year;
        this.fwd = fwd;
        this.price = price;
        this.mileage = mileage;
    }

    // method to print all the information
    public String printVehicle() {

        System.out.println(year + " " + make + " " + model);
        if(fwd)
            System.out.println("4WD");
        else
            System.out.println("No 4WD");
        System.out.println("$" + price);
        System.out.println(mileage + "MPG");
        return null;
    }

    //getters and setters for the variables

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isFwd() {
        return fwd;
    }

    public void setFwd(boolean fwd) {
        this.fwd = fwd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}