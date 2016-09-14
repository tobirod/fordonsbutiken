package fordonsbutiken;

import java.util.Scanner;

public class menu {
    
    private static Scanner userInput = new Scanner(System.in);
    public static fordonsbutiken vehicleInventory = new fordonsbutiken();
    
    
    // STARTMENU STARTS
    
    
    public static void startMenu(){
        
            int userChoice = userInput.nextInt();
            
                switch (userChoice) {

                    case 1:  menuPrinter.exploreVehiclePrint();
                             menu.exploreListOfVehicles();
                        break;
                    case 2:  menuPrinter.addVehiclePrint();
                             menu.addVehicleToList();
                        break;
                    case 3:  menuPrinter.removeVehiclePrint();
                             menu.removeVehicleFromList();
                        break;
                    default: menuPrinter.varNotInMenu();
                             menuPrinter.startMenuPrint();
                             menu.startMenu();
                        break;
                }
    }
    
    
    // STARTMENU ENDS, EXPLORE STARTS
    
        
    public static void exploreListOfVehicles() {
        
            int userChoice = userInput.nextInt();

                switch (userChoice) {

                        case 1:  menuPrinter.exploreMotorizedVehiclePrint();
                                 menu.exploreMotorizedVehicleToList();
                            break;
                        case 2:  menuPrinter.exploreNonMotorizedVehiclePrint();
                                 menu.exploreNonMotorizedVehicleToList();
                            break;
                        case 3:  menuPrinter.startMenuPrint();
                                 menu.startMenu();
                            break;
                        default: menuPrinter.varNotInMenu();
                                 menuPrinter.exploreVehiclePrint();
                                 menu.exploreListOfVehicles();
                            break;
                }
    }
            
    public static void exploreMotorizedVehicleToList() {

            int userChoice = userInput.nextInt();

                switch (userChoice) {

                    case 1:  System.out.println("PERSONBILAR");;
                        break;
                    case 2:  vehicleInventory.exploreMotorcycleList();
                             menuPrinter.endProgramPrint();
                             menu.endProgram();
                        break;
                    case 3:  System.out.println("LASTBILAR");;
                        break;
                    case 4:  menuPrinter.exploreVehiclePrint();
                             menu.exploreListOfVehicles();
                        break;
                    default: menuPrinter.varNotInMenu();
                             menuPrinter.exploreMotorizedVehiclePrint();
                             menu.exploreMotorizedVehicleToList();
                        break;
                }

    }
                        
    public static void exploreNonMotorizedVehicleToList() {

        int userChoice = userInput.nextInt();

            switch (userChoice) {

                case 1:  System.out.println("CYKLAR");;
                    break;
                case 2:  System.out.println("SEGELBÅTAR");;
                    break;
                case 3:  menuPrinter.exploreVehiclePrint();
                         menu.exploreListOfVehicles();
                    break;
                default: menuPrinter.varNotInMenu();
                         menuPrinter.exploreNonMotorizedVehiclePrint();
                         menu.exploreNonMotorizedVehicleToList();
                    break;
            }

    }
                        
                        
    // EXPLORE ENDS, ADD STARTS
                        
    
    public static void addVehicleToList() {

        int userChoice = userInput.nextInt();

            switch (userChoice) {

                case 1:  menuPrinter.addMotorizedVehiclePrint();
                         menu.addMotorizedVehicleToList();
                    break;
                case 2:  menuPrinter.addNonMotorizedVehiclePrint();
                         menu.addNonMotorizedVehicleToList();
                    break;
                case 3:  menuPrinter.startMenuPrint();
                         menu.startMenu();
                    break;
                default: menuPrinter.varNotInMenu();
                         menuPrinter.addVehiclePrint();
                         menu.addVehicleToList();
                    break;
            }

    }
            
    public static void addMotorizedVehicleToList() {

        int userChoice = userInput.nextInt();

            switch (userChoice) {

                case 1:  System.out.println("PERSONBIL");;
                    break;
                case 2:  vehicleInventory.addToList();
                         menuPrinter.endProgramPrint();
                         menu.endProgram();
                    break;
                case 3:  System.out.println("LASTBIL");;
                    break;
                case 4:  menuPrinter.addVehiclePrint();
                         menu.addVehicleToList();
                    break;
                default: menuPrinter.varNotInMenu();
                         menuPrinter.addMotorizedVehiclePrint();
                         menu.addMotorizedVehicleToList();
                    break;
            }

    }

    public static void addNonMotorizedVehicleToList() {

        int userChoice = userInput.nextInt();

            switch (userChoice) {

                case 1:  System.out.println("CYKEL");;
                    break;
                case 2:  System.out.println("SEGELBÅT");;
                    break;
                case 3:  menuPrinter.addVehiclePrint();
                         menu.addVehicleToList();
                    break;
                default: menuPrinter.varNotInMenu();
                         menuPrinter.addNonMotorizedVehiclePrint();
                         menu.addNonMotorizedVehicleToList();
                    break;
            }

    }
                        
                        
    // ADD ENDS, REMOVE STARTS
                        
    
    public static void removeVehicleFromList() {

        int userChoice = userInput.nextInt();

            switch (userChoice) {

                case 1:  menuPrinter.removeMotorizedVehiclePrint();
                         menu.removeMotorizedVehicleFromList();
                    break;
                case 2:  menuPrinter.removeNonMotorizedVehiclePrint();
                         menu.removeNonMotorizedVehicleFromList();
                    break;
                case 3:  menuPrinter.startMenuPrint();
                         menu.startMenu();
                    break;
                default: menuPrinter.varNotInMenu();
                         menuPrinter.removeVehiclePrint();
                         menu.removeVehicleFromList();
                    break;
            }

    }
            
    public static void removeMotorizedVehicleFromList() {

        int userChoice = userInput.nextInt();

            switch (userChoice) {

                case 1:  System.out.println("PERSONBIL");;
                    break;
                case 2:  System.out.println("MOTORCYKEL");;
                    break;
                case 3:  System.out.println("LASTBIL");;
                    break;
                case 4:  menuPrinter.removeVehiclePrint();
                         menu.removeVehicleFromList();
                    break;
                default: menuPrinter.varNotInMenu();
                         menuPrinter.removeMotorizedVehiclePrint();
                         menu.removeMotorizedVehicleFromList();
                    break;
            }

    }

    public static void removeNonMotorizedVehicleFromList() {

        int userChoice = userInput.nextInt();

            switch (userChoice) {

                case 1:  System.out.println("CYKEL");;
                    break;
                case 2:  System.out.println("SEGELBÅT");;
                    break;
                case 3:  menuPrinter.removeVehiclePrint();
                         menu.removeVehicleFromList();
                    break;
                default: menuPrinter.varNotInMenu();
                         menuPrinter.removeNonMotorizedVehiclePrint();
                         menu.removeNonMotorizedVehicleFromList();
                    break;
            }

    }
                        
                        
    // REMOVE ENDS
    
    
        public static void endProgram() {

        int userChoice = userInput.nextInt();
        
            switch (userChoice) {

                case 1:  menuPrinter.startMenuPrint();
                         menu.startMenu();
                    break;
                case 2:  System.out.println("\nTack för att du använder Fordonsbutiken!");
                    break;
                default: menuPrinter.varNotInMenu();
                         menuPrinter.endProgramPrint();
                         menu.endProgram();
                    break;
            }

    }
        
}