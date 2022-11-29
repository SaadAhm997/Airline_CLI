import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {
    private static ArrayList<Passenger> unbookedPassengers = new ArrayList<>();
    private static ArrayList<Flight> availableFlights = new ArrayList<>();
    private static ArrayList<Passenger> bookedPassengers = new ArrayList<>();

    public static void main(String[] args) {

//        Passenger passenger = new Passenger("Name", 123, 1);
//        Flight flight = new Flight("Test", 1);

        boolean exitMenu = true;

        do {System.out.println("Welcome to the BNTA Maverick!");
            System.out.println("Enter 1 to add a new passenger");
            System.out.println("Enter 2 to add a new flight");
            System.out.println("Enter 3 to display all flights");
            System.out.println("Enter 4 to book a passenger onto a flight");
            System.out.println("Enter 5 to cancel a flight");
            while (exitMenu) {
                Scanner scanner = new Scanner(System.in);
                int menuChoice = scanner.nextInt();

                if (menuChoice == 1) {
                    addPassenger();
                    break;
                }
                if (menuChoice == 2) {
                    addNewFlight();
                    break;
                }
                if (menuChoice == 3) {
                    getAvailableFlights();
                    break;
                }
                if (menuChoice == 4) {
                    bookPassenger();
                    break;
                }
                if (menuChoice == 5) {
                    cancelFlight();
                    break;
                }
                if (menuChoice == 10) {
                    exitMenu = false;
                    break;
                }
            }
        } while (exitMenu);
    }

    public static void getAvailableFlights() {
        System.out.println("Available flights: " + availableFlights);
    }

    public static void addNewFlight() {
        System.out.println("Enter your flight destination:");
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        System.out.println("Enter your flight ID:");
        int id = scanner.nextInt();
        System.out.println("Your destination is " + destination);
        System.out.println("Your flight ID is " + id);
        Flight flight = new Flight(destination, id);
        availableFlights.add(flight);
    }

    public static void cancelFlight() {
        /*
        - book a passenger
        - prompt passenger for flight id.
        - check ArrayList availableFlights.
        - if true, remove passenger from list.
        - else, "You are not booked on this flight."
         */
    }

    public static void bookPassenger() {
//        System.out.println("Booked passengers: " + bookedPassengers);
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
//            setName(name);
        System.out.println("What is your phone number?");
        long phoneNumber = scanner.nextInt();
//            setPhoneNumber(phoneNumber);
        System.out.println("What is your personal ID number?");
        int id = scanner.nextInt();
//            setId(id);
        System.out.println("Passenger name: " + name + ", phone number: " + phoneNumber + ", ID: " + id);
        Passenger passenger = new Passenger(name, phoneNumber, id);
        unbookedPassengers.add(passenger);
        System.out.println("Unbooked passengers: " + unbookedPassengers);

//        System.out.println("Enter your id: ");
//        Scanner scanner = new Scanner(System.in);
//        int bookedID = scanner.nextInt();
//        Integer bookedPassenger = new bookedID);
//        if (unbookedPassengers.contains(bookedID)) {
//            bookedPassengers.add(bookedID);
        }

    // unbookedPassengers.contains(bookedID)

    public static void addPassenger() {
            System.out.println("What is your name?");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
//            setName(name);
            System.out.println("What is your phone number?");
            long phoneNumber = scanner.nextInt();
//            setPhoneNumber(phoneNumber);
            System.out.println("What is your personal ID number?");
            int id = scanner.nextInt();
//            setId(id);
            System.out.println("Passenger name: " + name + ", phone number: " + phoneNumber + ", ID: " + id);
            Passenger passenger = new Passenger(name, phoneNumber, id);
            unbookedPassengers.add(passenger);
            System.out.println("Unbooked passengers: " + unbookedPassengers);
        }
    }

