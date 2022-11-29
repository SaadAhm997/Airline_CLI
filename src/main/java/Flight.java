import Interfaces.IFlight;

import java.util.ArrayList;
import java.util.Scanner;

public class Flight {
    private String destination;
    private int id;
    private ArrayList<Passenger> bookedPassengers;

    public Flight(String destination, int id) {
        this.destination = destination;
        this.id = id;
        this.bookedPassengers = new ArrayList<>();
    }

    // Getters and setters
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public void setBookedPassengers(ArrayList<Passenger> bookedPassengers) {
        this.bookedPassengers = bookedPassengers;
    }

    // Methods

    @Override
    public String toString() {
        return "Destination:" + destination + "\'" +
                ", Flight ID: " + id;
    }
}
