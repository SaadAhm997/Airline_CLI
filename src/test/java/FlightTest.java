import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight;
    ArrayList<Flight> flights;

    @BeforeEach
    public void setUp() {
        Flight flight1 = new Flight("Berlin", 1);
        Flight flight2 = new Flight("Paris", 2);
        Flight flight3 = new Flight("London", 3);
        flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
    }

    @Test
    public void canGetDestination() {
        for(Flight flight : flights) {
            System.out.println(flight.getDestination());
        }
//            assertThat(destination).isEqualTo("Berlin, Paris, London");
    }

    @Test
    public void canGetId() {
        for (Flight flight : flights) {
            System.out.println(flight.getId());
        }

    /*TODO - write following tests for Flight class.
    canGetDestination
    canSetDestination
    canGetId
    canSetId
    canGetBookedPassengers
    canSetBookedPassengers
    canAddNewFlight
    canGetAvailableFlights
    canBookPassenger
    canCancelFlight
     */
    }
}