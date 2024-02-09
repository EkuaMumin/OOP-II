package Lab1;

import Vehicle.Vehicle.LandVehicle;

public class Car extends Vehicle implements LandVehicle
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

    @Override
    public void drive()
    {
        System.out.println("A car drives on the road");
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
