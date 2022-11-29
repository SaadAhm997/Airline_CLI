import Interfaces.IPassenger;
import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Passenger {
    private String name;
    private long phoneNumber;
    private int id;

    public Passenger(String name, long phoneNumber, int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

//    public ArrayList<String> getPassengerList(){
//        unbookedPassengers.add(getName());
//        String idToString = Integer.toString(getId());
//        unbookedPassengers.add(idToString);
//        return unbookedPassengers;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}