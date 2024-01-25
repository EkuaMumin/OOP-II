package Vehicle;

public class Boat extends Vehicle
{
    private int numberOfEngines;
    private int horsepower;

    public Boat(int numberOfEngines, int horsepower)
    {
        super(make, model, type);
        this.numberOfEngines = numberOfEngines;
        this.horsepower = horsepower
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();

        System.out.println("Number of Engines: "+ this.numberOfEngines +", Horsepower: "+ this.horsepower);
    };

    public void dockBoat()
    {
        System.out.println("The boat is docked");
    }

    public void undockBoat()
    {
        System.out.println("The boat is undocked");
    }

    public int getNumberOfEngines()
    {
        return this.numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines)
    {
        this.numberOfEngines = numberOfEngines;
    }

    public int getHorsepower()
    {
        return this.horsepower;
    }

    public void setHorsepower(int horsepower)
    {
        this.horsepower = horsepower;
    }
}
