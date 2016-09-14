package fordonsbutiken;

import java.util.ArrayList;

public class fordonsbutiken {
    
    ArrayList<vehicles> fordonsbutiken = new ArrayList<vehicles>();
    
    public void addToList() {
        
        fordonsbutiken.add(new motorcycle(1999, "Ducati", "Yellow", 50.5, true, "Gas", 2, 2, false));
        
    }
    
    // int modelOfYear, String vehicleBrand, String color, double horsePower, Boolean brandNew, String fuelType, int numberOfPassengers, int numberOfWheels, Boolean sideCarAvailable
    
    public void exploreMotorcycleList() {
        
        System.out.println("\n" + ((motorcycle)fordonsbutiken.get(0)).vehicleBrand);
        
    }
    
}