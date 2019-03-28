package models;

import bicycles.ride.BikeRideFour;
import bicycles.ride.BikeRideOne;
import bicycles.ride.BikeRideThree;
import bicycles.ride.BikeRideTwo;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemTest {
    @Test
    public void ShouldAccelerate( ) {
        Tandem tandem = new Tandem();
        BikeRideOne bikeRideOne = new BikeRideOne(tandem);
        bikeRideOne.ride();
        assertEquals(bikeRideOne.getcurrent(), 34);
    }

    @Test
    public void ShouldAccelerateMore( ) {
        Tandem tandem = new Tandem();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(tandem);
        bikeRideTwo.ride();
        assertEquals(bikeRideTwo.getcurrent(), 65);
    }


    @Test
    public void ShouldBrakeMore(){
        Tandem tandem = new Tandem();
        BikeRideThree bikeRideThree = new BikeRideThree(tandem);
        bikeRideThree.ride();
        assertEquals(bikeRideThree.getcurrent(), 63);
    }

    @Test
    public void ShouldBrakeLess(){
        Tandem tandem = new Tandem();
        BikeRideFour bikeRideFour = new BikeRideFour(tandem);
        bikeRideFour.ride();
        assertEquals(bikeRideFour.getcurrent(), 32);
    }
}






