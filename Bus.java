package Lab1;

public class Bus extends Vehicle
{
    private int seatingCapacity;
    private String color;

    public Bus(int seatingCapacity, String color)
    {
        super(make, model, type);
        this.seatingCapacity = seatingCapacity;
        this.color = color;
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();

        System.out.println("Seating Capacity: "+ this.seatingCapacity +", Color: "+ this.color);
    };

    public void openSideDoor()
    {
        System.out.println("Side door is opened");
    }

    public void closeSideDoor()
    {
        System.out.println("Side door is closed");
    }

    public int getSeatingCapacity()
    {
        return this.seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity)
    {
        this.seatingCapacity = seatingCapacity;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}