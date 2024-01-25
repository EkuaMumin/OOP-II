package Vehicle;

public class Car extends Vehicle 
{
    private int numberOfDoors;
    private String engineType;

    public Car(String make, String model, String type, int numberOfDoors, String engineType)
    {
        super(make, model, type);
        this.numberOfDoors = numberOfDoors;
        this.engineType = engineType;
    }

    @Override
    public void displayInfo() 
    {
        // Calling Vehicle's displayInfo() method to display car details'
        super.displayInfo();

        System.out.println("Number of Doors: "+ numberOfDoors +", Engine Type: "+ engineType);
    }

    public int getNumberOfDoors()
    {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;
    }

    public String getEngineType()
    {
        return this.engineType;
    }

    public void setEngineType(String engineType)
    {
        this.engineType = engineType;
    }
}
