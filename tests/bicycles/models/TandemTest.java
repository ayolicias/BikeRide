package bicycles.models;

import bicycles.ride.BikeRideOne;
import bicycles.ride.BikeRideThree;
import bicycles.ride.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class TandemTest {
    @Test
    public void ShouldAccelerate( ) {
        Tandem tandem = new Tandem() {

        };
        BikeRideOne bikeRideOne = new BikeRideOne(tandem);
        bikeRideOne.ride();
        assertEquals(bikeRideOne.currentSpeed(), 34);
    }

    @Test
    public void ShouldAccelerateMore( ) {
        Tandem tandem = new Tandem();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(tandem);
        bikeRideTwo.ride();
        assertEquals(bikeRideTwo.currentSpeed(), 65);
    }


    @Test
    public void ShouldBrakeMore(){
        Tandem tandem = new Tandem();
        BikeRideThree bikeRideThree = new BikeRideThree(tandem);
        bikeRideThree.ride();
        assertEquals(bikeRideThree.currentSpeed(), 63);
    }

}






