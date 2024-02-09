package Lab1;
public class Vehicle
{
    private String make;
    private String model;
    private String type;

    public Vehicle(String make, String model, String type)
    {
        this.make = make;
        this.model = model;
        this.type = type;
    }

    public void displayInfo()
    {
        System.out.println("Vehicle Make: "+ make +", Model: "+ model +", Type: "+ type);
    }

    public String getVehicleMake()
    {
        return this.make;
    }

    public void setVehicleMake(String make)
    {
        this.make = make;
    }

    public String getVehicleModel()
    {
        return this.model;
    }

    public void setVehicleModel(String model)
    {
        this.model = model;
    }

    public String getVehicleType()
    {
        return this.type;
    }

    public void setVehicleType(String type)
    {
        this.type = type;
    }

    public interface LandVehicle {
        void drive();
    }
    
    public interface SeaVehicle {
        void sail();
    }
    
    public interface AirVehicle {
        void fly();
    }

    public interface Amphibious
    {
        void dock();

        void launch();
    }

    public interface ElectricVehicle
    {
        int MAX_CHARGE_TIME = 8;
        
        void charge();
    }
}