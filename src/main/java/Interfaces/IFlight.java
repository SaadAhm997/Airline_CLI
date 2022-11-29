package Interfaces;

public interface IFlight {

    void addNewFlight(int id);
    String getAvailableFlights();
//    void bookPassenger(Passenger passenger);
    void cancelFlight(int id);

}
