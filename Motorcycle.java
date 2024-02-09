package Lab1;

public class Motorcycle extends Vehicle
{
    private String topSpeed;
    private String engineCapacity;

    public Motorcycle(String topSpeed, String engineCapacity)
    {
        super(make, model, type);
        this.topSpeed = topSpeed;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Top Speed: "+ this.topSpeed +", Engine Capacity: "+ this.engineCapacity);
    };

    public void turnLeft()
    {
        System.out.println("Steering turned to the left");
    }

    public void turnRight()
    {
        System.out.println("Steering turned to the right");
    }

    public String getTopSpeed()
    {
        return this.topSpeed;
    }

    public void setTopSpeed(String topSpeed)
    {
        this.topSpeed = topSpeed;
    }

    public String getEngineCapacity()
    {
        return this.engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity)
    {
        this.engineCapacity = engineCapacity;
    }
}