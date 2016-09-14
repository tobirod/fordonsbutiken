package fordonsbutiken;

public class motorcycle extends motorized {
     
    Boolean sideCarAvailable;
    int numberOfWheels;
    
    public motorcycle(int modelOfYear, String vehicleBrand, String color, double horsePower, Boolean brandNew, String fuelType, int numberOfPassengers, int numberOfWheels, Boolean sideCarAvailable) {
        
        this.modelOfYear = modelOfYear;
        this.vehicleBrand = vehicleBrand;
        this.color = color;
        this.horsePower = horsePower;
        this.brandNew = brandNew;
        this.fuelType = fuelType;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
        this.sideCarAvailable = sideCarAvailable;
        
    }
        
}
