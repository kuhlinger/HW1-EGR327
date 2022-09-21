class Vehicle
{
    private String make;
    private String model;
    private int year;
    private boolean fwd;
    private float price;
    private int mileage;

    //constructor
    public Vehicle(String make, String model, int year, boolean fwd, float price, int mileage)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fwd = fwd;
        this.price = price;
        this.mileage = mileage;
    }
    //print method
    public String printVehicle()
    {
        System.out.println(year+" "+make+" "+model);
        if(fwd)
            System.out.println("4WD");
        else
            System.out.println("No 4WD");
        System.out.println("$"+price);
        System.out.println(mileage+"MPG");
        return null;
    }
    //getters and setters


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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}