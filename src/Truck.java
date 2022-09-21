class Truck extends Vehicle
{
    // create variables for the side step and towing capacity
    private boolean hasStep;
    private double tow;

    // constructor that adds boolean if there is a side step and the int towing capacity
    public Truck(String make, String model, int year, boolean fwd, int price, int mileage, boolean hasStep, int tow) {

        super(make, model, year, fwd, price, mileage);
        this.hasStep = hasStep;
        this.tow = tow;
    }

    //getters and setters

    public boolean isHasStep() {
        return hasStep;
    }

    public void setHasStep(boolean hasStep) {
        this.hasStep = hasStep;
    }

    public int getTow() {
        return (int) tow;
    }

    public void setTow(int tow) {
        this.tow = tow;
    }

    // method that prints the vehicle info with side step and towing capacity addition
    public String printVehicle() {

        System.out.println(this.getYear()+" "+this.getMake()+" "+this.getMake());
        if(this.isFwd())
            System.out.println("4WD");
        else
            System.out.println("No 4WD");
        System.out.println("$"+this.getPrice());
        System.out.println(this.getMileage()+"MPG");
        if(this.isHasStep())
            System.out.println("Has Side Step");
        else
            System.out.println("No Side Step");
        System.out.println(this.getTow());

        return null;
    }
}