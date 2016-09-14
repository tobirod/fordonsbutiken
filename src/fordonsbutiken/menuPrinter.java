package fordonsbutiken;

public class menuPrinter {
    
    
    // STARTMENU STARTS
    
    
    public static void startMenuGreeting() {
        
        System.out.println("\nHej, och välkommen till Fordonsbutiken!");
        System.out.println("Skriv den siffra som motsvarar ditt val, och bekräfta med Enter-knappen.");
        
    }

    public static void startMenuPrint() {
        
        System.out.println("\nVad vill du göra?\n");
        
        System.out.println("1 - Utforska listan över fordon.");
        System.out.println("2 - Lägg till fordon i listan.");
        System.out.println("3 - Ta bort fordon i listan.");
        
        System.out.println("_____________________________________________\n");
        
    }
    
    
    // STARTMENU ENDS, EXPLORE STARTS
    
    
    public static void exploreVehiclePrint() {
        
        System.out.println("\nVill du se motordrivna fordon? \n");
        
        System.out.println("1 - Ja.");
        System.out.println("2 - Nej.\n");
        System.out.println("3 - Tillbaka ett steg.");
        
        System.out.println("_____________________________________________\n");
        
    }
    
    public static void exploreMotorizedVehiclePrint() {
        
        System.out.println("\nVilken sorts fordon vill du se?\n");
        
        System.out.println("1 - Personbilar.");
        System.out.println("2 - Motorcyklar.");
        System.out.println("3 - Lastbilar.\n");
        System.out.println("4 - Tillbaka ett steg.");
        
        System.out.println("_____________________________________________\n");
        
    }
    
    public static void exploreNonMotorizedVehiclePrint() {
        
        System.out.println("\nVilken sorts fordon vill du se?\n");
        
        
        System.out.println("1 - Cyklar.");
        System.out.println("2 - Segelbåtar. \n");
        System.out.println("3 - Tillbaka ett steg.\n");
        
        System.out.println("_____________________________________________\n");
        
    }
        
    
    // EXPLORE ENDS, ADD STARTS
    
    public static void addVehiclePrint() {
        
        System.out.println("\nÄr fordonet du vill lägga till motordrivet? \n");
        
        System.out.println("1 - Ja.");
        System.out.println("2 - Nej.\n");
        System.out.println("3 - Tilbaka ett steg.");
        
        System.out.println("_____________________________________________\n");
        
    }
    
    public static void addMotorizedVehiclePrint() {
        
        System.out.println("\nVilken sorts fordon vill du lägga till?\n");
        
        System.out.println("1 - Personbil.");
        System.out.println("2 - Motorcykel.");
        System.out.println("3 - Lastbil.\n");
        System.out.println("4 - Tillbaka ett steg.");
        
        System.out.println("_____________________________________________\n");
        
    }
    
    public static void addNonMotorizedVehiclePrint() {
        
        System.out.println("\nVilken sorts fordon vill du lägga till?\n");
        
        
        System.out.println("1 - Cykel.");
        System.out.println("2 - Segelbåt. \n");
        System.out.println("3 - Tillbaka ett steg.\n");
        
        System.out.println("_____________________________________________\n");
        
    }
    
    
    // ADD ENDS, REMOVE STARTS
    
    
    public static void removeVehiclePrint() {
        
        System.out.println("\nÄr fordonet du vill ta bort motordrivet?\n");
        
        System.out.println("1 - Ja.");
        System.out.println("2 - Nej.\n");
        System.out.println("3 - Tilbaka ett steg.");
        
        System.out.println("_____________________________________________\n");
        
    }
    
    public static void removeMotorizedVehiclePrint() {
        
        System.out.println("\nVilken sorts fordon vill du ta bort?\n");
        
        System.out.println("1 - Personbil.");
        System.out.println("2 - Motorcykel.");
        System.out.println("3 - Lastbil.\n");
        System.out.println("4 - Tillbaka ett steg.");
        
        System.out.println("_____________________________________________\n");
        
    }
    
    public static void removeNonMotorizedVehiclePrint() {
        
        System.out.println("\nVilken sorts fordon vill du ta bort?\n");
        
        
        System.out.println("1 - Cykel.");
        System.out.println("2 - Segelbåt. \n");
        System.out.println("3 - Tillbaka ett steg.\n");
        
        System.out.println("_____________________________________________\n");
        
    } 
    
    
    // REMOVE ENDS, MISCELLANOUS STARTS
    
    
    public static void varNotInMenu() {
        
        System.out.println("\nSiffran motsvarar inte ett val i menyn!");
        System.out.println("Skriv den siffra som motsvarar ditt val, och bekräfta med Enter-knappen.");
        
    }
    
    public static void endProgramPrint() {
        
        System.out.println("\nKlart! Vill du fortsätta?\n");
        
        
        System.out.println("1 - Ja.");
        System.out.println("2 - Nej.\n");
        
        System.out.println("_____________________________________________\n");
        
    } 
    
}