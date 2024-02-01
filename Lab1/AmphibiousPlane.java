package Lab1;

import Vehicle.Vehicle.AirVehicle;
import Vehicle.Vehicle.Amphibious;

public class AmphibiousPlane implements Amphibious, AirVehicle 
{
    @Override
    public void dock()
    {
        System.out.println("Amphibious plane is docking");
    }    

    @Override
    public void launch()
    {
        System.out.println("Amphibious plane is launching");
    }

    @Override
    public void fly()
    {
        System.out.println("Amphibious plane is flying");
    }
}
