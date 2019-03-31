package bicycles.models;

import bicycles.ride.BikeRideOne;
import bicycles.ride.BikeRideThree;
import bicycles.ride.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoadBikeTest {

    @Test
    public void ShouldBeAbleToAccelerateLess( ) {
            RoadBike roadBike = new RoadBike();
            BikeRideOne bikeRideOne = new BikeRideOne(roadBike);
            bikeRideOne.ride();
            assertEquals(bikeRideOne.currentSpeed(), 36);
        }

    @Test
    public void ShouldBeAbleToAccelerateMore( ) {
        RoadBike roadBike = new RoadBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(roadBike);
        bikeRideTwo.ride();
        assertEquals(bikeRideTwo.currentSpeed(), 62);
    }

    @Test
    public void ShouldBrake( ) {
        RoadBike roadBike = new RoadBike();
        BikeRideThree bikeRideThree = new BikeRideThree(roadBike);
        bikeRideThree.ride();
        assertEquals(bikeRideThree.currentSpeed(), 65);
    }

    @Test
    public void ShouldBrakeMore( ) {
        RoadBike roadBike = new RoadBike();
        BikeRideThree bikeRideThree = new BikeRideThree(roadBike);
        bikeRideThree.ride();
        assertEquals(bikeRideThree.currentSpeed(), 65);
    }



}



