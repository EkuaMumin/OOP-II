package Lab1;

public class VehicleRentalService
{
    // Rent a Car
    public void rentVehicle(Car car, int rentalDuration, boolean insuranceIncluded)
    {
        System.out.println("Renting a car for " + rentalDuration + " days. Insurance included? " + (insuranceIncluded ? "YES" : "NO"));
    }

    // Rent a Bus
    public void rentVehicle(Bus bus, int rentalDuration, boolean insuranceIncluded)
    {
        System.out.println("Renting a bus for " + rentalDuration + " days. Insurance included? " + (insuranceIncluded ? "YES" : "NO"));
    }

    // Rent a Boat
    public void rentVehicle(Boat boat, int rentalDuration, boolean insuranceIncluded)
    {
        System.out.println("Renting a boat for " + rentalDuration + " days. Insurance included? " + (insuranceIncluded ? "YES" : "NO"));
    }
}

