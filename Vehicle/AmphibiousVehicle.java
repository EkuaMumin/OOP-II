package Lab1;

import Vehicle.Vehicle.SeaVehicle;

public class AmphibiousVehicle implements LandVehicle, SeaVehicle
{
    @Override
    public void drive()
    {
        System.out.println("An amphibious Vehicle can drive on land");
    }   

    @Override
    public void sail()
    {
        System.out.println("An Amphibious Vehicle can sail in water");
    }
}
