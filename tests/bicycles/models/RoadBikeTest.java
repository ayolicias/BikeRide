package bicycles.models;

import bicycles.ride.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoadBikeTest {

    @Test
    public void ShouldREturnRoadBikeCurrentSpeed( ) {
        RoadBike roadBike = new RoadBike();
        BikeRideTwo bikeRide = new BikeRideTwo(roadBike);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 116);
        }

}



