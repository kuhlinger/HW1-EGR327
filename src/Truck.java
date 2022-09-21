class Truck extends Vehicle
{
    private boolean hasStep;
    private double tow;

    //constructor
    public Truck(String make, String model, int year, boolean fwd, float price, int mileage, boolean hasStep, double tow)
    {
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

    public double getTow() {
        return tow;
    }

    public void setTow(double tow) {
        this.tow = tow;
    }

    //print method
    public String printVehicle()
    {
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