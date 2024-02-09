package Lab1;

import Vehicle.Vehicle.ElectricVehicle;

public class ElectricCar extends ElectricVehicle implements ElectricVehicle
{
    private int currentChargeTime;
    
    @Override
    public void charge()
    {
        currentChargeTime = MAX_CHARGE_TIME;

        System.out.println("Charging for "+ currentChargeTime +" hours");
    }

    @Override
    public String batteryType()
    {
        return "Lithium-Ion";
    }
}
