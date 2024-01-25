package Vehicle;

public class Trailer extends Vehicle 
{
    private int numberOfWheels;
    private int loadCapability;

    public Trailer(int numberOfWheels, int loadCapability)
    {
        super(make, model, type);
        this.numberOfWheels = numberOfWheels;
        this.loadCapability = loadCapability;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Number of Wheels: "+ this.numberOfWheels +", Load Capability: "+ this.loadCapability);
    }

    public void attachTrailer()
    {
        System.out.println("Trailer Load Attached");
    }

    public void detachTrailer()
    {
        System.out.println("Trailer Load Detached");
    }

    public int getNumberOfWheels()
    {
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels)
    {
        this.numberOfWheels = numberOfWheels;
    }

    public String getLoadCapability()
    {
        return this.loadCapability;
    }

    public void setLoadCapability(int loadCapability)
    {
        this.loadCapability = loadCapability;
    }    
}
